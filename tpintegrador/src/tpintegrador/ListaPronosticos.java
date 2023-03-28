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

public class  ListaPronosticos {
    private List<Pronostico> pronostico;
    private String pronosticosCSV;
    
    public ListaPronosticos(List<Pronostico> partido, String pronosticosCSV) {
        this.pronostico = pronostico;
        this.pronosticosCSV = pronosticosCSV;
    }

    public ListaPronosticos() {
        this.pronostico = new ArrayList<Pronostico>();
        this.pronosticosCSV = "pronosticos.csv";
    }
    
        public List<Pronostico> getPronosticos() {
        return this.pronostico;
    }
    
    public void setPartidos(List<Pronostico> pronosticos){
        this.pronostico = pronosticos;
    }
    
    public String getPronosticosCSV() {
        return pronosticosCSV;
    }

    public void setPronosticosCSV(String pronosticoCSV) {
        this.pronosticosCSV = pronosticoCSV;
    }

    
    public void addPronostico(Pronostico e) {
        this.pronostico.add(e);
    }

    public void removePronostico(Pronostico e) {
        this.pronostico.remove(e);
    }

    @Override
    public String toString() {
        return "ListaPronostico{" + "pronostico=" + pronostico + '}';
    }

    public String listar() {
        String lista = "";
        for (Pronostico pronostico: pronostico) {
            lista += "\n" + pronostico;
        }           
        return lista;
    }
    
    // cargar desde el archivo
    public void cargarDeArchivo() {
        // para las lineas del archivo csv
        String datosPronostico;
        // para los datos individuales de cada linea
        String vectorPronostico[];
        // para el objeto en memoria
        Pronostico pronostico;
        int fila = 0;
       
        try { 
            Scanner sc = new Scanner(new File("https://drive.google.com/file/d/1DtwekEnshVxpCCz-N7ummdMQAO1kfH4S/view?usp=sharing"));
            sc.useDelimiter("\n");   //setea el separador de los datos
                
            while (sc.hasNext()) {
                // levanta los datos de cada linea
                datosPronostico = sc.next();
                System.out.println(datosPronostico);  //muestra los datos levantados 
                fila ++;
                // si es la cabecera la descarto y no se considera para armar el listado
                if (fila == 1)
                    continue;              
                 
                //Proceso auxiliar para convertir los string en vector
                // guarda en un vector los elementos individuales
                vectorPronostico = datosPronostico.split(",");   
                
                // graba el equipo en memoria
                //convertir un string a un entero;
                int idParticipante = Integer.parseInt(vectorPronostico[0]);
                int idPartido = Integer.parseInt(vectorPronostico[1]);
                int Equipo = Integer.parseInt(vectorPronostico[2]);
                String Resultado = vectorPronostico[3];
                // crea el objeto en memoria
                pronostico = new Pronostico(idParticipante, idPartido, Equipo, Resultado);
                
                // llama al metodo add para grabar el equipo en la lista en memoria
                this.addPronostico(pronostico);
            }
            //closes the scanner
        } catch (IOException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        }       

    }

}