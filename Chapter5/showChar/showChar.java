import java.util.Scanner;

// Michael Cohen
// Chapter 5: Programming Challenge 1

public class showChar
{
    public static void showChar(String word, int position)
    {
        char letter = word.charAt(position); 
      	System.out.println(letter);
    }
    
  	public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a line of text: ");
      String word = keyboard.nextLine();
      System.out.print("Enter your index: ");
      int position = keyboard.nextInt();
      showChar(word, position);
    }
  	
}