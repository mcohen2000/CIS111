import java.util.Scanner;
import java.util.Random;
// Michael Cohen
// Chapter 4: Programming Challenge 17

public class RNGGame
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    int guess;
    int number = rand.nextInt(10); //The random number is set to the range of (0-9) for testing.
    
    do {
                
        System.out.print("Guess a random number: ");
        guess = keyboard.nextInt();
                    
        if (guess < number)
           System.out.println("Too low, try again.");
        if (guess > number)
           System.out.println("Too high, try again.");
                
        } while(guess != number);
        
    System.out.println("You guessed the correct number.");
    }
}
