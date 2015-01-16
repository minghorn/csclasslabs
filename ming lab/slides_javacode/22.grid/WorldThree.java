//© A+ Computer Science
// www.apluscompsci.com

import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid; 

public class WorldThree
{
   public static void main(String[] args)
   {
      World<Monster> world = new World<Monster>(new BoundedGrid<Monster>(6,6));
      world.show();      
      
      Grid<Monster> grid = world.getGrid();
      for(int r=0; r<grid.getNumRows(); r++)
      {
      	for(int c=0; c<grid.getNumCols(); c++)
      	{
      		grid.put(new Location(r,c),new Monster(r,c,2));
      	}
      }
   }
}