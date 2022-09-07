package sep5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		//Add values to the list
		names.add("sumanth");
		names.add("chandhan");
		names.add("akash");
		names.add("vilas");
		names.add("sumanth");
		List<Integer> numbers= new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		Stream<String> stream=names.stream();
		//check  value "sumanth" is present in the list  
		Boolean check=stream.anyMatch(val->val.equalsIgnoreCase("sumanth"));
		//display check result
		System.out.println(check);
		//convert the values in the names list to upper case
		names.stream().map(value->value.toUpperCase()).forEach(value->System.out.println(value));
		//display distinct elements in the list
		System.out.println("\nDistinct elements");
		names.stream().distinct().forEach(value->System.out.println(value));
		names.stream().dropWhile(value->value.charAt(0) != 'v').forEach(x->System.out.println(x));
		//sum of all the numbers in the list
		int answer=numbers.stream().reduce(0,(ans,val)-> ans+val);
		System.out.println(answer);
		

	}

}
