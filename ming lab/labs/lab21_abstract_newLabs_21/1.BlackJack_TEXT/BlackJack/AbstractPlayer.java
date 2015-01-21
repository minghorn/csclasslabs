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
    public void resetHand(){
          for(int i=0; i < hand.size(); i++){
              hand.remove(i);
          }
    }
    
    //set methods
    public void addCardToHand(Card card){
        hand.add(card);
    }
    public void setWinCount(int numWins){
        winCount = numWins;
    }
    
    //get methods
    public int getWinCount(){
        return winCount;
    }
    public int getHandSize(){
        return hand.size();
    }
    public int getHandValue(){
        int count = 0;
        for(int i = 0; i < hand.size(); i++){
            count += hand.get(i).getValue();
        }
        return count;
    }
    
    public String toString(){
        String done = "hand = [";
        for(int i =0; i < hand.size(); i++){
            done += hand.get(i) + " ";
        }
        done += "] - " + this.getHandValue();
        return done;
    }
    
}
