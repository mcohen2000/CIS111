import java.util.Scanner;
public class Test2
{
    public static void main(String[] args)
    {
        int quantity;
        int cost;
        double discount = 0;
        double totalDiscount;
        double total;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of packages purchased: ");
        quantity = keyboard.nextInt();
        cost = quantity * 99;
      
        if (quantity < 0)
        {
            System.out.println("Invalid number.");
        }
        else {
            if (quantity < 10)
            {
                discount = 0;
            }            
            else if (quantity <= 19)
            {
                discount = .2;
            }
            else if (quantity >= 20 && quantity <= 49)
            {
                discount = .3;
            }
            else if (quantity >= 50 && quantity <= 99)
            {
                discount = .4;
            }
            else if (quantity >= 100)
            {
                discount = .5;
            }
        }
                totalDiscount = cost * discount;
                total = cost - totalDiscount;
                System.out.printf("Your discount is: $%.2f%n", totalDiscount);
                System.out.printf("Your total is: $%.2f%n", total);
            
    }
}