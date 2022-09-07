package sep5;

import sep1.Employee;

/**The EmployeeComparator class is used to compare the {@link sep1.Employee} variables using the functions  compareSalary and compareName
 * @author Sumanth Prabhu
 *
 */
public class EmployeeComparator {

		
		/**Compare salary of the two employee and return suitable value 
		 * @param employ1 
		 * @param employ2
		 * @return 0 employ 1 salary equal employ 2 salary <br>
		 *  1 employ 1 salary > employ 2 salary <br>
		 * -1 otherwise
		 */
		public static int compareSalary(Employee employ1,Employee employ2){  
		if(employ1.salary==employ2.salary)  
		return 0;  
		else if(employ1.salary>employ2.salary)  
		return 1;  
		else  
		return -1;  
		}  
		
		
		/**Compare Name of the two employee and return suitable value 
		 * @param employ1
		 * @param employ2
		 * @return 0 employ 1 name equal employ 2 name <br>
		 * 1 employ 1 name > employ 2 name<br>
		 * -1 otherwise
		 */
		public static int compareName(Employee employ1,Employee employ2){  

		return employ1.employeeName.compareTo(employ2.employeeName);  
		}  
		
		/**Compare Id of the two employee and return suitable value 
		 * @param employ1
		 * @param employ2
		 * @return 0 employ 1 Id equal employ 2 Id <br>
		 * 1 employ 1 Id > employ 2 Id<br>
		 * -1 otherwise
		 */
		public static int compareId(Employee employ1,Employee employ2){  

		return employ1.employeeId.compareTo(employ2.employeeId);  
		}  
		}  