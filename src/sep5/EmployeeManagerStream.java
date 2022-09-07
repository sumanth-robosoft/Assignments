package sep5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import sep1.Employee;
import sep1.EmployeeManager;

public class EmployeeManagerStream {
	public static void main(String[] args) {
		List<Employee> employs = new ArrayList<Employee>();
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		do{
			EmployeeManager.insertEmployeeRecord(employs);
			System.out.println("\noperation can be performed\n" + "1.Insert a record\n" + "2.perform oparation \n"
					+ "Enter the choice:");
			choice = scan.nextInt();
			
			}while(choice==1);

		
		scan.close();
		// store Employee with salary>15000 in salaryfliteredEmp list
		List<Employee> salaryfliteredEmp = employs.stream().filter(val -> val.salary > 15000)
				.collect(Collectors.toList());
		// store Employs Name Starts with letter V in empNameStart_v list
		List<Employee> empNameStart_v = employs.stream().filter(val -> val.employeeName.startsWith("v"))
				.collect(Collectors.toList());
		// store Total number of Employs
		long totalEmploys = employs.stream().count();
		// store Employs with name length more than four in empwithNameLenMore4
		List<Employee> empwithNameLenMore4 = employs.stream().filter(val -> val.employeeName.length() > 4)
				.collect(Collectors.toList());
		// store Employee with Max salary in employ
		Optional<Employee> employ = employs.stream().max((val1, val2) -> EmployeeComparator.compareSalary(val1, val2));
		// store sorted list based on name of employee in sortedEmp
		List<Employee> sortedEmp = employs.stream().sorted(Comparator.comparing(val -> val.employeeName))
				.collect(Collectors.toList());

		// display the results
		System.out.println("Employe with salary>15000 :");
		display(salaryfliteredEmp);
		System.out.println("Employe name starts with letter 'V' ");
		display(empNameStart_v);
		System.out.println("Employee with Max salary is");
		System.out.println(employ.get().employeeName);
		System.out.println("Total number of Employs are " + totalEmploys);
		System.out.println("Employs with name length more than four ");
		display(empwithNameLenMore4);
		System.out.println("Employs details after sorting based on name:");
		display(sortedEmp);

	}

	/**display the list of employs  in table format is list is not empty
	 * @param employList list of {@link sep1.Employee}
	 */
	static void display(List<Employee> employList) {
		if (employList.isEmpty())
			System.out.println("No records");
		else {
			System.out.println("Name\t\tId\t\tSalary");
			employList.forEach(
					val -> System.out.println(val.employeeName + "\t\t" + val.employeeId + "\t\t" + val.salary));
		}
	}
}
