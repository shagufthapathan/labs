public class Employee 
{
	public static void main(String [] args)
	{
	    Date joiningDate = new Date(13,9,2017);
		Employee1 e1 = new Employee1("shaguftha", "p",54321, "ada3",joiningDate); 
		Employee1 e2 = new Employee1("chaitanya", "d",2342378, "a4",joiningDate); 
		e1.display();
		
	    System.out.println("");
		e2.display();
		}
}