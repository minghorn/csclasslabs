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
        int j = 0;
         for(int i = 0; i < 52; i++){
            duplicated.add(stackOfCards.get(i));
           }
        for(int i = 0; i < 51;){
            int x = random.nextInt(duplicated.size());
            Card y = duplicated.get(x);
            stackOfCards.set(j, y);
            duplicated.remove(x);
            i++;
            j++;
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
       if(topCardIndex < 52){
           topCardIndex++;
        }
       return stackOfCards.get(topCardIndex);
    }

    public String toString()
    {
        return stackOfCards + "   topCardIndex = " + topCardIndex;
    } 
}