import java.util.Scanner;

// Michael Cohen
// Chapter 3: Programming Challenge 17


public class WiFiDiagnosticTree
{
    public static void main(String[] args)
    {
        String response1;
        String response2;
        String response3;
        String response4 = " "; //Weird error if I didnt add " = ' '  "
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Reboot the computer and try to connect. \nDid that fix the problem? ");
        response1 = keyboard.nextLine();
        if (response1.equalsIgnoreCase("yes"))
        {
               System.out.print("Good!");
        }
        else if (response1.equalsIgnoreCase("no")) 
        {    
               System.out.print("Reboot the router and try to connect. \nDid that fix the problem? ");
               response2 = keyboard.nextLine();
               if (response2.equalsIgnoreCase("no"))
                  {
                  System.out.print("Make sure the cables between the router & modem are plugged in firmly. \nDid that fix the problem? ");
                  response3 = keyboard.nextLine();
                  if (response3.equalsIgnoreCase("no"))
                     {
                     System.out.print("Move the router to a new location and try to connect. \nDid that fix the problem? ");
                     response4 = keyboard.nextLine();
                     }
                     if (response4.equalsIgnoreCase("no"))
                        {
                         System.out.print("Get a new router.");
                        }
                  }
            
            }
     }
}