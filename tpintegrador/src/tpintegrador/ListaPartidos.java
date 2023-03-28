package tpintegrador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPartidos {
    private List<Partido> partido;
    private String partidosCSV;
    
    public ListaPartidos(List<Partido> partido, String partidosCSV) {
        this.partido = partido;
        this.partidosCSV = partidosCSV;
    }

    public ListaPartidos() {
        this.partido = new ArrayList<Partido>();
        this.partidosCSV = "partidos.csv";
    }
    
        public List<Partido> getPartidos() {
        return this.partido;
    }
    
    public void setPartidos(ArrayList<Partido> partidos){
        this.partido = partidos;
    }
    
    public String getPartidosCSV() {
        return partidosCSV;
    }

    public void setPartidosCSV(String partidosCSV) {
        this.partidosCSV = partidosCSV;
    }

    
    public void addPartido(Partido e) {
        this.partido.add(e);
    }

    public void removePartido(Partido e) {
        this.partido.remove(e);
    }

    @Override
    public String toString() {
        return "ListaPartidos{" + "partido=" + partido + '}';
    }

    public String listar() {
        String lista = "";
        for (Partido partido: partido) {
            lista += "\n" + partido;
        }           
        return lista;
    }
    
    // cargar desde el archivo
    public void cargarDeArchivo() {
        // para las lineas del archivo csv
        String datosPartido;
        // para los datos individuales de cada linea
        String vectorPartido[];
        // para el objeto en memoria
        Partido partido;
        int fila = 0;
       
        try { 
            Scanner sc = new Scanner(new File("https://drive.google.com/file/d/1I9jvqZlAsQqu2hi-pmv-BavUJTYi5s8U/view?usp=sharing"));
            sc.useDelimiter("\n");   //setea el separador de los datos
                
            while (sc.hasNext()) {
                // levanta los datos de cada linea
                datosPartido = sc.next();
                System.out.println(datosPartido);  //muestra los datos levantados 
                fila ++;
                // si es la cabecera la descarto y no se considera para armar el listado
                if (fila == 1)
                    continue;              
                 
                //Proceso auxiliar para convertir los string en vector
                // guarda en un vector los elementos individuales
                vectorPartido = datosPartido.split(",");   
                
                // graba el equipo en memoria
                //convertir un string a un entero;
                int idPartido = Integer.parseInt(vectorPartido[0]);
                int idEquipo1 = Integer.parseInt(vectorPartido[1]);
                int idEquipo2 = Integer.parseInt(vectorPartido[2]);
                int GolesEquipo1 = Integer.parseInt(vectorPartido[3]);
                int GolesEquipo2 = Integer.parseInt(vectorPartido[4]);
                // crea el objeto en memoria
                partido = new Partido(idPartido, idEquipo1, idEquipo2, GolesEquipo1, GolesEquipo2);
                
                // llama al metodo add para grabar el equipo en la lista en memoria
                this.addPartido(partido);
            }
            //closes the scanner
        } catch (IOException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        }       

    }

}
