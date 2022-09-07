package sep2;
import java.util.function.BiFunction;
import java.util.function.Consumer;
interface Lambda {
	void demo();
}

public class LambdaExample {
	public static void main(String[] args) {
		// create lambda function
		Lambda obj = () -> {
			System.out.println("Lambda demo");
		};
		// call the lambda function
		obj.demo();
		
		//using predefined lambda
		BiFunction<Integer,Integer, Integer> sum =(x,y)->x+y;
		Consumer<Integer> display =(valueToDisplay)->{System.out.println(valueToDisplay);};
		//pass square function return value to the display function
		display.accept(sum.apply(2,3));
	}
}
