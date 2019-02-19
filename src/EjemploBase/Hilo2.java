/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;
import java.awt.Color;

/**
 *
 * @author Estudiante
 */
public class Hilo2 extends Thread {

    private Turtle tortuga;

    public Hilo2(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        
        this.tortuga.setColor(Color.yellow);
        this.tortuga.setPos(-100,-100);
        this.tortuga.setPenColor(Color.black);
        /*int i = 0;            //Starting value
        while (i < 4) //Condition
        {
            this.tortuga.forward(100);   //Actions
            this.tortuga.right(90);
            i++;                //Increasing starting value
        }*/
        
        for(int j=0; j<360; j++){
            this.tortuga.forward(1);
            this.tortuga.right(1);
        }
        
        
        
    }
}
