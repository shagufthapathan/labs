
public class Employee {
	 int empid;
     private String firstname, lastname;
     private Date joiningDate;
     private double salary;
    private static int count=111;
   
public Employee(String fname, String lname, Date joiningDate, double salary)
{
      firstname = fname;
      lastname =  lname;
      this.joiningDate = joiningDate;
      this.salary = salary;
      empid = count++;
}
      public void display()
      {
    	  System.out.println("First Name of employee is:\t"+firstname);
  		System.out.println("last Name of employee is:\t"+lastname);
  		System.out.println("salary of employee is:\t"+salary);
  	
  		System.out.println("Employee id is:\t"+empid);
  		System.out.println("Date of joining is:\t"+joiningDate);
      
      }
      public double getSalary()
      {
    	  return salary;
      }

}