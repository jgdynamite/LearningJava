/** Comparison.java
 * Compare integers using if statements, relational operators
 * and equality operators*/
import java.util.Scanner; // program uses class Scanner

public class Comparison {

	/** Main method begins execution of Java application*/
	public static void main(String[] args)
	{
		/** create Scanner object to obtain input from command line*/
		Scanner input = new Scanner(System.in);
		
		int number1; // first number to compare
		int number2; // Second number to compare
		
		System.out.print("Enter first number: "); // prompt
		number1 = input.nextInt(); // read first number from user
		
		System.out.print("Enter second number: "); // prompt
		number2 = input.nextInt(); // read second number from user
		
		if (number1 == number2)
			{
				System.out.printf("%d == %d%n", number1, number2);
			}
		if (number1 != number2)
			{
				System.out.printf("%d != %d%n", number1, number2);
			}
		if (number1 < number2)
			{
				System.out.printf("%d < %d%n", number1, number2);
			}
		if (number1 > number2)
			{
			System.out.printf("%d > %d%n", number1, number2);
			}
		if (number1 <= number2)
			{
			System.out.printf("%d <= %d%n", number1, number2);
			}
		if (number1 >= number2)
			{
			System.out.printf("%d >= %d%n", number1, number2);
			}
	} // End main method
} // End class Comparison