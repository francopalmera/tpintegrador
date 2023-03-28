/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpintegrador;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListaParticipantes {
    //atributos
    private List<Participante> participante;
    private String participantesCSV;
    //private ArrayList<ListaPronosticos> pronosticos;

    public ListaParticipantes(List<Participante> participante, String participantesCSV) {
        this.participante = participante;
        this.participantesCSV = participantesCSV;
    }
    
        public ListaParticipantes() {
        this.participante = new ArrayList<Participante>();
        this.participantesCSV = "participantes.csv";
    }

    public List<Participante> getParticipantes() {
        return this.participante;
    }
    
    public void setParticipantes(ArrayList<Participante> participantes){
        this.participante = participantes;
    }
    
        public String getParticipantesCSV() {
        return participantesCSV;
    }

    public void setParticipantesCSV(String participantesCSV) {
        this.participantesCSV = participantesCSV;
    }

    /*public ArrayList<ListaPronosticos> getPronosticos() {
        return this.pronosticos;
    }
   

    public void addPronostico(ListaPronosticos pronostico) {
        this.pronosticos.add(pronostico);
    }

    public String toString() {
        return this.nombre;
    }

    public void setPronosticos(ListaPronosticos[] prons) {
        this.pronosticos = pronosticos;
        
    } */
    
    // add y remove elementos
    public void addParticipante(Participante e) {
        this.participante.add(e);
    }
    public void removeEquipo(Equipo e) {
        this.participante.remove(e);
    }

    @Override
    public String toString() {
        return "ListaParticipantes{" + "participante=" + participante + '}';
    }

    public String listar() {
        String lista = "";
        for (Participante participante: participante) {
            lista += "\n" + participante;
        }           
        return lista;
    }
    
    // cargar desde el archivo
    public void cargarDeArchivo() {
        // para las lineas del archivo csv
        String datosParticipante;
        // para los datos individuales de cada linea
        String vectorParticipante[];
        // para el objeto en memoria
        Participante participante;
        int fila = 0;
       
        try { 
            Scanner sc = new Scanner(new File("./csv/participantes.csv"));
            sc.useDelimiter("\n");   //setea el separador de los datos
                
            while (sc.hasNext()) {
                // levanta los datos de cada linea
                datosParticipante = sc.next();
                System.out.println(datosParticipante);  //muestra los datos levantados 
                fila ++;
                // si es la cabecera la descarto y no se considera para armar el listado
                if (fila == 1)
                    continue;              
                 
                //Proceso auxiliar para convertir los string en vector
                // guarda en un vector los elementos individuales
                vectorParticipante = datosParticipante.split(",");   
                
                // graba el equipo en memoria
                //convertir un string a un entero;
                int idParticipante = Integer.parseInt(vectorParticipante[0]);
                String nombre = vectorParticipante[1];
                // crea el objeto en memoria
                participante = new Participante(idParticipante, nombre);
                
                // llama al metodo add para grabar el equipo en la lista en memoria
                this.addParticipante(participante);
            }
            //closes the scanner
        } catch (IOException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        }       

    }

   

    
}
    

