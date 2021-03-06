/** Fig. 3.9: AccountTest.java
 * Inputting and outputting */
import java.util.Scanner;

public class Acount3Test 
{
	public static void main(String[] args)
	{
		/** Create two account objects of class Account3*/
		Acount3 account1 = new Acount3("Jane Doe", 50.00);
		Acount3 account2 = new Acount3("Ming Sue", -7.53);
		
		/** Display initial balance of each object*/
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		/** Create a Scanner object to obtain input from the command window*/
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: "); //prompt 
		double depositAmount = input.nextDouble(); //obtain user input
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount); // add to account1's balance
		
		System.out.print("Enter withdrawer amount for account1: "); //prompt 
		double withdrawAmount = input.nextDouble(); //obtain user input
		System.out.printf("%nsubtrating %.2f to account1 balance%n%n", withdrawAmount);
		account1.withdraw(withdrawAmount); // add to account1's balance
		
		/** display balances*/
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
	
		
		System.out.print("Enter deposit amount for account2: "); //prompt 
		depositAmount = input.nextDouble(); //obtain user input
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount); // add to account1's balance
		
		System.out.print("Enter withdrawer amount for account2: "); //prompt 
		withdrawAmount = input.nextDouble(); //obtain user input
		System.out.printf("%nsubtrating %.2f to account2 balance%n%n", withdrawAmount);
		account2.withdraw(withdrawAmount); // add to account1's balance
		
		/** display balances*/
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
		
		
	}
}
