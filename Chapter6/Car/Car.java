// Michael Cohen
// Car Ch. 6 PP 1
public class Car
{
    private int yearModel;
    private String make;
    private int speed;
    
    public void Constructor(int x, String y)
    {
        yearModel = x;
        make = y;
        speed = 0;
    }
    
    public int Accessor()
    {
        return speed;
    }
    
    public void accelerate()
    {
        this.speed += 5;
    }
    public void brake()
    {
        this.speed -= 5;
    }
    public static void main(String[] args)
    {
        Car bmw = new Car();
        
        for (int count = 1; count < 6; count++)
            {
                bmw.accelerate();
                int currentSpeed = bmw.Accessor();
                System.out.println(currentSpeed);
            }
        for (int count = 1; count < 6; count++)
            {
                bmw.brake();
                int currentSpeed = bmw.Accessor();
                System.out.println(currentSpeed);
            }
        
        
    }
}