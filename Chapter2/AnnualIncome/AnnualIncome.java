import java.util.Scanner;

// Michael Cohen
// Chapter 2: Programming Challenge 1
public class AnnualIncome
{
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        double annualPay;
        
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        
        System.out.println("What is your age?");
        age = keyboard.nextInt();
        
        System.out.println("What is your desired annual income?");
        annualPay = keyboard.nextDouble();
        
        System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn $" + annualPay + " per year.");
        
    }
}