//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck
{
    public static final int NUMFACES = 13;
    public static final int NUMSUITS = 4;
    public static final int NUMCARDS = 52;

    public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

    private int topCardIndex;
    private ArrayList<Card> stackOfCards;
    private ArrayList<Card> duplicated;
    private Random random;

    public Deck()
    {
        stackOfCards = new ArrayList<Card>();
        random = new Random();
        duplicated = new ArrayList<Card>();
        topCardIndex = 0;
        for(int i = 0; i < 4;){
            for(int j = 1; j < 14;){
                BlackJackCard x = new BlackJackCard(j, SUITS[i]);
                stackOfCards.add(x);
                j++;
              }
            i++;
          }
         
    }

    //modifiers
   public void shuffle()
    {
         for(int i = 0; i < 52; i++){
            duplicated.add(stackOfCards.get(i));
           }
        for(int i = 51; i > 1; ){
            int x = random.nextInt(i);
            Card y = duplicated.get(x);
            for(int j = 0; j < 52; j++){
                stackOfCards.set(j, y);
               }
            duplicated.remove(x);
            i--;
           }
        //shuffle the deck
        //reset variables as needed
    }

   //accessors
    public int  size()
    {
        return stackOfCards.size();
    }

    public int numCardsLeft()
    {
        return stackOfCards.size();
    }

    public Card nextCard(){
       if(topCardIndex < 50){
           topCardIndex++;
        }
       return stackOfCards.get(topCardIndex);  
    }

    public String toString()
    {
        return stackOfCards + "   topCardIndex = " + topCardIndex;
    } 
}