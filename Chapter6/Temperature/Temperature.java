// Michael Cohen
// Temperature Class Ch 6

import java.util.Scanner;

public class Temperature
{



   private double ftemp;
   
   public Temperature(double input)
    {
      this.ftemp = input;
    }
    
    public void setFahrenheit(double input)
    {
      this.ftemp = input;
    }
    public double getFahrenheit()
    {
      return this.ftemp;
    }
    public double getCelcius()
    {
      double celcius = ((5.0/9.0)*(this.ftemp - 32.0));
      return (celcius);
    }
    public double getKelvin()
    {
      double kelvin = ( ((5.0/9.0)*(this.ftemp - 32.0)) + 273.0);
      return (kelvin);
    }
    
public static void main(String[] args)
{
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Enter a Fahrenheit temperature:");
   double input = keyboard.nextDouble();
   Temperature temp = new Temperature(input);
   System.out.println("The temperature in Fahrenheit is " + temp.ftemp);
   System.out.println("The temperature in Celcius is " + temp.getCelcius());
   System.out.println("The temperature in Kelvin is " + temp.getKelvin());

}

}