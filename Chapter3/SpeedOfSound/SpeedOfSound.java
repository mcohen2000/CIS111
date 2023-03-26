import java.util.Scanner;

// Michael Cohen
// Chapter 3: Programming Challenge 12

public class SpeedOfSound
{
    public static void main(String[] args)
    {
        String medium;
        int air = 1100;
        int water = 4900;
        int steel = 16400;
        double distance;
        double time;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter one of the following mediums (air, water, or steel): ");
        medium = keyboard.nextLine();
        
        System.out.println("Enter the distance of the medium (in feet): ");
        distance = keyboard.nextDouble();
        
        if (medium.equals("air"))
        {
            time = distance / air;
            System.out.printf("It will take %f seconds to travel through the medium.\n", time);
        }
        else if (medium.equals("water"))
        {
            time = distance / water;
            System.out.printf("It will take %f seconds to travel through the medium.\n", time);
        }
        else if (medium.equals("steel"))
        {
            time = distance / steel;
            System.out.printf("It will take %f seconds to travel through the medium.\n", time);
        }
        
    }
}