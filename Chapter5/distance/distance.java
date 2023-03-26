import java.util.Scanner;

// Michael Cohen
// Chapter 5: Programming Challenge 9

public class distance
{
    public static void distance(int speed, int time)
    {
        int count;
        System.out.println("Hour	Distance Travelled");
        System.out.println("--------------------------");
       
        for(count = 1; count <= time; ++count) 
        {
            System.out.println(count + "\t\t" + (count*speed));
        }
    }
    
  	public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      int speed, time;
      int count;
      do {
          System.out.print("Enter vehicle speed (in mph): ");
          speed = keyboard.nextInt();
        } while(speed < 0);      
      do {
          System.out.print("Enter time travelled (in hrs): ");
          time = keyboard.nextInt();
        } while(time < 1);
        
      distance(speed, time);
    }
  	
}