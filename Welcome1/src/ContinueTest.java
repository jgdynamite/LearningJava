   // Fig. 5.14: ContinueTest.java
   // continue statement terminating an iteration of a for statement.
   public class ContinueTest
   {
      public static void main(String[] args)
      {
         for (int count = 1; count <= 10; count++) // loop 10 times
         {
            if (count == 5)
               continue; // skip remaining code in loop body if count is 5
            /** The continue statement, when executed in a while, for or do...while, 
             *  skips the remaining statements in the loop body and proceeds with the next iteration of the loop. 
             *  In while and do...while statements, the program evaluates the loop-continuation 
             *  test immediately after the continue statement executes. 
             *  In a for statement, the increment expression executes, 
             *  then the program evaluates the loop-continuation test.*/

            System.out.printf("%d ", count);
         }

         System.out.printf("%nUsed continue to skip printing 5%n");
      }
   } // end class ContinueTest