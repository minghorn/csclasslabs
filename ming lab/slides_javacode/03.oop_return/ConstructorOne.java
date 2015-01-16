//© A+ Computer Science
// www.apluscompsci.com

//constructor example 1

import static java.lang.System.*;		//static import - allows you to type on out
																	//instead of typing System.out

class Triangle
{
   private int sideA, sideB, sideC;

   public Triangle()
   {
      sideA=0;
      sideB=0;
      sideC=0;
   }

   public void print()
   {
   	out.println(sideA + " " + sideB + " " + sideC);
   }
}

public class ConstructorOne
{
  public static void main ( String[] args )
  {
    Triangle test = new Triangle();
    test.print();
  }
}