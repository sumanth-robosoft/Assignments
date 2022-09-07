package aug26;

import java.util.Scanner;

public abstract class Member{
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	Member(){
		Scanner scan =new Scanner(System.in);
		System.out.println("Name: ");
		name=scan.next(); 
		System.out.println("Age: ");
		age=scan.nextInt();
		System.out.println("PhoneNUmber : ");
		phoneNumber=scan.next();
		System.out.println("Address : ");
		address=scan.next();
		System.out.println("Salary : ");
		salary=scan.nextDouble();
		scan.close();
	}
	void printSalary() {
		System.out.println(salary);
	}
	public abstract void showdetails();
}
