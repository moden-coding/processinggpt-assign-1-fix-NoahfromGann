import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void settings() {
        size(400, 400);

    }

    public void setup() {
        background(600);
        
        stroke(0, 250, 0);
        strokeWeight(10);
        fill(10,10,200);
        rect(50, 50, 200, 100);

        fill(255, 0, 0);
        
        
        
        
        ellipse(400, 300, 100, 100);

        stroke(0);
        strokeWeight(5);
        line(150, 100, 400, 250);

    } 
}

