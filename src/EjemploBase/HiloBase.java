/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import Pedro.*;
import ch.aplu.turtle.Turtle;

/**
 *
 * @author Estudiante
 */
public class HiloBase extends Thread {

    private Turtle tortuga;

    public HiloBase(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        this.tortuga.setPos(70,0);
        this.tortuga.back(10);
        this.tortuga.right(90);
        this.tortuga.forward(40);
        this.tortuga.left(90);
        this.tortuga.forward(110);
        this.tortuga.left(90);
        this.tortuga.forward(40);
        this.tortuga.left(90);
        this.tortuga.forward(20);
        this.tortuga.back(20);
        this.tortuga.right(90);
        this.tortuga.forward(5);
        this.tortuga.right(150);
        this.tortuga.forward(30);
        this.tortuga.right(60);
        this.tortuga.forward(30);
        this.tortuga.right(150);
        this.tortuga.forward(20);
        this.tortuga.hideTurtle();
        
    }
}
