/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;
import java.util.*;

/**
 *
 * @author hp
 */
public class Poker {

    static int CARDS = 5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printCards(CARDS);
        deck.printDeck();
        
        Hand player1 = new Hand(deck, CARDS);
        
        if (player1.flush())
        {
            System.out.println("Flush");
        }
        
        if (player1.straight())
        {
            System.out.println("Straight");
        }
        
        if (player1.pair())
        {
            System.out.println("Pairs");
        }
        
        if (player1.twoPair())
        {
            System.out.println("Two Pair");
        }
        
        if (player1.threeOfAKind())
        {
            System.out.println("Three of a Kind");
        }
        
        if (player1.fourOfAKind())
        {
            System.out.println("Four of a Kind");
        }
        
        if (player1.fullHouse())
        {
            System.out.println("Full House");
        }
        
        
        // OR
        System.out.print("Manually set the hand of cards: ");
 
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        Hand player2 = new Hand(in);
        
        if (player2.flush())
        {
            System.out.println("Flush");
        }
        
        if (player2.straight())
        {
            System.out.println("Straight");
        }
        
        if (player2.pair())
        {
            System.out.println("Pairs");
        }
        
        if (player2.twoPair())
        {
            System.out.println("Two Pair");
        }
        
        if (player2.threeOfAKind())
        {
            System.out.println("Three of a Kind");
        }
        
        if (player2.fourOfAKind())
        {
            System.out.println("Four of a Kind");
        }
        
        if (player2.fullHouse())
        {
            System.out.println("Full House");
        }
    }
    
}
