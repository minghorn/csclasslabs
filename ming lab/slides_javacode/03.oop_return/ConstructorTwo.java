//© A+ Computer Science
// www.apluscompsci.com

//constructor example 2

import static java.lang.System.*;

class Triangle
{
   private int sideA, sideB, sideC;

   public Triangle()
   {
      sideA=0;
      sideB=0;
      sideC=0;
   }

   public Triangle(int a, int b, int c)
   {
      sideA=a;
      sideB=b;
      sideC=c;
   }


   //add in a modifier method named setSides()
   //setSides receives three int parameters named a, b, and, c






   public void print()
   {
   	out.println(sideA + " " + sideB + " " + sideC);
   }
}

public class ConstructorTwo
{
  public static void main ( String[] args )
  {
    Triangle test = new Triangle(5,6,7);
    test.print();

    test = new Triangle(15,17,14);
    test.print();
  }
}