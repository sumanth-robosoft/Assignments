package sep2;

import java.util.Scanner;

import sep2.p1.IntArrayManager;

public class ArrayCalculation {

	public static void main(String[] args) {
		int arraySize, index;
		System.out.println("Enter array size:");
		Scanner scan = new Scanner(System.in);
		// take the array size by user as input
		arraySize = scan.nextInt();
		int[] arrayData = new int[arraySize];
		System.out.println("Enter array elements:");
		// store the array elements provided by user
		for (index = 0; index < arraySize; index++) {
			arrayData[index] = scan.nextInt();
		}
		scan.close();
		// find minimum element by passing array to the function
		System.out.println("Minimum element in the array is " + IntArrayManager.findMinElement(arrayData));
		// scale the array by passing array and scale factor to the function
		IntArrayManager.scaleArray(arrayData, 3);
		System.out.println("Array after scaling:");
		for (int value : arrayData) {
			System.out.print(value + " ");
		}
	}

}
