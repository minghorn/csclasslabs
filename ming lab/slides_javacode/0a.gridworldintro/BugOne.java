//© A+ Computer Science 
// www.apluscompsci.com

import java.awt.Color;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class BugOne
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      
      Bug dude = new Bug();	//default red bug going north
      world.add(new Location(3,3), dude);
      
      //add more bugs to the world
      //Bug greenBug = new Bug(Color.GREEN);
      
      world.show();       
   }
}