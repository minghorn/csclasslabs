//© A+ Computer Science  -  www.apluscompsci.com

//do while loop example

import java.util.Scanner;

public class PassWord
{
   public static void main(String args[])
   {
   	Scanner kb = new Scanner(System.in);
		String savedpassword="csisfun";
		String password = "";
		do
		{
			System.out.print("Password ::  ");
		   password = kb.next();
		}while (!password.equals(savedpassword));
	}
}
