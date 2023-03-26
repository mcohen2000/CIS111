// Michael Cohen
// Chapter 6: Programming Challenge 14

//import java.util.Scanner;

public class PatientCharges
{
    private String name;
    private String address;
    private String phone;
    private String ename;
    private String ephone;
    
    public Patient(String name, String address, String phone, String ename, String ephone)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.ename = ename;
        this.ephone = ephone;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String getEname()
    {
        return ename;
    }
    
    public void setEname(String ename)
    {
        this.ename = ename;
    }
    
    public String getEphone()
    {
        return ephone;
    }
    
    public void setEphone(String ephone)
    {
        this.ephone = ephone;
    }
       
}

public class Procedure
{
    private String name;
    private String date;
    private String practitioner;
    private int cost;
    
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


public static void main(String[] args)
    {
        
        Patient 0 = new Patient("Michael Abraham Cohen", "123 School Street, Philadelphia, PA 19019", 1234567890, "Peter Griffin", 0987654321);
        Procedure 1 = new Procedure("Physical Exam", "April 28, 2020", "Dr. Irvine", 250.00);
        Procedure 2 = new Procedure("X-ray", "April 28, 2020", "Dr. Jamison", 500.00);
        Procedure 3 = new Procedure("Blood test", "April 28, 2020", "Dr. Smith", 200.00);
        
        System.out.println( "Name: " + 0.getName() + "\nAddress: " + 0.getAddress() + "\nPhone: " + 0.getPhone() + "\nEmergercy Contact: " + 0.getEname() + ", " + 0.getEphone() );
        
        System.out.println( "Procedure name: " + 1.getName() + "\nDate: " + 1.getDate() + "\nPractitioner: " + 1.getPractitioner() + "\nCharge: " + 1.getCost() );
        System.out.println( "Procedure name: " + 2.getName() + "\nDate: " + 2.getDate() + "\nPractitioner: " + 2.getPractitioner() + "\nCharge: " + 2.getCost() );
        System.out.println( "Procedure name: " + 3.getName() + "\nDate: " + 3.getDate() + "\nPractitioner: " + 3.getPractitioner() + "\nCharge: " + 3.getCost() );
           
    }