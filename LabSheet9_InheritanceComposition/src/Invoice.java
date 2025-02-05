
public class Invoice {
	private int invId;
	private Customer customer;
	private double amount;
	
	Invoice(int invId,Customer customer, double amount){
		this.invId = invId;
		this.customer = customer;
		this.amount = amount;		
	}
	
	public int getInvoiceId() {
		return this.invId;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer; // customer.toString()
	}
	
	public int getCustomerID() {
		return this.getCustomer().getID();
	}
	
	public String getCustomerName() {
		return this.getCustomer().getName();
	}
	
	public int getCustomerDiscount() {
		return this.getCustomer().getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return this.getAmount() - (this.getAmount()* this.getCustomerDiscount()/100);
	}
	
	public String toString() {
		return "Invoice[id= "+ this.getInvoiceId()+
				",customer="+ customer.toString() +
				",amount=" + this.getAmountAfterDiscount()+"]";
	}
}






