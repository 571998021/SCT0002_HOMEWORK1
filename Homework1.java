import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("hi");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input radius :");
		double radius = input.nextDouble();
		
		double area = radius * radius * (22.0 / 7.0);
		System.out.println("the area of radius " + radius + " ="+ area);
	}
}