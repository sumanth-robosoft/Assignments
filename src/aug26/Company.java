package aug26;

import java.util.Scanner;

class Employee extends Member{
	String specialization;
	public Employee() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Specialization : ");
		specialization=scan.next();
		scan.close();
	}
	@Override
	public void showdetails() {
		System.out.println("Employee Details are:");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Address: "+address);
		System.out.println("Salary: "+salary);
		System.out.println("Specialization: "+specialization);
		
	}
	
	
}
class Manager extends Member{
	String department;
	public Manager() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Depatrment : ");
		department=scan.next();
		scan.close();
	}
	@Override
	public void showdetails() {
		System.out.println("Manager Details are:");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Address: "+address);
		System.out.println("Salary: "+salary);
		System.out.println("Specialization: "+department);
		
	}
	
	
}

public class Company {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Employee Details");
		Member employee = new Employee();
		System.out.println("Enter Manager Details");
		Member manager = new Manager();
		System.out.println("\nEmployee Details");
		employee.showdetails();
		employee.printSalary();
		System.out.println("\nManager Details");
		manager.showdetails();
		manager.printSalary();
		scan.close();
		
		
	}
}
