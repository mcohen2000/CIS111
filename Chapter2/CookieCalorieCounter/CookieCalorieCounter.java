import java.util.Scanner;

// Michael Cohen
// Chapter 2: Programming Project 2


public class CookieCalorieCounter
{
    public static void main(String[] args)
    {
        int cookies;
        int cIntake;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter number of cookies eaten: ");
        cookies = keyboard.nextInt();
        
        cIntake = 3000 * cookies / 40;
        System.out.println("Your calorie intake was: " + cIntake + " calories.");
    }
}