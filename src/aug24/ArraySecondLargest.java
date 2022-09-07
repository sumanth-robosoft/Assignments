package aug24;

import java.util.*;

public class ArraySecondLargest {
	public static void main(String[] args) {
		int arraySize,index;
		System.out.println("Enter array size:");
		Scanner scan= new Scanner(System.in);
		arraySize=scan.nextInt();
		int[] arrayData= new int[arraySize];
		System.out.println("Enter array elements:");
		for(index=0;index<arraySize;index++) {
			arrayData[index]=scan.nextInt();
		}
		scan.close();
		
		Arrays.sort(arrayData);
		for(index=arraySize-2;index>0;index--) {
			if(arrayData[index]!=arrayData[index+1]) {
				System.out.println("second largest is "+arrayData[index]);
				return;
			}
		}
		
	}
}
