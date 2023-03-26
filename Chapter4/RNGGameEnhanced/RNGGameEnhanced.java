import java.util.Scanner;
import java.util.Random;
// Michael Cohen
// Chapter 4: Programming Challenge 18

public class RNGGameEnhanced
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    int count = 0;
    int guess;
    int number = rand.nextInt(2); //The random number is set to the range of (0-1) for testing.
    
    do {
                
        System.out.print("Guess a random number: ");
        guess = keyboard.nextInt();
                    
        if (guess < number)
           {
           System.out.println("Too low, try again.");
           count++;
           }
        if (guess > number)
           {
           System.out.println("Too high, try again.");
           count++;
           }
                
        } while(guess != number);
    count++;    
    System.out.println("You guessed the correct number after " + count + " guesses.");
    }
}
 