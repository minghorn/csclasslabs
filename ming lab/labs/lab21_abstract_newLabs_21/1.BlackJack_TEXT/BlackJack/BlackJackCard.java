// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{
    //constructors  
    public BlackJackCard(int x, String y){
        super(x,y);
    }

    public int getValue(){
        if(face > 1 && face < 11){
            value = face;
        }
        else if(face == 1){
            value = 11;
        }
        else if(face > 10){
            value = 10;
        }
        else{
            value = 0;
        }
        return value;
    }
    
 }