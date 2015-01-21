//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


//define Dealer class here
public class Dealer extends AbstractPlayer{
    //instance variable - Deck 
    public Deck dealerDeck;
    //constructors
    public Dealer(){
        dealerDeck = new Deck();
    }

    //method to shuffle
    public void shuffle(){
        dealerDeck.shuffle();
    }
    //method to deal a card
    public Card deal(){
        return dealerDeck.nextCard();
    }
    //hit method goes here
    public boolean hit(){
        if(this.getHandValue() >= 17){
            return false;
        }
        return true;
    }
}
