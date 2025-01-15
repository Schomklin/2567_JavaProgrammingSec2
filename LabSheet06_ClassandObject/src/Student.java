
public class Student {
	//private two attribute
	private String name;
	private double[] scores;
	
	//Method to set student details
	public void setStudentDetails(String stdName,double[] stdScores) {
		name = stdName;
		scores = stdScores;		
	}
	
	//Method to calculate average score
	public double calculateAverageScore() {
		double total = 0;
	/*	for(int i=0;i<scores.length;i++) {
			total += scores[i];			
		}*/
		for(double _score : scores) {
			total += _score;			
		}
		return total/scores.length; //return average of scores
	}
	
	//Method to get grade based on average score
	public String getGrade() {
		double average = calculateAverageScore();
		if(average >= 90) {
			return "A";			
		}else if(average >= 80) {
			return "B";			
		}else if(average >= 70) {
			return "C";			
		}else if(average >= 60) {
			return "D";			
		}else {
			return "F";	
		}
	}
	
	//Method to display student details
	public void displayStudentDetails() {
		System.out.println("Name: "+ name);
		System.out.print("Scores: ");
		/*for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+" "); 			
		}*/
		for(double _score : scores) {
			System.out.print(_score+" "); 
		}

		System.out.println("\nAverage Score: "+ calculateAverageScore());
		System.out.println("Grade: "+getGrade());
	}
}//end of Class Student
