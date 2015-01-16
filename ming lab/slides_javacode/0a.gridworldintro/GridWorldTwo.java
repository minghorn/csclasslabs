//© A+ Computer Science 
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

public class GridWorldTwo
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      
      world.add(new Location(1,1), new Actor());
      world.add(new Location(2,2), new Bug(Color.ORANGE));
      world.add(new Location(3,3), new Flower(Color.YELLOW));
      world.add(new Location(4,4), new Rock());
      world.add(new Location(5,5), new Critter());  
      world.add(new Location(6,6), new Flower());   
      	
     	Bug theBug = new Bug();
      world.add(new Location(7,7), theBug);
      
      Critter it = new Critter();
      it.setColor(Color.GREEN);
      world.add(new Location(8,8), it);  
      	           		    
      world.show();       
   }
}