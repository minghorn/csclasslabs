//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.*;
import java.util.Scanner;

public class BlackJack
{
    private ArrayList<Playerable> players;
    private Dealer dealer = new Dealer();
    private ArrayList<int> winners = new ArrayList<int>();
    private Scanner in = new Scanner(System.in);

    public BlackJack()
    {
       players = new ArrayList<Playerable>();
       ArrayList<int> playerTotals = new ArrayList<int>();
       System.out.println("How many players?");
       int play = in.nextInt();
       players.add(dealer);
       for(int i = 1; i < play+1; i++){
           Player player = new Player();
           players.add(player);
        }
    }

    public void playGame()
    {
        for(int i = players.size()-1; i > -1; i--){
            players.get(i).addCardToHand(dealer.deal());
            players.get(i).addCardToHand(dealer.deal());
            playerTotals.add(i, players.get(i).getHandValue());
        }
        for(int i = players.size()-1; i > -1; i--){
            while(i > 0 && playerTotals.get(i) <= 21 && players.get(i).hit()){
                players.get(i).addCardToHand(dealer.deal());
                playerTotals.get(i) = players.get(i).getHandValue();
                System.out.println(playerTotals.get(i));
                System.out.println("player "+ i + " " + players.get(i).toString());
            }
            System.out.println(playerTotals.get(0));
            System.out.println("dealer " + dealer.toString());
            dealer.hit();
            while(dealer.hit()){
                dealer.addCardToHand(dealer.deal());
                int dealerTotal = dealer.getHandValue();
                System.out.println(dealerTotal);
                System.out.println("dealer " + dealer.toString());
            }
        }
        
        for(int i = 1; i < players.size(); i++){
            System.out.println("Player " + i + " : " + playerTotals.get(i));
            System.out.println("Player " + i + " : " + players.get(i).toString());
        }
            System.out.println("Dealer : " + dealerTotal);
            System.out.println("Dealer : " + dealer.toString());
        for(int i = 0; i < players.size(); i++){
            
            int win = 0;
            if(playerTotals.get(i) > win){
                win = playerTotals.get(i);
            }
            for(int j = 0; j < players.size(); j++){
                if(playerTotals.get(j) == win){
                    winners.add(j);
                }
            }
        }
        for(int i = 0; i < winners.size(); i++){
            players.get(winners.get(i)).setWinCount(1);
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