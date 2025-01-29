
public class Author {
	private String name;
	private String email;
	
	//Default Constructor
	Author(){
		this("","");
	}
	//Parameterize Constructor
	Author(String name,String email){
		this.name = name;
		this.email = email;		
	}
	
	//set, get method
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	//toString() method
	public String toString() {
		return getName()+ " ("+ getEmail()+")";
	}	
}







