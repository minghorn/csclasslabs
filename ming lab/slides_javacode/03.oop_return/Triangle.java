//© A+ Computer Science
// www.apluscompsci.com

//OOP example

public class Triangle
{
   private int sideA, sideB, sideC;

   public Triangle()
   {
      setSides(0,0,0);
   }

   public Triangle(int a, int b, int c)
   {
      //add the needed code to this method

   }

   public void setSides(int a, int b, int c)
   {
   	sideA=a;
   	sideB=b;
   	sideC=c;
   }

   public void print()
   {
   	System.out.println("sides " + sideA + " " + sideB + " " + sideC);
   }
}