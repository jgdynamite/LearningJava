/** Account1.java
 *  Account1 class that contains an name instance variable
 *  and methods to set and get its value. */

public class Account1 {
	
	private String name; /** instance variable.  A local variable
	and it existence from the time that you declare it until the end of the method
	This a instance variable. Every method in this class will have it own instance variable string 
	Java will initialize this value to null for string and 0 for integer
	Private means only the method within this class know that variable exist. 
	This is call incasolating the data*/
	
	/** Constructor initializes name with parameter name*/
	public Account1(String name) // Constructor name is class name
	{
		this.name = name;
	}
	/** *
	/** method to set the name in the object 
	 *  public mean other class that use class account will know about this method and be able to use it
	 *  void (return type) mean method does not return a value
	 *  name mean parameter name of type string will be passed.
	 *  Parameters are local variables
	 *  Method set will low case 
	 *  The word this. is because the parameter and instance variable have the same name (name)*/
	public void setName(String name)
	{
		this.name = name; /** store the name */
	}
	/** method to retrieve the name from the object */
	public String getName()
	{
		return this.name; /** return value of name to caller*/
	}
} /** end class Account */

