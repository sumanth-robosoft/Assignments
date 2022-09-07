package sep1;

import java.util.Scanner;

public class Summation {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the two numbers");
	int firstNumber,secondNumber;
	//take 2 number input from the user
	firstNumber= scan.nextInt();
	secondNumber=scan.nextInt();
	scan.close();
	try {
		int sum=firstNumber+secondNumber;
		//if sum of two number exceed 100 throw exception else display the sum
		if(sum>=100)
			throw new SumExceedException("Sum exceeded 100");
		else {
			System.out.println("Sum of two numbers is "+sum);
		}
	}
	catch(SumExceedException e) {
		//display the exception
		System.out.println(e);
	}
}
}

//custom exception class for sum exceed 100
class SumExceedException extends Exception{
	public SumExceedException(String exceptionMessage) {
		//assign exception to Exception class variable by Calling constructor of parent Exception
		super(exceptionMessage);
	}
}
