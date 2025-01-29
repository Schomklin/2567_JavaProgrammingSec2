
public class Book {
	private String title;
	private Author author; //Composition Concept
	private int page;
	
	//Constructor Method
	Book(String title,Author author,int page){
		this.title = title;
		this.author = author;
		this.page = page;		
	}
	
	Book(String title,Author author){
	/*	this.title = title;
		this.author = author;
		this.page = 0;*/
		this(title,author,0);		
	}
	
	Book(){
		//this(null,null,0);
		this.title = null;
		this.author = null; 
		this.page = 0;
	}
	
	//Setters and Getters method
	public String getTitle() {
		return this.title;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public void setPage(int page) {
		this.page = page;		
	}
	
	public int getPage() {
		return this.page;
	}
	
	//toString() method
	public String toString() {
		return getTitle()+ " has " + getPage()+" pages write by " 
				+ getAuthor();		
	}
}






