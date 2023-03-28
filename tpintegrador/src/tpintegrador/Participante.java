package tpintegrador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BUBY
 */
import java.util.List;

public class Participante {
    private int idParticipante;
    private String nombre;
    //private List<ListaPronosticos> pronosticos;
    //private int puntaje;

    public Participante(int idParticipante, String nombre) {
        this.idParticipante = idParticipante;
        this.nombre = nombre;
        //this.pronosticos = pronosticos;
        //this.puntaje = puntaje;
    }

    public int getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(int idParticipante) {
        this.idParticipante = idParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /* public List<ListaPronosticos> getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(List<ListaPronosticos> pronosticos) {
        this.pronosticos = pronosticos;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }*/
    
    @Override
    public String toString() {
        return "Participante{" + "idParticipante=" + idParticipante + ", nombre=" + nombre + '}';
    }
}
