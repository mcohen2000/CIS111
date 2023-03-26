import java.util.Scanner;


// Michael Cohen
// Midterm Q6

public class Q6
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      int input = 1;
      
      
      while (input != 0){
         System.out.println("Enter a series of numbers: ");
      
         input = keyboard.nextInt();
         if (input == 0) //fixes glitch where FIZZBUZZ is printed before end of program.
            break;
         if (input % 3 == 0)
            System.out.print("FIZZ");
         if (input % 5 == 0)
            System.out.print("BUZZ");
         if (input % 3 != 0 && input % 5 != 0)
            System.out.print(input);
         System.out.println();
      }
      
     }
}