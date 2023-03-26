import java.util.Scanner;
// Michael Cohen
// Chapter 3: Programming Challenge 13
public class MobileServiceProvider
{
    public static void main(String[] args)
    {
        char letter;
        double a = 39.99;
        double b = 59.99;
        double c = 69.99;
        int minutes;
        double total;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Which package do you have (A, B, or C): ");
        letter = keyboard.next().charAt(0);        
        System.out.println("How many minutes were used this month: ");
        minutes = keyboard.nextInt();        
        switch (letter)
        {
            case 'a':
            case 'A':
               if (minutes > 450)
               {
               total = a + (0.45*(minutes - 450));
               System.out.printf("Your total is: $%.2f \n", total);
               break;
               }
               else
               {
               total = a;
               System.out.printf("Your total is: $%.2f \n", total);
               break;
               }     
            case 'b':
            case 'B':
               if (minutes > 900)
               {
               total = b + (0.40*(minutes - 900));
               System.out.printf("Your total is: $%.2f \n", total);
               break;
               }
               else
               {
               total = b;
               System.out.printf("Your total is: $%.2f \n", total);
               break;
               }
            case 'c':
            case 'C':
               total = c;
               System.out.printf("Your total is: $%.2f \n", total);
               break;
            default:
               System.out.println("Invalid letter.");              
        }       
    }
}