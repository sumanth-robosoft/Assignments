package sep1;

import java.util.*;

public class EmployeeManagerLL {
	static LinkedList<Employee> employes = new LinkedList<Employee>();
	static Scanner scan = new Scanner(System.in);

	static int choice;

	public static void main(String[] args) {
		while (true) {
			System.out.println(
					"\noperation can be performed\n" + "1.Insert a record\n" + "2.Delete a record (based on the Id)\n"
							+ "3.Display the record\n" 
							+ "4.search by id\n"
							+ "5.upate\n"
									+ "6.Exit\n" + "Enter the choice:");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				insertEmployeeRecord();
				break;
			case 2:
				System.out.println("Enter the Employee Id to delete the record: ");
				deleteEmployeeRecord(scan.next());
				break;
			case 3:
				displayEmployeeRecords();
				break;
			case 4:
				System.out.println("Enter the Employee Id to delete the record: ");
				Employee searchResult=findEmployee(scan.next());
				System.out.println("details are\n Name: "+searchResult.employeeName+"\nId:"+searchResult.employeeId+"\nsalary: "+searchResult.salary);
				break;
			case 5:updateEmployee();
			break;
			case 6:System.out.println("max Salary is "+findEmployeeMaxSalary());
			break;
			case 7:return;
			
			}
		}
	}
	
	/**find max salary in employee collection
	 * @return maxSalary
	 */
	private static int findEmployeeMaxSalary() {
		
		int maxSalary = 0;
		for (Employee employee : employes) {
			if (employee.salary>maxSalary) 
				maxSalary=employee.salary;

			}
		return maxSalary;

	}

	/**update employee details based on  id entered by user
	 * 
	 */
	private static void updateEmployee() {
		System.out.println("enter id to be updated:");
		String id=scan.next();
		Employee employee =findEmployee(id);
		if (employee != null) {
			System.out.println(
					"\n1.Update id\n" + "2.Update Name\n"
							+ "3.Update salary\n"+ "Enter the choice:");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter id:");
				employee.employeeId=scan.next();
				System.out.println("Updated ");
				break;
			case 2:
				System.out.println("Enter name:");
				employee.employeeName=scan.next();
				System.out.println("Updated ");
				break;
			case 3:
				System.out.println("Enter Salary:");
				employee.salary=scan.nextInt();
				System.out.println("Updated ");
				break;
			}
		}
		else
			System.out.println("employee with id " + id + " does not exist");
		
	}

	/**
	 * insert the employee details to the employee collection
	 */
	private static void insertEmployeeRecord() {
		String employeeName, employeeId;
		int salary;
		System.out.println("Enter Employee Name:");
		employeeName = scan.next();
		System.out.println("Enter Employee Id");
		employeeId = scan.next();
		System.out.println("Enter Employee salary");
		salary = scan.nextInt();
		// check employee with specified id already present or not
		if (findEmployee(employeeId) == null)
			// insert the record to the employee list by creating object of Employee
			employes.add(new Employee(employeeName, employeeId, salary));
		else
			System.out.println("employee with id " + employeeId + " already exist");

	}

	/**
	 * {@summary delete the employee by getting employee id}
	 * 
	 * @param employeeId
	 */
	private static void deleteEmployeeRecord(String employeeId) {
		// check employee with specified id present or not
		Employee employeeToDeleteRef = findEmployee(employeeId);

		// if employee with specified id is there then only delete the record else
		// display appropriate message
		if (employeeToDeleteRef == null) {
			System.out.println("employee with id " + employeeId + " doesnot exist");
		} else {
			employes.remove(employeeToDeleteRef);
			System.out.println("employee with id " + employeeId + " deleted");
		}

	}

	/**
	 * find the employee object by taking employee id
	 * 
	 * @param employeeIdTofind
	 * @return employee object
	 */
	private static Employee findEmployee(String employeeIdTofind) {
		for (Employee employee : employes) {
			if (employee.employeeId.equals(employeeIdTofind)) {
				return employee;

			}

		}
		return null;

	}

	/**
	 * display record of employs
	 */
	private static void displayEmployeeRecords() {
		// display records of employs if 'employes' collection has the data
		if (employes.size() > 0) {
			// display in table format
			System.out.println("Slno\t\tId\t\tName\t\tSalary\n");
			for (int index = 0; index < employes.size(); index++) {
				Employee tempEmployee = employes.get(index);
				System.out.println((index + 1) + "\t\t" + tempEmployee.employeeId + "\t\t" + tempEmployee.employeeName
						+ "\t\t" + tempEmployee.salary);
			}
		} else
			System.out.println("No records");

	}

}
