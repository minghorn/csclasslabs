import java.util.*;

public abstract class AbstractPlayer implements Playerable
{
    private ArrayList<Card> hand;
    private int winCount;
    
    //constructor
    public AbstractPlayer(){
        hand = new ArrayList<Card>();
        winCount = 0;
    }
    //methods
    public void addCardToHand(Card card){
        hand.add(card);
    }
    
    public void resetHand(){
        for(int i=0; i < hand.size(); i++){
            hand.remove(i);
        }
    }
    
    //set methods
    
    //get methods
    
    public String toString(){
        return "";
    }   
}
