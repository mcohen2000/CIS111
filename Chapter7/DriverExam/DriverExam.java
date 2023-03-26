// Michael Cohen
// Chapter 7: Programming Challenge 6

import java.util.Scanner;
import java.util.Arrays;

public class DriverExam
{
    public static boolean passed(char[] key, char[] student)
    {
        int correct = 0;
        for (int k = 0; k < key.length; k++)
        {
        if (key[k] == student[k])
            {
            correct += 1;
            }
        }
        if (correct >= 15)
           {
           System.out.println("This student passed the exam.");
           return true;
           }
        else
           {
           System.out.println("This student failed the exam.");
           return false;
           }
    }
    
    public static int totalCorrect(char[] key, char[] student)
    {
        int correct = 0;
        for (int k = 0; k < key.length; k++)
        {
        if (key[k] == student[k])
            {
            correct += 1;
            }
        }
        System.out.println("This student answered " + correct + " out of " + key.length + " correctly." );
        return correct;
    }
    
    public static int totalIncorrect(char[] key, char[] student)
    {
        int incorrect = 0;
        for (int k = 0; k < key.length; k++)
        {
        if (key[k] != student[k])
            {
            incorrect += 1;
            }
        }
        System.out.println("This student answered " + incorrect + " out of " + key.length + " incorrectly." );
        return incorrect;
    }
    
    public static int[] questionsMissed(char[] key, char[] student)
    {
        int incorrect = 0;
        int x = 0;
        int missedQs[] = new int[key.length];
        for (int k = 0; k < key.length; k++)
        {
        if (key[k] != student[k])
            {
            missedQs[x] = k+1;
            x++;
            }
        }
        System.out.println("This student missed the following questions: " + Arrays.toString(missedQs) );
        return missedQs;
    }

   public static void main(String[] args)
   {
        char answerKey[] = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
        char studentSubmission[] = new char[20];
        Scanner keyboard = new Scanner(System.in);
        
        for (int k = 0; k < answerKey.length; k++)
        {
        	System.out.println("What is the answer to question #" + (k+1) + ": ");
        	String input = keyboard.nextLine();
         char value = input.charAt(0);
         studentSubmission[k] = value;
         if ( value != 'A' && value != 'B' && value != 'C' && value != 'D' )
            {
            System.out.println("The program is ending due to an invalid input.");
            System.out.println("Please use the characters 'A, B, C, or D' for input values.");
            return;
            }
        }

        passed(answerKey, studentSubmission);
        totalCorrect(answerKey, studentSubmission);
        totalIncorrect(answerKey, studentSubmission);
        questionsMissed(answerKey, studentSubmission);    
   }   
}