//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.awt.Color;

public class DeckTestOne
{
    public static void main( String args[] )
    {
        Deck deck = new Deck();
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");    
        System.out.println("hello");
        System.out.println("hello");
        for(int i = 0; i < deck.size(); i++){
            System.out.println(deck.nextCard());
        }
    }
}