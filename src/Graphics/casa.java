package Graphics;

//Tu2.java
import ch.aplu.turtle.*;

class casa
{
Turtle joe = new Turtle();

casa()
{
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
// while (i < 4)         //Condition
// {
//   joe.forward(100);   //Actions
//   joe.right(90);
//   i++;                //Increasing starting value
// }
}

public static void main(String[] args)
{
 new casa();
}
}
