package aug26;

import java.util.Scanner;

public class DeleteCharacters {

	public static void main(String[] args) {Scanner scan =new Scanner(System.in);
	System.out.println("Enter a string ");
	StringBuilder inputString =new StringBuilder(scan.next());
	System.out.println("Enter a positon to delete character in a string ");
	int positon=scan.nextInt();
	inputString= inputString.deleteCharAt(positon-1);
	System.out.println("string after deleting character at "+positon+" is "+ inputString);
	scan.close();
	}

}
