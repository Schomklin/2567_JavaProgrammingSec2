public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	//Default Constructor
	Car(){
	/*	companyName = "Unknow";
		modelName = "Unknow";
		year = 2000;
		mileage = 0.0;*/
		this("Unkhow","Unknow",2000,0.0);
	}
	
	//Parameterize Constructor
 	Car(String companyName,String modelName,int year,double mileage){
 		this.companyName = companyName;
 		this.modelName = modelName;
 		//Default ปีที่ผลิต 2000 หากค่าที่ใส่ไม่ถูกต้อง
 		this.year = year <1886? 2000:year;
 		this.mileage = mileage; 		
 	}
 	
 	// getters and setters method()
 	public void setCompanyName(String companyName) {
 		if(companyName != null && !companyName.trim().isEmpty()) {
 			this.companyName = companyName;
 		}else {
 			System.out.println("Error: Invalid company name"); 			
 		}
 	}

}








