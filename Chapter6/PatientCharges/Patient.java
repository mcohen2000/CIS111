// Michael Cohen
// Chapter 6: Programming Challenge 14

public class Patient
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
