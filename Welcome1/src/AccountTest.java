/** Account.test.java
 *  Creating and manipulating an Account object.*/
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) /** Note that String is actually a class.  System.out is another class.
	If the class is define in the program an its part of the current working directory
	Then you don't need to import. Also if its part of Java.lang, you don't need to import.*/ 
	{
		/** create a Scanner object to obtain input from the command window */
		Scanner input = new Scanner(System.in);
		
		/** Create a Account object and assign it to myAccount*/
		Account myAccount = new Account();
		
		/** display initial value of name (null) */
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
		/** prompt for and read name*/
		System.out.println("Please enter the name:");
		String theName = input.nextLine(); /** read a line of text */
        myAccount.setName(theName);	/** put theName in myAccount */	
        System.out.println(); /** outputs a blank line *
        
        /** Display the name store in object myAccount */
        System.out.printf("Name in object myAccount is:%n%s%n",myAccount.getName());
	}
} /** end class AccountTest */
