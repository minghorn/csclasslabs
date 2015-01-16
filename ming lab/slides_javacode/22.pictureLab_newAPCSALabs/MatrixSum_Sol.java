//© A+ Computer Science
// www.apluscompsci.com

//Matrix sum example 

import static java.lang.System.*;

public class MatrixSum_Sol
{
	/*
	 *  method searchMat should determine how many
	 *  occurrences of toFind exist in the matrix mat
	 */
	public static int sumMat( int[][] mat )
	{
		int sum = 0;
		for( int[] row : mat )
		{
		   for( int num : row )
		   {
		      sum = sum + num;
		   }
		}
		return sum;
	}

	public static void main(String args[])
	{
		int[][] twoDRay = {{5,7},{5,3,4,6},{0,8,9}};
		System.out.println( sumMat( twoDRay ) );
	}
}