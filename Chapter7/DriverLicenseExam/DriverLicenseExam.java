// Michael Cohen
// Chapter 7: Programming Challenge 5

public class DriverExam
{
    public boolean passed(char[] key, char[] student)
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
           return true;
           }
        else
           {
           return false;
           }
    }
    
    public int totalCorrect(char[] key, char[] student)
    {
        int correct = 0;
        for (int k = 0; k < key.length; k++)
        {
        if (key[k] == student[k])
            {
            correct += 1;
            }
        }
        return correct;
        //System.out.println("This student answered " + correct + " out of " + key.length + " correctly." );
    }
    
    public int totalIncorrect(char[] key, char[] student)
    {
        int incorrect = 0;
        for (int k = 0; k < key.length; k++)
        {
        if (key[k] != student[k])
            {
            incorrect += 1;
            }
        }
        return incorrect;
        //System.out.println("This student answered " + incorrect + " out of " + key.length + " incorrectly." );
    }
    
    public int questionsMissed(char[] key, char[] student)
    {
        int incorrect = 0;
        int x = 0;
        char[] missedQs;
        for (int k = 0; k < key.length; k++)
        {
        if (key[k] != student[k])
            {
            missedQs[x] = k;
            x++;
            }
        }
        return missedQs;
        //System.out.println("This student answered " + incorrect + " out of " + key.length + " incorrectly." );
    }

   public static void main(String[] args)
   {
        char answerKey[] = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
        char studentSubmission[] = new char[20];
        
        for (int k = 0; k < answerey.length; k++)
        {
        	System.out.println("What is the answer to question #" + (k+1) + ": ");
        	double value = keyboard.nextChar();
         studentSubmission[k] = value;
         if ( value != A || value != B || value != C || value != D )
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