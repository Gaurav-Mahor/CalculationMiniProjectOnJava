package calculation;
import java.util.Scanner;
//import 	calculation.Subtraction;

public class Calculator
{	
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number1: ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter a number2: ");
		int num2 = scan.nextInt();
		
		System.out.println("\nSum of two nukmber is "+Addition.add(num1,num2));
		System.out.println("Subtraction of two nukmber is "+Subtraction.subtract(num1,num2));
		System.out.println("Subtraction of two nukmber is "+Multiplication.multiply(num1, num2));
	}
}