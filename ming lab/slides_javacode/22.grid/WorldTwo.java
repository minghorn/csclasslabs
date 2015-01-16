//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid; 

public class WorldTwo
{
   public static void main(String[] args)
   {
      BoundedGrid<Integer> grid = new BoundedGrid<Integer>(5,5);
      grid.put(new Location(2,2),4);
      grid.put(new Location(1,1),9);
      grid.put(new Location(0,4),11);
      grid.put(new Location(4,3),5);
      grid.put(new Location(2,0),1);
 
      World<Integer> world = new World<Integer>(grid);
      world.show();       
   }
}