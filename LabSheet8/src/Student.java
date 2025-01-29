public class Student {
	//private two attribute
	private String studentName;
	private int studentScore;
	
	//setters and getters method
	public void setName(String stdName) {
		studentName = stdName;		
	}
	
	public String getName() {
		return studentName;		
	}
	
	public void setScore(int stdScore) {
		studentScore = stdScore;		
	}
	
	public int getScore() {
		return studentScore;
	}
	
	//Check the score is within the valid range(0-100)
	public boolean checkScore() {
	/*	if(getScore()>=0 && getScore()<=100) {
			return true;
		}else {
			return false;			
		}
	*/
	/*	if(getScore()>=0 && getScore()<=100) 
			return true;
		return false;
	*/
		return getScore()>=0 && getScore()<=100;
	}
	
	//Check the student passed(score>=50)
	public boolean isPass() {
		//return false;
		return getScore()>=50;
	}

}







