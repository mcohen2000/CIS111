// Michael Cohen
// Chapter 6: Programming Challenge 1

import java.util.Scanner;

public class Employee
{
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    public Employee()
    {
       String name = "";
       int idNumber = 0;
       String department = "";
       String position = "";
    }
    
    public Employee(String w, int x, String y, String z)
    {
        this.name = w;
        this.idNumber = x;
        this.department = y;
        this.position = z;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String w)
    {
        this.name = w;
    }
    
    public int getID()
    {
        return idNumber;
    }
    
    public void setID(int x)
    {
        this.idNumber = x;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public void setDepartment(String y)
    {
        this.department = y;
    }
    
    public String getPosition()
    {
        return position;
    }
    
    public void setPosition(String z)
    {
        this.position = z;
    }
    
    public static void main(String[] args)
    {
        
        Employee sMeyers = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee mJones = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee jRogers = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        System.out.println("Employee: " + sMeyers.getName() + "\nID Number: " + sMeyers.getID() + "\nDepartment: " + sMeyers.getDepartment() + "\nPosition: " + sMeyers.getPosition() + "\n_______________________");
        System.out.println("Employee: " + mJones.getName() + "\nID Number: " + mJones.getID() + "\nDepartment: " + mJones.getDepartment() + "\nPosition: " + mJones.getPosition() + "\n_______________________");
        System.out.println("Employee: " + jRogers.getName() + "\nID Number: " + jRogers.getID() + "\nDepartment: " + jRogers.getDepartment() + "\nPosition: " + jRogers.getPosition() + "\n_______________________");
           
    }
}