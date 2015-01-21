//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
    private ArrayList<Playerable> players;
    private Dealer dealer = new Dealer();
    private Scanner in = new Scanner(System.in);

    public BlackJack()
    {
       System.out.println("How many players?");
       int play = in.nextInt();
       players.add(dealer);
       for(i = 1; i < play+1; i++){
           Player player = new Player();
           players.add(player);
        }
    }

    public void playGame()
    {
        for(int i=0; i < players.size(); i++){
            players.get(i).addCardToHand(dealer.deal());
            players.get(i).addCardToHand(dealer.deal());
            System.out.println(players.get(i).getHandValue());
            System.out.println("player " + player.get(i).toString());
        }
        
        while(playerTotal <= 21 && player.hit()){
            player.addCardToHand(dealer.deal());
            playerTotal = player.getHandValue();
            System.out.println(playerTotal);
            System.out.println("player " + player.toString());
        }
        System.out.println(dealerTotal);
        System.out.println("dealer " + dealer.toString());
        dealer.hit();
        while(dealer.hit()){
            dealer.addCardToHand(dealer.deal());
            dealerTotal = dealer.getHandValue();
            System.out.println(dealerTotal);
            System.out.println("dealer " + dealer.toString());
        }
        if(playerTotal > dealerTotal && playerTotal <= 21 || dealerTotal > 21 && playerTotal <= 21){
            System.out.println("Player won!");
            player.setWinCount(1);
        }
        else if(dealerTotal > playerTotal && dealerTotal <= 21 || playerTotal > 21 && dealerTotal <= 21){
            System.out.println("Dealer won!");
            dealer.setWinCount(1);
        }
        dealer.shuffle();
        System.out.println("Player: " + player.getWinCount() + " Dealer: " + dealer.getWinCount());
        System.out.println("Play again? y or n");
        String q = in.next();
        if(q.equals("y") || q.equals("Y")){
            player.resetHand();
            dealer.resetHand();
            dealerTotal = dealer.getHandValue();
            playerTotal = player.getHandValue();
            this.playGame();
        }
    }
    
    public static void main(String[] args)
    {
        BlackJack game = new BlackJack();
        game.playGame();
    }
}