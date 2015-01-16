//© A+ Computer Science
// www.apluscompsci.com

//pass by value example 3

import static java.lang.System.*;
import java.util.Arrays;

class A
{
   private String x;

   public A( String val ){  
     x = val;  
   }
   public void change( ){
		x = "x was changed";
   }
   public String toString(){ 
      return x;  
   }
}

class B
{
   public void mystery(A one, A two) 
   {
		one = two;
		two.change();
   }
}

public class PassByValueThree
{
	public static void main(String args[])
	{
		//test code in the main in another class
		B test = new B();
		A one = new A("stuff");
		A two = new A("something");
		System.out.println(one + " " + two); 
		test.mystery(one,two);
		System.out.println(one + " " + two); 
	}
}