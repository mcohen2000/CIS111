import java.util.Scanner;
import java.util.Random;
// Michael Cohen
// Chapter 4: Programming Challenge 19

public class ESPGame
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    String color = "";
    String guess;
    int number;
    int count = 0;
    int correct = 0;
    
    for (count = 0; count < 10; count++)
            {
                number = rand.nextInt(5);
    
                if (number == 0)
                  color = "Red";
                if (number == 1)
                  color = "Green";
                if (number == 2)
                  color = "Blue";
                if (number == 3)
                  color = "Orange";
                if (number == 4)
                  color = "Yellow";
    
    
                System.out.print("Enter a color: ");
                guess = keyboard.nextLine();
    
                
                if (guess.equals(color))
                    {
                    correct++;
                    System.out.println("You guessed right!");
                    }
                else
                  System.out.println("The correct color was: " + color);
            } 
    System.out.println("You guessed the color correct " + correct + " times.");
    }
}
