package sep1;

import java.util.Scanner;

public class MarkEvaluation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float internalMarks,externalMarks;
		System.out.println("Enter internal marks");
		//take 2 number input from the user
		internalMarks= scan.nextFloat();
		System.out.println("Enter external marks");
		externalMarks=scan.nextFloat();
		scan.close();
		try {
			check(internalMarks,externalMarks);
			}
		catch(MarksExceededException e) {
			//display the exception
			
			System.out.println(e);
		}
		

	}

	
	/**check for the condition to satisfy
	 * @param internalMarks
	 * @param externalMarks
	 * @throws MarksExceededException
	 */
	private static void check(float internalMarks,float externalMarks) throws MarksExceededException {
		try {
			
		//if internalMarks exceed 40 throw exception
		if(externalMarks>40)
			throw new MarksExceededException("The Internal Marks is exceed");
		
		//if externalMarks exceed 60 throw exception
		if(internalMarks>60)
			throw new MarksExceededException("The External Marks is exceed");
		}
		finally {
			System.out.println("The marks entered are\nInternal marks: "+internalMarks+"\nExternal marks: "+internalMarks);
		}
		
	}

}

//custom exception class
class MarksExceededException extends Exception{
	public MarksExceededException(String exceptionMessage) {
		//assign exception to Exception class variable 
		super(exceptionMessage);
	}
}
