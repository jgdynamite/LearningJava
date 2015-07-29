/** Addition program that displays the sum of two number
 * Import a scanner java class
 * Addition class declaration below after the import. */
import java.util.Scanner; // program uses class scanner

public class Addition {
	// main method starts here
	public static void main(String[] args)
	{
		/** create a Scanner to obtain input from the command window*/
		Scanner input = new Scanner(System.in);
		
		int number1;  // first number to add
		int number2;  // second number to add
		int sum;  // sum of number1 and number2
		
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt();  // read first number from user
		
		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt();  //read second number from user
		
		sum = number1 + number2; // add numbers, then store total in sum
		
		System.out.printf("Sum is %d%n", sum); // display sum
	} // end method main
} // end class Addition
