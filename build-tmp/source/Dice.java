import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die one;
Die two;
public void setup()
{
    size(500,500);
    noLoop();
    background(255, 0, 180);
}
public void draw()
{
    one = new Die (190,225);
    two = new Die(260,225);
    one.showCube();
    one.roll();
    two.showCube();
    two.roll();
   }
public void mousePressed()
{
    redraw();
}
class Die //models one single dice cube
{
    int DieX, DieY, DieNumber;
    Die(int x, int y) //constructor
    {
        DieX = x;
        DieY = y;
        DieNumber = (int)(Math.random()*6) + 1;
    }
    public void roll()
    {
        fill(0);
        strokeWeight(1);
      
       if (DieNumber == 1) 
       {
        ellipse(DieX +25 , DieY + 25, 10, 10);
       }

       
       if (DieNumber == 2) 
       {
        ellipse(DieX +15 , DieY + 25, 10, 10);
        ellipse(DieX +35 , DieY + 25, 10, 10);

       }


       if (DieNumber == 3) 
       {
        ellipse(DieX +25 , DieY + 15, 10, 10);
        ellipse(DieX +15 , DieY + 35, 10, 10);
        ellipse(DieX +35 , DieY + 35, 10, 10);

       }


       if (DieNumber == 4) 
       {
        ellipse(DieX +15 , DieY + 15, 10, 10);
        ellipse(DieX +35 , DieY + 15, 10, 10);
        ellipse(DieX +15 , DieY + 35, 10, 10);
        ellipse(DieX +35 , DieY + 35, 10, 10);
       }


       if (DieNumber == 5) 
       {
        ellipse(DieX +25 , DieY + 25, 10, 10);
        ellipse(DieX +10 , DieY + 10, 10, 10);
        ellipse(DieX +40 , DieY + 10, 10, 10);
        ellipse(DieX +10 , DieY + 40, 10, 10);
        ellipse(DieX +40 , DieY + 40, 10, 10);
       }


       if (DieNumber == 6) 
       {
        ellipse(DieX +15 , DieY + 25, 10, 10);
        ellipse(DieX +35 , DieY + 25, 10, 10);
        ellipse(DieX +15 , DieY + 10, 10, 10);
        ellipse(DieX +35 , DieY + 10, 10, 10);
        ellipse(DieX +15 , DieY + 40, 10, 10);
        ellipse(DieX +35 , DieY + 40, 10, 10);
       }
    }
    public void showCube()
    {
        fill(255);
        strokeWeight(2.5f);
        rect(DieX, DieY, 50, 50);
    }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
