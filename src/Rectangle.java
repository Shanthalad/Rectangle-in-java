import java.util.*;
import java.io.*;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double area, length, breadth;
		System.out.println("enter the area of rectangle:");
		length=input.nextDouble();
		breadth=input.nextDouble();
		area=length*breadth;
		System.out.println("area of rectangle=" + area);
	}

}
