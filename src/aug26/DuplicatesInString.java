package aug26;

import java.util.*;

public class DuplicatesInString {
	public static void main(String[] args) {
		String inputString;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a string");
		inputString=scan.nextLine();
		findDuplicate(inputString);
		scan.close();
	}

	private static void findDuplicate(String inputString) {
		String[] words=inputString.split(" ");
		Set<String> duplicates = new HashSet<String>();
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<words.length;j++) {
				if(words[i].equals(words[j])&&i!=j)
				{
					duplicates.add(words[i]);
				}
			}
		}
		
		if(duplicates.isEmpty())
			System.out.println("No duplicates in a given string");
		else {
			System.out.println("duplicates"+duplicates);
		}		
	}

}
