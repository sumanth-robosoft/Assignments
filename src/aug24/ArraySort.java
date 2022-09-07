package aug24;

import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		int arraySize,index,temp;
		System.out.println("Enter array size:");
		Scanner scan= new Scanner(System.in);
		arraySize=scan.nextInt();
		int[] arrayData= new int[arraySize];
		System.out.println("Enter array elements:");
		for(index=0;index<arraySize;index++) {
			arrayData[index]=scan.nextInt();
		}
		scan.close();
		for (index = 0; index < arraySize - 1; index++)
            for (int j = 0; j < arraySize - index - 1; j++)
                if (arrayData[j] > arrayData[j + 1]) {
                     temp = arrayData[j];
                    arrayData[j] = arrayData[j + 1];
                    arrayData[j + 1] = temp;
                }
		for(index=0;index<arraySize;index++)
			System.out.print(arrayData[index]+" ");
		
	}
}
