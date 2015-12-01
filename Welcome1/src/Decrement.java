   // Fig. 4.15: Increment.java
   // Prefix increment and postfix increment operators.

   public class Decrement
   {
      public static void main(String[] args)
      {
         // demonstrate postfix increment operator
         int c = 5;
         System.out.printf("c before postdecrement: %d%n", c); // prints 5
         System.out.printf("    postdecrementing c: %d%n", c--); // prints 5
         System.out.printf(" c after postdecrement: %d%n", c); // prints 4  

         System.out.println(); // skip a line

         // demonstrate prefix increment operator
         c = 5;
         System.out.printf(" c before predecrement: %d%n", c); // prints 5
         System.out.printf("     predecrementing c: %d%n", --c); // prints 4
         System.out.printf("  c after deeincrement: %d%n", c); // prints 4  
      }
   } // end class Increment