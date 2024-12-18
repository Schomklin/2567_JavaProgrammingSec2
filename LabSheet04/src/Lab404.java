import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
        inputStudent();
    }

    public static void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        String studentID, subjectCode;
        boolean isStudentIDValid, isSubjectCodeValid;
        while (true) {
            // Input student ID
            System.out.print("Enter student ID (10 digits): ");
            studentID = scanner.nextLine();

            // Input subject code
            System.out.print("Enter subject code (7 digits): ");
            subjectCode = scanner.nextLine();

            // Check lengths of student ID and subject code
            isStudentIDValid = isLength(studentID, 10);
            isSubjectCodeValid = isLength(subjectCode, 7);
            
            if(isStudentIDValid && isSubjectCodeValid) {
            	//Check student details
            	boolean isITStudent = isITStudent(studentID);
            	boolean isITSubject = isITSubject(subjectCode);
            	
            	//Display data
            	displayData(isITStudent,isITSubject);
            	break;            	
            }else {
            	System.out.println("");
            }   
            
        }//end while()
        
    }//end of inputStudent() Method
    
    public static boolean isLength(String input,int len) {
    	   return input.length() ==len;    	
    }
    

}
