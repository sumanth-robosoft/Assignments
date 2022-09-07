package aug29;

import java.util.Scanner;

abstract class Figure {
	int dimension1, dimension2;

	abstract void area();
}

class Rectangl extends Figure {
	public Rectangl(int height, int width) {
		super.dimension1 = height;
		super.dimension2 = width;
	}
	
	

	// calculate area of Rectangle
	void area() {
		System.out.println("Area of Rectangle is " + dimension1 * dimension2);

	}

}

class Triangle extends Figure {
	// assign the values to base class parameters using constructor
	public Triangle(int height, int width) {
		super.dimension1 = height;
		super.dimension2 = width;
	}

	// calculate area of Triangle
	void area() {
		System.out.println("Area of Triangle is " + (0.5 * dimension1 * dimension2));

	}

}

class Square extends Figure {
	// assign the values to base class parameters using constructor
	public Square(int height) {
		super.dimension1 = height;

	}

	// calculate area of Square
	void area() {
		System.out.println("Area of Square is " + dimension1 * dimension1);

	}

}

public class AreaCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Figure fig;

		System.out.println("Enter dimensions of Rectangle");
		// take input from the user for rectangle
		System.out.println("width:");
		int width = scan.nextInt();
		System.out.println("height:");
		int height = scan.nextInt();
		fig = new Rectangl(height, width);
		// calculate area of rectangle by calling area function
		fig.area();

		System.out.println("Enter dimensions of Triangle");
		// take input from the user for Triangle
		System.out.println("base:");
		width = scan.nextInt();
		System.out.println("height:");
		height = scan.nextInt();
		fig = new Triangle(height, width);
		// calculate area of Triangle by calling area function
		fig.area();

		System.out.println("Enter dimensions of Square");
		// take input from the user for Square
		System.out.println("height:");
		height = scan.nextInt();
		fig = new Square(height);
		// calculate area of Square by calling area function
		fig.area();

		// close scanner object
		scan.close();
	}
}
