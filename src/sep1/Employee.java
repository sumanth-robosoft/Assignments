package sep1;

/**The Employee  class can store employeeName,employeeId of type {@link  java.lang.String} and salary of type int
 * @author Sumanth Prabhu
 *
 */
public class Employee {
	public String employeeName,employeeId;
	public int salary;
	//store data values in the object variables
	Employee(String employeeName,String employeeId,int salary){
		this.employeeName=employeeName;
		this.employeeId=employeeId;
		this.salary=salary;
	}
}
