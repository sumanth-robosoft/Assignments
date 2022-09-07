package aug26;

import java.util.Scanner;

public class FindSubstring {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a string");
		String inputString =scan.next();
		System.out.println("Enter a sub string");
		String subString=scan.next();
		scan.close();
		boolean chek= checkSubString(inputString,subString);
		if(chek)
			System.out.println("substring present in the string");
		else {
			System.out.println("substring not present in the string");
		}
	}

	/**check subString present in inputString
	 * @param inputString
	 * @param subString
	 * @return true if present <br> false otherwise
	 */
	public static boolean checkSubString(String inputString, String subString) {
		if(inputString.contains(subString))
			return true;
		return false;
	}

	
	
}