package aug29;

import java.util.Scanner;

class Rectangle {
	float width, height;

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	// calculate area of rectangle
	float getArea() {

		return width * height;
	}
}

public class RectangleCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rectangle object you want to create");
		int numberOfRectangles = scan.nextInt();
		Rectangle rectangle[] = new Rectangle[numberOfRectangles];

		// take input for each rectangle
		for (int index = 0; index < numberOfRectangles; index++) {
			System.out.println("Enter rectangle " + index + "details width and height respectivly:");
			rectangle[index] = new Rectangle(scan.nextFloat(), scan.nextFloat());

		}
		scan.close();

		float maxarea = 0, minarea = rectangle[0].getArea();
		Rectangle maxAreaRef = null, minAreaRef = null;
		for (int i = 0; i < numberOfRectangles; i++) {

			// assign area to Temporary local variable 'area'
			float area = rectangle[i].getArea();
			
			// compare for max area and store reference
			if (area > maxarea) {
				maxarea = area;
				maxAreaRef = rectangle[i];

			}
			
			// compare for minimum area and store reference
			if (area <= minarea) {
				minarea = area;
				minAreaRef = rectangle[i];

			}
		}
		
		//display minimum and maximum area of rectangle and its details
		System.out.println("Reecatngle having minimum area " + minarea + " details are\nwidth: " + minAreaRef.width
				+ "\nHeight: " + minAreaRef.height);
		System.out.println("Reecatngle having maximum area " + maxarea + " details are\nwidth: " + maxAreaRef.width
				+ "\nHeight: " + maxAreaRef.height);
	}

}
