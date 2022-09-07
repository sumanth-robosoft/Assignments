package aug26;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		StringBuilder stringToReverse =new StringBuilder(scan.next());
		stringToReverse.reverse();
		System.out.println(stringToReverse);
		scan.close();
	}
}
