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
    private Scanner in = new Scanner(System.in);
    private Dealer dealer = new Dealer();

    public BlackJack()
    {
       players = new ArrayList<Playerable>();
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
        dealer.shuffle();
        for(int i = players.size()-1; i > -1; i--){
            players.get(i).addCardToHand(dealer.deal());
            players.get(i).addCardToHand(dealer.deal());
        }
        for(int i = players.size()-1; i > -1; i--){
           Player currentPlayer = players.get(i);
           System.out.println("Player " + i + " turn");
           System.out.println(currentPlayer.toString());
           while(currentPlayer.getHandValue() < 21){
               System.out.println("Hit? y or n");
               if(in.next().equals("y")){
                   currentPlayer.addCardToHand(dealer.deal());
                   System.out.println(currentPlayer.toString());
                }
            }
        }
        for(int i = 0; i < players.size(); i++){
            System.out.println("Player " + i + " hand value:" + players.get(i).getHandValue());
        }
        Player winner = players.get(0);
        for(int i = 0; i < players.size(); i++){
            Player current = players.get(i);
            if(winner.getHandValue() > 21){
                winner = players.get(i+1);
            }
            if(current.getHandValue() > winner.getHandValue() && current.getHandValue() <= 21){
                winner = current;
            }
        }
        winner.setWinCount(1);
        for(int i = 0; i < players.size(); i++){
            System.out.println("Player "+ i + "win count: " + players.get(i).getWinCount());
        }
        dealer.shuffle();
        System.out.println("Play again? y or n");
        String q = in.next();
        if(q.equals("y") || q.equals("Y")){
            for(int i = 0; i < players.size(); i++){
                players.get(i).resetHand();
            }
            this.playGame();
        }
    }
    
    public static void main(String[] args)
    {
        BlackJack game = new BlackJack();
        game.playGame();
    }
}