// Michael Cohen
// Chapter 7: Programming Challenge 5

public class LargerThanN
{
    public static void greaterThan(int[] array, int n)
    {
        for (int k = 0; k < array.length; k++)
        {
        if (array[k] > n)
            {
            System.out.println("The following numbers from the array are greater than " + n + ":");
            System.out.println( array[k] );
            }
        }
    }

   public static void main(String[] args)
   {
        int testValues[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int number = 5;
        greaterThan(testValues, 5);         
   }   
}