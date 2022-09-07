package aug24;

import java.util.*;

public class DuplicatInArray {
	public static void main(String[] args) {
		int arraySize,index;
		List<Integer> duplicates = new ArrayList<Integer>();
		System.out.println("Enter array size:");
		Scanner scan= new Scanner(System.in);
		arraySize=scan.nextInt();
		int[] arrayData= new int[arraySize];
		System.out.println("Enter array elements:");
		for(index=0;index<arraySize;index++) {
			arrayData[index]=scan.nextInt();
		}
		Arrays.sort(arrayData);
		for(index=0;index<arraySize-1;index++) {
			if(arrayData[index]==arrayData[index+1]) {
				if(!duplicates.contains(arrayData[index]))
						duplicates.add(arrayData[index]);
			}
			
		}
		
		for(int item:duplicates) {
			System.out.print(item+" ");
		}
	}
}
