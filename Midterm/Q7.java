import java.util.Scanner;


// Michael Cohen
// Midterm Q7

public class Q7
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      String input;
     
      System.out.println("Enter a word: ");
      
      input = keyboard.nextLine();
      for (int location = 0; location < input.length(); location++)
            {
                if (input.charAt(location) == 'z')
                    System.out.println("Weird word!");
            }
      if ((input.charAt(input.length() - 1) == 't') && (input.charAt(input.length() - 2) == 's') && (input.charAt(input.length() - 3) == 'e'))
            System.out.println("Superlative!"); 

      System.out.println(5 * input.length());
      }
}