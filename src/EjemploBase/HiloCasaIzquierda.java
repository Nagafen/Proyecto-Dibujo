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
public class HiloCasaIzquierda extends Thread {

    private Turtle joe;

    public HiloCasaIzquierda(Turtle tortuga) {
        this.joe = tortuga;
    }

    @Override
    public void run() {

        int i = 0;            //Starting value

        joe.forward(80);
        joe.right(90);
        joe.forward(40);

        // pequeña
        joe.left(90);
        joe.forward(20);
        joe.right(90);
        joe.forward(20);
        joe.right(90);
        joe.forward(20);
        joe.right(90);
        joe.forward(20);

        //circulo
        joe.penUp();
        joe.right(135);
        joe.forward(8);
        joe.penDown();
        joe.left(90);
        for (int j = 0; j < 360; j++) {
            joe.forward(0.1);
            joe.right(1);

        }
        joe.penUp();
        joe.left(90);
        joe.forward(8);
        joe.left(135);
        joe.penDown();

        joe.forward(40);

        joe.right(90);
        joe.forward(40);
        joe.right(90);
        joe.forward(10);
        joe.left(90);
        joe.forward(40);
        joe.right(90);
        joe.forward(70);

    }
}
