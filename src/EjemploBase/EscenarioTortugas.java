/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

/**
 *
 * @author Estudiante
 */
public class EscenarioTortugas extends TurtleFrame{
    Turtle tortuga1 = null;
    Turtle tortuga2 = null;
    Turtle tortugavn =  null;
    Turtle turtleporti = null;
    
    public EscenarioTortugas() {
      tortuga1 = new Turtle(this);
      tortuga2 = new Turtle(this);
      tortugavn = new Turtle(this);
      turtleporti = new Turtle(this);
    }
    
    public void iniciar(){
       HiloBase hilo = new HiloBase(tortuga1);
       hilo.start();
       Hilo2 hilo2 = new Hilo2(tortuga2);
       hilo2.start();   
       HiloPrueba hilo3 = new HiloPrueba(tortugavn);
       hilo3.start();
       HiloCasaIzquierda hilo4 = new HiloCasaIzquierda(turtleporti);
       hilo4.start();
    }
    
    
    public static void main(String[] args) {
        EscenarioTortugas escenario = new EscenarioTortugas();
        escenario.iniciar();        
    }
}
