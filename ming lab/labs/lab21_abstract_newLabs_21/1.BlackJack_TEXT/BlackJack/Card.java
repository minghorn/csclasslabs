//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public abstract class Card
{
    public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
            "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

    public String suit;
    public int face;
    public String faceName;
    public int value;

    //constructors
        public Card(int x, String y){
            face = x;
            suit = y;
            faceName = FACES[face];
            value = getValue();
        }
    // modifiers
          public void setFace(int x){
            faceName = FACES[x];
            face = x;
            value = getValue();
        }
    //accessors
        public int getFace(){
            return face;
        }
        public String getSuit(){
            return suit;
        }
        public abstract int getValue();

    public boolean equals(Card obj)
    {
        int x = obj.face;
        if(face == x && suit.equals(obj.getSuit())){
            return true;
        }
        return false;
    }

    //toString
    public String toString(){
            return faceName + " of " + suit + " | value = " + value;
        }

    
 }