/** Account.test.java
 *  Creating and manipulating an Account object.*/

public class Account1Test {

	public static void main(String[] args)
	{
		/** Create two Account objects*/
		Account1 account1 = new Account1("Jane Green");
		Account1 account2 = new Account1("John Blue");
		
		/** Display initial value of name for each Account*/
		System.out.printf("account1 name is: %s%n", account1.getName());
		System.out.printf("account2 name is: %s%n", account2.getName());
	}
} /** end class AccountTest */
