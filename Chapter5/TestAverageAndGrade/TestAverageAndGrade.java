import java.util.Scanner;
import java.text.DecimalFormat;

// Michael Cohen
// Chapter 5: Programming Challenge 7

public class TestAverageAndGrade
{
    public static double calcAverage(double student1, double student2, double student3, double student4, double student5)
    {
        double avg = ((student1 + student2 + student3 + student4 + student5) / 5); 
      	return avg;
    }
    public static char determineGrade(double grade)
    {
        char letter = ' ';
        if (grade >= 90)
            letter = 'A';
        else if (grade < 90 && grade >= 80)
            letter = 'B';
        else if (grade < 80 && grade >= 70)
            letter = 'C';
        else if (grade < 70 && grade >= 60)
            letter = 'D';
        else if (grade < 60)
            letter = 'F';
      	return letter;
    }
  	public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter test grade for student 1:");
      double student1 = keyboard.nextDouble();
      System.out.print(" Enter test grade for student 2:");
      double student2 = keyboard.nextDouble();
      System.out.print(" Enter test grade for student 3:");
      double student3 = keyboard.nextDouble();
      System.out.print(" Enter test grade for student 4:");
      double student4 = keyboard.nextDouble();
      System.out.print(" Enter test grade for student 5:");
      double student5 = keyboard.nextDouble();
      System.out.println(" The letter grades are as follows:");
      System.out.println("Student 1: " + determineGrade(student1));
      System.out.println("Student 2: " + determineGrade(student2));
      System.out.println("Student 3: " + determineGrade(student3));
      System.out.println("Student 4: " + determineGrade(student4));
      System.out.println("Student 5: " + determineGrade(student5));
      double avg = calcAverage(student1, student2, student3, student4, student5);
      DecimalFormat df = new DecimalFormat("#.00");
      System.out.print("The average grade was: " + df.format(avg));
    }
  	
}