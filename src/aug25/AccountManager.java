/**
 * Day2 assignment about Bank account management
 */
package aug25;
import java.util.*;
class Account{
	private int id;
	private double balance;
	private double annualInterestRate ;
	private Date dateCreated =new Date();
	
	Account(){
		id=1;
		balance= 5.0;
	}
	
	//set account id
	public void setId(int id) {
		this.id=id;
	}
	
	//return account id of the particular account
	public int getId() {
		return id;
	}
	
	//set balance for the particular account
	public void setBalance(double balance) {
			this.balance=balance;
	}
	
	//get balance of the particular account
	public double getBalance() {
		return balance;
	}

	//set annual Interest Rate for the particular account
	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	
	//return annual Interest Rate
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	
	//return the date on which  account is created
	public Date getdateCreated() {
		return dateCreated;
	}
	
	//get interest rate
	public double getMonthlyInterstRate() {
		return annualInterestRate/12;
	}
	
	//get monthly interest of particular account
	public double getMonthlyInterst() {
		return (balance*(annualInterestRate/12))/100;
	}
	
	//remove withdrawAmount from the balance
	public void withdraw(double withdrawAmount) {
		//if balance is 0 display appropriate result
		if(balance-withdrawAmount>0) {
			balance -=withdrawAmount;
		}
		else {
			System.out.println("Account balance is empty");
		}
	}
	
	//Add depositeAmount to the balance
	public void deposit(double depositeAmount) {
		balance += depositeAmount;
	}
	
}

public class AccountManager {

	public static void main(String[] args) {
		
		double intrestRate =6.84;
		double initailDeposite,amount;
		int numberOfAccounts,index;
		int userOption,accountId;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of accounts you want to create");
		//number of accounts to be created
		numberOfAccounts=scan.nextInt();
		Account accounts[]=new Account[numberOfAccounts];
		for(index=0;index<numberOfAccounts;index++) {
			accounts[index]=new Account();
			accounts[index].setId((encrypteId(index)));
			accounts[index].setannualInterestRate(intrestRate);
			System.out.println("Account "+(index+1)+" created successfully!!! \n account id:"+accounts[index].getId()+" Account creation date :"+accounts[index].getdateCreated());
			System.out.println("Please enter initial deposite amount(0 to skip) :");
			initailDeposite=scan.nextDouble();
			//if user don't deposit initial deposit amount grant 5 as initial deposit else use initalDeposite for deposit
			if(initailDeposite==0) {
				System.out.println("Enjoy the 5 bucks for opening account");
				continue;
			}
			else {
				accounts[index].setBalance(initailDeposite);
			}
			
		}
		
		while(true) {
			
		System.out.println("The account operation you can perform :\n"
				+ "\t1. Withdraw\n"
				+ "\t2. Deposite\n"
				+ "\t3. Get Monthly Interest Rate\n"
				+ "\t4. Get Monthly Interest\n"
				+ "\t5. Check heighest balance account and Exit");
		userOption=scan.nextInt();
		//check for max Account balance and exit for the program
		if(userOption==5) {
			double maxBalance=0,temp;
			int heighestBalanceAccountIndex=0;
			for(index=0;index<numberOfAccounts;index++) {
				temp=accounts[index].getBalance();
				if(temp> maxBalance) {
					maxBalance=temp;
					heighestBalanceAccountIndex=index;
				}
			}
			System.out.println("Heighest Balance is "+maxBalance);
			System.out.println("Account Id is:"
					+  accounts[heighestBalanceAccountIndex].getId());
			return;
		}
		//take account id from user
		System.out.println("Enter account ID:");
		accountId=scan.nextInt();
		index=decrypteId(accountId);
		//perform operation based on user choice
		switch(userOption) {
		case 1: System.out.println("Enter amount to withdraw");
				amount=scan.nextDouble();
				accounts[index].withdraw(amount);
				System.out.println("Account balance is :"+accounts[index].getBalance());
				break;
		case 2: System.out.println("Enter amount to deposit");
				amount=scan.nextDouble();
				accounts[index].deposit(amount);
				System.out.println("Account balance is :"+accounts[index].getBalance());
				break;
		case 3: System.out.println("Monthly Intrest rate is:"+accounts[index].getMonthlyInterstRate());				
				break;
		case 4: System.out.println("Monthly Intrest is:"+accounts[index].getMonthlyInterst()+" with respect to current balance");				
				break;
		default:System.out.println("Enter proper option");
				break;
		}
		scan.close();
		
		}
		
        
	}
	
	//use index value to create account id
	private static int encrypteId(int key) {
		return (key+2)*100;
	}
	
	//use account id to get index
	private static int decrypteId(int key) {
		return (key-200)/100;
	}
}
