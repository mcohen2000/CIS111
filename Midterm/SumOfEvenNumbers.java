import java.util.Scanner;

// Michael Cohen
// Midterm Question 3

public class SumOfEvenNumbers
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    int num;
    do {
    System.out.print("Enter a nonzero positive integer: ");
    num = keyboard.nextInt();
    } while(num < 1);
    
    int count;
    int sum = 0;
    for (count = 0; count <= num; count += 2)
    {
    sum += count;
    }
    System.out.println("The sum is equal to: " + sum);
    }
}