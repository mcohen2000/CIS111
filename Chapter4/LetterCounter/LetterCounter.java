import java.util.Scanner;

// Michael Cohen
// Chapter 4: Programming Challenge 5

public class LetterCounter
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    String str;
    char character;
    int count = 0;
    
    System.out.print("Enter a string: ");
    str = keyboard.nextLine();
    
    System.out.print("Enter a character: ");
    character = keyboard.nextLine().charAt(0);
    
    for (int location = 0; location < str.length(); location++)
            {
                if (str.charAt(location) == character)
                    count++;
            } 
    System.out.println("'" + character + "' appears " + count + " times in the string.");
    }
}
