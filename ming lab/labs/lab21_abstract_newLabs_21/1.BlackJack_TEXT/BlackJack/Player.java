//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;



//define Player class here 
public class Player extends AbstractPlayer{
    Scanner in;
    //constructors
    public Player(){
        in = new Scanner(System.in);
    }
    //hit method goes here
    public boolean hit(){
       String bool = in.next();
       if(bool.substring(0,1).equals("y") || bool.substring(0,1).equals("Y")){
           return true;
        }
       return false;
    }
}
