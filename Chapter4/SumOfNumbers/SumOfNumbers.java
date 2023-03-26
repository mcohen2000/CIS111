import java.util.Scanner;

// Michael Cohen
// Chapter 4: Programming Challenge 1

public class SumOfNumbers
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
    for (count = 0; count <= num; ++count)
    {
    sum += count;
    }
    System.out.println("The sum is equal to: " + sum);
    }
}