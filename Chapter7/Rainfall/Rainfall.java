// Michael Cohen
// Chapter 7: Programming Challenge 1
import java.util.Scanner;

public class Rainfall
{
    private double[] monthlyRain = new double[12];
    
    public Rainfall()
    {
        this.monthlyRain = new double[12];
    }
    
    public void setMonthly(double[] monthlyRain)
    {
        this.monthlyRain = monthlyRain;
    }
    
    public double getTotal()
    {
       double total = 0;
        for ( int k = 0; k < monthlyRain.length; k++)
        {
        if (monthlyRain[k] >= 0)
            {
            total += monthlyRain[k];
            }
        }
        return total;
    }
        
    public double getAvg()
    {
        return getTotal() / monthlyRain.length;
    }

    public double getMost()
    {
        double mostRain = 0;
        for (int k = 0; k < monthlyRain.length; k++)
        {
        if (monthlyRain[k] >= mostRain)
            {
            mostRain = monthlyRain[k];
            }
        }
        return mostRain;
    }
    
    public double getLeast()
    {
        double leastMonth = monthlyRain[0];
        for (int k = 0; k < monthlyRain.length; k++)
        {
        if (monthlyRain[k] <= leastMonth)
            {
            	leastMonth = monthlyRain[k];
            }
        }
        return leastMonth;
    }
    
   public static void main(String[] args)
   {
        Scanner keyboard = new Scanner(System.in);
        double monthlyRain[] = new double [12];
        
        Rainfall rainfall = new Rainfall();
       
        for (int k = 0; k < monthlyRain.length; k++)
        {
        	System.out.println("Enter the amount of rainfall of month " + (k+1) + ": ");
        	double value = keyboard.nextDouble();
         monthlyRain[k] = value;
         if (value < 0)
            {
            System.out.println("The program is ending due to an invalid input.");
            System.out.println("Please use non-negative numbers for input values.");
            return;
            }
        }
        rainfall.setMonthly(monthlyRain);
        System.out.println("The total amont of rainfall this year is " + rainfall.getTotal());
        System.out.println("The average amount of rainfall this year is " + rainfall.getAvg());
        System.out.println("The month with the most amount of rainfall is " + rainfall.getMost());
        System.out.println("The month with the least amount of rainfall is " + rainfall.getLeast());
           
   }   
}