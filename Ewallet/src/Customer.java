
public class Customer {
	private String customername;
	private Long mobilenumber;
	Customer(String customername, Long mobilenumber)
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
	public Long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
}

