//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid; 

public class WorldOne
{
   public static void main(String[] args)
   {
      World<Monster> world = new World<Monster>();
      world.add(new Location(0,0), new Monster());
      world.add(new Location(9,0), new Monster());      
      world.show();       
   }
}