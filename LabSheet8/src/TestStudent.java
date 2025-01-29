import java.util.*;
public class TestStudent {
	public static void main(String[] args) {
		// กำหนด object ในการรับข้อมูลทาง console(keyboard)
		Scanner scan = new Scanner(System.in);
		//Input the number of students
		System.out.print("How many students in classroom: ");
		int numberofStudent = scan.nextInt();
		//Consume newline character
		scan.nextLine();
		
		//1.Create an array of Student objects
		Student[] students = new Student[numberofStudent]; 
		
		//Input information for each student
		for(int i=0; i<numberofStudent;i++) {
			//2.Create a new Student object
			students[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT "+(i+1));
			Line();
			//Input student's name
			System.out.print("Input student name: ");
			//String stdName = scan.nextLine();
			//students[i].setName(stdName);
			students[i].setName(scan.nextLine());
			//Input student's score and validate
	        System.out.print("Input student score : ");
	        int score = scan.nextInt();
	        scan.nextLine();
	        students[i].setScore(score);
	        while(!students[i].checkScore()) {
	             System.out.print("Input score, again : ");
	             students[i].setScore(scan.nextInt());        	 
	         }
		 }//end of for
		//Display the list of students who passed
		System.out.println("\nLIST OF PASS STUDENS(>=50):");
		Line();
		for(Student student : students) {
		   	  if(student.isPass()) {
		   		  System.out.print(">> "+student.getName()+ 
		   				  " (" + student.getScore()+ ") "+
		   				  " get grade "+findGrade(student.getScore()));			   		  
		   	  }
		}//end for		    
						
		scan.close();
	}//end of main() Method
	
	public static String findGrade(int score) {
		if(score>=80) return "A";
		else if(score>=76) return "B+";
		else if(score>=70) return "B";
		else if(score>=66) return "C+";
		else if(score>=60) return "C";
		else if(score>=56) return "D+";
		else if(score>=50) return "D";
		else return "F";
	}
	
	public static void Line() {
		for(int i=1;i<=60;i++) {
			System.out.print("-");			
		}
		System.out.println();
	}
}//end of Class







