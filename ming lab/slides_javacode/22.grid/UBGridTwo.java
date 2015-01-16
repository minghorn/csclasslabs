//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid; 

public class UBGridTwo
{
   public static void main(String[] args)
   {
		UnboundedGrid<Integer> grid = new UnboundedGrid<Integer>();
      grid.put(new Location(2,2),4);
      grid.put(new Location(1,1),11);
            
      //add more ints to the grid
      
      System.out.println(grid);
      System.out.println(grid.isValid(new Location(-2,3)));
      System.out.println(grid.isValid(new Location(2,3)));      
   }
}