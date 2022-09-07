package aug26;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter  string ");
		String inputString =scan.next();
		System.out.println("Enter substring to replace ");
		String subString =scan.next();
		if(FindSubstring.checkSubString(inputString, subString)) {
			System.out.println("Enter string to replace ");
			String replaceString =scan.next();
			inputString=inputString.replace(subString, replaceString);
			System.out.println("string after replacement "+inputString);
		}
		else {
			System.out.println("substring "+subString+" not present in the given string "+inputString);
		}
		scan.close();
	}
}
