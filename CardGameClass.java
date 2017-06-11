/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameclass;

import java.util.Scanner;

/**
 *
 * @author Bitó Sándor
 */
public class CardGameClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck deck = new Deck();
        // Commands
        deck.cards = deck.make(30);
        deck.shuffle(1);
        deck.handout();
        //
        boolean end = false;
        while (end== false) {        
            System.out.println("_____________________");
        System.out.println("[1]Show my Deck");
            System.out.println("[2]Shuffle Deck");
                System.out.println("[3]My Hand");
                    System.out.println("[4]Draw");
                        System.out.println("[5]Exit");
        Scanner scn = new Scanner(System.in);
        int beker = scn.nextInt();
        switch (beker) {
            case 1:
                    deck.show();
                break;
            case 2:
                    deck.shuffle(1);
                break;
            case 3:
                    deck.showhand();
                break;
            case 4:
                    deck.draw(1);
                break;
            case 5:
                end = true;
                break;
            default:
                System.out.println("Bad Number");
        }
        }
    }
    
}
