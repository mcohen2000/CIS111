import java.util.Scanner;

// Michael Cohen
// Chapter 2: Programming Challenge 20
public class PlantingGrapevines
{
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        double vines; 
        double length;
        double endpost;
        double space;
        
        System.out.println("What is the length of the row in feet?");
        length = keyboard.nextDouble();
        
        System.out.println("How much space is used by an end-post assembly in feet?");
        endpost = keyboard.nextDouble();
        
        System.out.println("How much is there in between vines in feet?");
        space = keyboard.nextDouble();
        
        vines = (length - (2 * endpost))/space;
        System.out.println(vines + " grapevines will fit into this row.");
        
    }
}