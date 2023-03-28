/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpintegrador;


public class Partido {
    //atributos
    private int idPartido, idEquipo1, idEquipo2, GolesEquipo1, GolesEquipo2;
    
    public Partido(int idPartido, int idEquipo1, int idEquipo2, int GolesEquipo1, int GolesEquipo2) {
        this.idPartido = idPartido;
        this.idEquipo1 = idEquipo1;
        this.idEquipo2 = idEquipo2;
        this.GolesEquipo1 = GolesEquipo1;
        this.GolesEquipo2 = GolesEquipo2;
    }
    
    
    
    

/*    private ListaEquipos equipo1;
    private ListaEquipos equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

      public Partido() {
      }
      
    public Partido(ListaEquipos equipo1, ListaEquipos equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
  
    public ListaEquipos getEquipo1() {
        return this.equipo1;
    }

    public ListaEquipos getEquipo2() {
        return this.equipo2;
    }

    public int getGolesEquipo1() {
        return this.golesEquipo1;
    }

    public int getGolesEquipo2() {
        return this.golesEquipo2;
    }

    public void setEquipo1(ListaEquipos equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(ListaEquipos equipo2) {
        this.equipo2 = equipo2;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public void setResultado(int golesEquipo1, int golesEquipo2) {
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public String toString() {
        String res = 
                "-----------------------------------------\n"+
                this.equipo1.getEquipos()+" vs. "+this.equipo2.getEquipos()+"\n"+
                "Resultado: "+this.golesEquipo1+ " a "+this.golesEquipo2+"\n"+
                "-----------------------------------------\n";
        return res;
    }
    
    public char getResultado (ListaEquipos equipo) {
        char resultado = 'X'; // POR DEFECTO NO SE SABE QUIEN GANO
        
        if (equipo.getEquipos().equals(equipo1.getEquipos())) {
            if (this.golesEquipo1 > this.golesEquipo2) {
                resultado = 'G';
            } else if (this.golesEquipo1 < this.golesEquipo2) {
                resultado = 'P';
            } else {
                resultado = 'E';
            }
        } else if (equipo.getEquipos().equals(equipo2.getEquipos())) {
            if (this.golesEquipo2 > this.golesEquipo1) {
                resultado = 'G';
            } else if (this.golesEquipo2 < this.golesEquipo1) {
                resultado = 'P';
            } else {
                resultado = 'E';
            }
        } 
        return resultado;
    }*/

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getIdEquipo1() {
        return idEquipo1;
    }

    public void setIdEquipo1(int idEquipo1) {
        this.idEquipo1 = idEquipo1;
    }

    public int getIdEquipo2() {
        return idEquipo2;
    }

    public void setIdEquipo2(int idEquipo2) {
        this.idEquipo2 = idEquipo2;
    }

    public int getGolesEquipo1() {
        return GolesEquipo1;
    }

    public void setGolesEquipo1(int GolesEquipo1) {
        this.GolesEquipo1 = GolesEquipo1;
    }

    public int getGolesEquipo2() {
        return GolesEquipo2;
    }

    public void setGolesEquipo2(int GolesEquipo2) {
        this.GolesEquipo2 = GolesEquipo2;
    }

    @Override
    public String toString() {
        return "Partido{" + "idPartido=" + idPartido + ", idEquipo1=" + idEquipo1 + ", idEquipo2=" + idEquipo2 + ", GolesEquipo1=" + GolesEquipo1 + ", GolesEquipo2=" + GolesEquipo2 + '}';
    }
    
    
}
