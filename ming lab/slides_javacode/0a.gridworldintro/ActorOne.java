//© A+ Computer Science 
// www.apluscompsci.com

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class ActorOne
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      
      Actor dude = new Actor();	//default blue actor going north
      Location loc = new Location(0,0);
      world.add(loc, dude);
      
      //add more actors to the world
      
      world.show();       
   }
}