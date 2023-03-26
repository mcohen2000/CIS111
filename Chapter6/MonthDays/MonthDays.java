// Michael Cohen
// Chapter 6: Programming Challenge 9

import java.util.Scanner;

public class MonthDays
{
    private int month;
    private int year;
    private int days;
    
    public MonthDays(int month, int year)
    {
        this.month = month;
        this.year = year;
    }
    
    public int numberOfDays()
    {
        int days = 0;
        if (month == 1)
        {
           days = 31;
        }
        else if (month == 2)
        {
           if (((year%100 == 0) && (year%400 == 0)) || (year%4 == 0))
           {
               days = 29;
           }
           else
           {
               days = 28;
           }
        }
        else if (month == 3)
        {
           days = 31;
        }
        else if (month == 4)
        {
           days = 30;
        }
        else if (month == 5)
        {
           days = 31;
        }
        else if (month == 6)
        {
           days = 30;
        }
        else if (month == 7)
        {
           days = 31;
        }
        else if (month == 8)
        {
           days = 31;
        }
        else if (month == 9)
        {
           days = 30;
        }
        else if (month == 10)
        {
           days = 31;
        }
        else if (month == 11)
        {
           days = 30;
        }
        else if (month == 12)
        {
           days = 31;
        }
        return days;
    }
       
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a month (1-12):");
        int month = keyboard.nextInt();
        System.out.println("Enter a year:");
        int year = keyboard.nextInt();
        MonthDays date = new MonthDays(month, year);
        
        System.out.println(date.numberOfDays() + " days");
           
    }
}