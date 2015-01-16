//© A+ Computer Science
// www.apluscompsci.com

//do while loop example 

import static java.lang.System.*;

public class DoWhile
{
   public void run( )
   {
     int x=0;
      do{
         x++;
         out.println(x);
      }while(x<20);	//condition
   }
   public static void main(String args[]  )
   {
      DoWhile test = new DoWhile();
      test.run( );
   }
}