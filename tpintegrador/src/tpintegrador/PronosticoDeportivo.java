/*
Para entrega 2
 */
package tpintegrador;


/**
 *
 * @author aguzman
 */
public class PronosticoDeportivo {
    private ListaEquipos equipos;
    private ListaParticipantes participantes;
    private ListaPartidos partidos;
    private ListaPronosticos pronosticos;

    
      
    
    
    public PronosticoDeportivo() {
        equipos = new ListaEquipos();
        participantes = new ListaParticipantes();
        partidos = new ListaPartidos();
        pronosticos = new ListaPronosticos();
    }

    public void play(){
        // cargar y listar los equipos
        equipos.cargarDeArchivo();
        System.out.println("Los equipos cargados son: " + equipos.listar());
        
        System.out.println("\n" + "====================*****=====================" + "\n");
        
        participantes.cargarDeArchivo();
        System.out.println("Los participantes cargados son: " + participantes.listar());
        
        System.out.println("\n" + "====================*****=====================" + "\n");
        
        partidos.cargarDeArchivo();
        System.out.println("Los partidos cargados son: " + partidos.listar());
        
        System.out.println("\n" + "====================*****=====================" + "\n");
        
        pronosticos.cargarDeArchivo();
        System.out.println("Los partidos cargados son: " + pronosticos.listar()); 
        
    }    
    
 
}
