/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductFile;

/**
 *
 * @author Justin
 */
public class Employee {
 
    private int empId;
    private String password;
    private boolean management;
    
    //constructor
    public Employee(int empId, String password, boolean management)
    {

        this.empId = empId;
        this.password = password;
        this.management = management;
    }
    
    public int getempId()
    {
        return this.empId;
    }
    

    public String getpassword()
    {
        return this.password;
    }
     
    public boolean getmanagement()
    {
        return this.management;
    }
    
    @Override
    public String toString()
    {
        return "\nEmployee Id:\t" + getempId() + "\nEmployee Password:\t" + getpassword() + "\nEmployee is management?:\t" + getmanagement();
    }

}
