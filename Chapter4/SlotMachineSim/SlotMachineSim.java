import java.util.Scanner;
import java.util.Random;
// Michael Cohen
// Chapter 4: Programming Challenge 22

public class SlotMachineSim
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    Scanner keyboard2 = new Scanner(System.in);
    Random rand = new Random();
    String image = "";
    String slot1 = "";
    String slot2 = "";
    String slot3 = "";
    String replay = "yes";
    int number;
    int multiplier = 0;
    int count = 0;
    double bet;
    double totalbets = 0;
    double totalprofits = 0;
    while (replay.equalsIgnoreCase("yes")){
    System.out.print("Enter the amount that you would like to bet: ");
    bet = keyboard.nextDouble();
    totalbets += bet;
    System.out.println("-----------------------------------------------");
    for (count = 0; count < 3; count++)
            {
                number = rand.nextInt(5);
    
                if (number == 0)
                  image = "Cherries";
                  
                if (number == 1)
                  image = "Oranges";
                if (number == 2)
                  image = "Plums";
                if (number == 3)
                  image = "Bells";
                if (number == 4)
                  image = "Melons";
                if (number == 5)
                  image = "Bars";
                if (count == 0)
                     {
                     slot1 = image;
                     }
                else if (count == 1)
                     {
                     slot2 = image;
                     }
                else if (count == 2)
                     {
                     slot3 = image;
                     }
               
            } 
    System.out.println(slot1);
    System.out.println(slot2);
    System.out.println(slot3);
    System.out.println("-----------------------------------------------");
    if (!slot1.equals(slot2) && !slot1.equals(slot3) && !slot2.equals(slot3))
      multiplier = 0;
    if (slot1.equals(slot2) || slot1.equals(slot3) || slot2.equals(slot3))
      multiplier = 2;
    if (slot1.equals(slot2) && slot1.equals(slot3))
      multiplier = 3;
    System.out.println("You have earned $" + (bet*multiplier));
    totalprofits += (bet*multiplier); 
    System.out.print("Would you like to play again (enter yes/no): ");
    replay = keyboard2.nextLine();
    if (replay.equalsIgnoreCase("no"))
      break;
    
    }
    System.out.println("Total money entered: $" + totalbets);
    System.out.println("Total money won: $" + (totalprofits - totalbets));
    }
}
