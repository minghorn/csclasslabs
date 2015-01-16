//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid; 

public class BGridThree
{
   public static void main(String[] args)
   {
      BoundedGrid<Integer> grid = new BoundedGrid<Integer>(5,5);
      grid.put(new Location(2,2),4);
      grid.put(new Location(1,1),11);
      grid.put(new Location(0,2),3);
      grid.put(new Location(0,1),6);      
      System.out.println(grid);
      grid.remove(new Location(1,1));
      System.out.println(grid);
      grid.remove(new Location(1,1));
      System.out.println(grid);      
   }
}