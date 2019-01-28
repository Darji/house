
/**
 * Write a description of class MyPicture here.
 *
 * @author (Akash Darji)
 * @version (0.0.1)
 * Comment: Work in progress. Creating a new variable. 
 */
public class MyPicture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    //private Door;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public MyPicture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        //door= new Door();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("black");
            wall.makeVisible();
            
            window.changeColor("white");
            window.moveHorizontal(-120);
            window.moveVertical(20);
            window.changeSize(60);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("red");
            sun.moveHorizontal(-80);
            sun.moveVertical(-40);
            sun.changeSize(25);
            sun.makeVisible();
            /*
            door.changeColor("blue");
            door.moveHorizontal(-80);
            door.moveVertical(-40);
            door.changeSize(30);
            door.makeVisible();
            
             sun.changeColor("blue");
            sun.moveHorizontal(101);
            sun.moveVertical(-41);
            sun.changeSize(80);
            sun.makeVisible();
            
             sun.changeColor("purple");
            sun.moveHorizontal(102);
            sun.moveVertical(-42);
            sun.changeSize(80);
            sun.makeVisible();
            
             sun.changeColor("black");
            sun.moveHorizontal(103);
            sun.moveVertical(-43);
            sun.changeSize(80);
            sun.makeVisible();
            */
            drawn = true;
        }
    }
}
