//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Random;

public class Card
{
    public static final String FACES[] = {"placeholder","ACE","TWO","THREE","FOUR",
            "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

    //instance variables
        public String suit;
        public int face;
        public String faceName;
        public int value;
         Random random = new Random();

    //constructors
        public Card(String x, int y){
            suit = x;
            face = y;
            faceName = FACES[y];
            value = getValue();
        }


    // modifiers
        //set methods
        public void setFace(int x){
            faceName = FACES[x];
            face = x;
            value = getValue();
        }
        
    //accessors
        //get methods
        public int getFace(){
            return face;
        }
        public String getSuit(){
            return suit;
        }
        public int getValue(){
            if(face < 11 && face > 1){
                value = face;
            }
            else if( face == 1){
                value = 11;
            }
            else{
                value = 10;
            }
            return value;
        }


    //toString
        public String toString(){
            if(face == 1 || face > 10){
                return ( faceName + " of " + suit + " " + value);
            }
            return(faceName + " of " + suit);
        }

 }