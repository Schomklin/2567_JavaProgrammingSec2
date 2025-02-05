
public class Customer {
	//private two attribute(instance variable)
	private int id;
	private String name;
	private int discount;
	
	//Parameterize Constructor
	Customer(int id,String name,int discount){
	 	this.id = id;
		this.name = name;
		this.discount = discount;			 
	}
	
	//Getters and Setter method
	public int getID() {
		return this.id;		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDiscount() {
		return this.discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;		
	}
	
	//toString method
	public String toString() {
		return getName() + "(" + getID() + ")("+ getDiscount()+ "%)";
	}
}
