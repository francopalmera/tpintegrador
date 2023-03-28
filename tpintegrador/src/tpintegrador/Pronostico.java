/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpintegrador;

/**
 *
 * @author ANITA
 */
public class Pronostico {
    
    private int idParticipante;
    private int idPartido;
    private int equipo;
    private String resultado;

    public Pronostico(int idParticipante, int idPartido, int equipo, String resultado) {
        this.idParticipante = idParticipante;
        this.idPartido = idPartido;
        this.equipo = equipo;
        this.resultado = resultado;
    }
    
    

    public int getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(int idParticipante) {
        this.idParticipante = idParticipante;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "PronosticoDeportivo{" + "idParticipante=" + idParticipante + ", idPartido=" + idPartido + ", equipo=" + equipo + ", resultado=" + resultado + '}';
    }
}
