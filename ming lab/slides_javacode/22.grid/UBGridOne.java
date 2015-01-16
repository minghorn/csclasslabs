//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.grid.UnboundedGrid; 

public class UBGridOne
{
   public static void main(String[] args)
   {
      UnboundedGrid<Integer> grid = new UnboundedGrid<Integer>();
      System.out.println(grid.getNumRows());
      System.out.println(grid.getNumCols());
      System.out.println(grid);
    }
}