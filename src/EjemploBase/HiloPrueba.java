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
public class HiloPrueba extends Thread {

    private Turtle tortuga;

    public HiloPrueba(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            this.tortuga.setPos(-10, 10);
            this.tortuga.forward(15);
            this.tortuga.right(90);
            this.tortuga.forward(10);
            this.tortuga.right(90);
            this.tortuga.forward(15);
            this.tortuga.right(90);
            this.tortuga.forward(10);
        }
    }
}
