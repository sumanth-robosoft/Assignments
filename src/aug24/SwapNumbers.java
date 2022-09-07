package aug24;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		int firstNum,secondNum,temp;
		System.out.println("Enter 2  numbers to swap using temp:");
		Scanner scan= new Scanner(System.in);
		firstNum=scan.nextInt();
		secondNum=scan.nextInt();
		
		temp=firstNum;
		firstNum=secondNum;
		secondNum=temp;
		System.out.println(firstNum+" "+secondNum);
		System.out.println("want to swap without temp (1/0)");
		if(scan.nextInt()==1) {
		System.out.println("Enter 2 positive numbers to swap without using temp:");
		
		firstNum=scan.nextInt();
		secondNum=scan.nextInt();
		
		firstNum=firstNum+secondNum;
		secondNum=firstNum-secondNum;
		firstNum=firstNum-secondNum;
		System.out.println(firstNum+" "+secondNum);
		}
		scan.close();
	}
}
 