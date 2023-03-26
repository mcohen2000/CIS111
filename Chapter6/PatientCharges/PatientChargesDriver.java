// Michael Cohen
// Chapter 6: Programming Challenge 14

import java.text.DecimalFormat;

public class PatientChargesDriver
{
    public static void main(String[] args)
    {
        
        Patient pat0 = new Patient("Michael Abraham Cohen", "123 School Street, Philadelphia, PA 19019", "1234567890", "Peter Griffin", "1326540978");
        Procedure pro1 = new Procedure("Physical Exam", "April 28, 2020", "Dr. Irvine", 250.00);
        Procedure pro2 = new Procedure("X-ray", "April 28, 2020", "Dr. Jamison", 500.00);
        Procedure pro3 = new Procedure("Blood test", "April 28, 2020", "Dr. Smith", 200.00);
        
        System.out.println( "Name: " + pat0.getName() + "\nAddress: " + pat0.getAddress() + "\nPhone: " + pat0.getPhone() + "\nEmergercy Contact: " + pat0.getEname() + ", " + pat0.getEphone() + "\n_________________________");
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println( "Procedure name: " + pro1.getName() + "\nDate: " + pro1.getDate() + "\nPractitioner: " + pro1.getPractitioner() + "\nCharge: " + df.format( pro1.getCost() ) + "\n_________________________");
        System.out.println( "Procedure name: " + pro2.getName() + "\nDate: " + pro2.getDate() + "\nPractitioner: " + pro2.getPractitioner() + "\nCharge: " + df.format( pro2.getCost() ) + "\n_________________________");
        System.out.println( "Procedure name: " + pro3.getName() + "\nDate: " + pro3.getDate() + "\nPractitioner: " + pro3.getPractitioner() + "\nCharge: " + df.format( pro3.getCost() ) + "\n_________________________");
           
    }
}
	