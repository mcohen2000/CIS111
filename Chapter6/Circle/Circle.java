// Michael Cohen
// Chapter 6: Programming Challenge 9

import java.util.Scanner;

public class Circle
{
    private double radius;
    final double pi = 3.14159;
    
    public Circle()
    {
    double radius = 0.0;
    
    }
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return this.radius;
    }
    
    public double area()
    {
        return (pi * radius * radius);
    }
    
    public double diameter()
    {
        return (radius * 2);
    }
    
    public double circumference()
    {
        return (2 * pi * radius);
    }
       
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a radius for a circle:");
        double radius = keyboard.nextDouble();
        
        Circle circ = new Circle(radius);
        
        System.out.println("The radius of the circle is " + circ.getRadius());
        System.out.println("The area of the circle is " + circ.area());
        System.out.println("The diameter of the circle is " + circ.diameter());
        System.out.println("The circumference of the circle is " + circ.circumference());
           
    }
}