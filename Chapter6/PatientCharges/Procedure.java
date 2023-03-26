// Michael Cohen
// Chapter 6: Programming Challenge 14

public class Procedure
{
    private String name;
    private String date;
    private String practitioner;
    private double cost;
    
    public Procedure(String name, String date, String practitioner, double cost)
    {
        this.name = name;
        this.date = date;
        this.practitioner = practitioner;
        this.cost = cost;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    
    public String getPractitioner()
    {
        return practitioner;
    }
    public void setPractitioner(String practitioner)
    {
        this.practitioner = practitioner;
    }
    
    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }   
}