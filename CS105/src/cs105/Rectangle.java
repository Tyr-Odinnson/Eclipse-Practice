package cs105;

import java.util.*;

public class Rectangle {

	public static void main(String args[]) {
		
			double length, width, area, perimeter;
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter length of Rectangle");
			length = in.nextDouble();
			
			System.out.println("Enter width of Rectangle");
			width = in.nextDouble();
			
			// Area of rectangle = length X width
			area = length * width;
			// Perimeter of rectangle = 2 X (length X width)
			perimeter = 2 * (length + width);
			
			System.out.println("Area of Rectangle : " + area);
			
			System.out.println("Rectangle of Rectangle : " + perimeter);

	}

}
