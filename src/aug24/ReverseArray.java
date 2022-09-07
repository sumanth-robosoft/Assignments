package aug24;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int arraysize,index;
		System.out.println("Enter array size:");
		Scanner scan= new Scanner(System.in);
		arraysize=scan.nextInt();
		int[] arrayData= new int[arraysize];
		System.out.println("Enter array elements:");
		for(index=0;index<arraysize;index++) {
			arrayData[index]=scan.nextInt();
		}
		int[] newArrayData = new int[arraysize];
		for(index=arraysize-1;index>=0;index--)
			newArrayData[arraysize-1-index]=arrayData[index];
		for(index=0;index<arraysize;index++)
			System.out.print(newArrayData[index]+" ");
	}

}
