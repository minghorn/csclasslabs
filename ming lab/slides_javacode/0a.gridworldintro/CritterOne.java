//© A+ Computer Science 
// www.apluscompsci.com

import info.gridworld.actor.Critter;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class CritterOne
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      
      Critter thang = new Critter();
      world.add(new Location(1,1), thang);
      
      //add more critters to the world
      
      world.show();       
   }
}