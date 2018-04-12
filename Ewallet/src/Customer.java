
public class Customer {
	private String customername;
	private int mobilenumber;
	Customer(String customername, int mobilenumber)
	{
	    this.customername = customername;
	    this.mobilenumber = mobilenumber;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
}

