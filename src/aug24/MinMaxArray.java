package aug24;
import java.util.*;
public class MinMaxArray {
public static void main(String args[]) {
	int arraysize;
	System.out.println("Enter array size:");
	Scanner scan= new Scanner(System.in);
	arraysize=scan.nextInt();
	int[] arrayData= new int[arraysize];
	System.out.println("Enter array elements:");
	for(int i=0;i<arraysize;i++) {
		arrayData[i]=scan.nextInt();
	}
	int min=arrayData[0];
	int max=arrayData[0];
	//using for loop
	for(int i=0;i<arraysize;i++) {
		if(arrayData[i]<min)
			min=arrayData[i];
		if(arrayData[i]>max)
			max=arrayData[i];
	}
	System.out.println("min: "+min + " max: "+max);
	
	
}
}
