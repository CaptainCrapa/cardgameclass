/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameclass;

import java.util.Random;

/**
 *
 * @author Bitó Sándor
 */
public class Deck {
    int[] cards = new int[200];
    int[] hand = new int[10];
    int maxcard = 30;

    int[] make(int i) {
        this.maxcard = i;
        for (int j = 0; j < i; j++) {
            this.cards[j] = j;
        }
        for (int j = i; j < cards.length; j++) {
            this.cards[j] = 666;
        }
        return this.cards;
    }

    void shuffle(int i) {
        Random rnd = new Random();
        int cardnow = cardnow();
        
        int swi;
        switch (i) {
            case 1:
                    for (int j = 0; j < cardnow; j++) {
                        int rand = rnd.nextInt(cardnow);
                        swi = this.cards[j];
                        this.cards[j] = this.cards[rand];
                        this.cards[rand] = swi;
                    }
                break;
            default:
                throw new AssertionError();
        }
    }

    private int cardnow() {
        int now = 0;
        for (int i = 0; this.cards[i] != 666; i++) {
            now = i;
        }
        return now+1;
    }

    void show() {
        int now = cardnow();
        System.out.println("Your Deck:\n");
        for (int i = 0; i < now; i++) {
            System.out.println((i+1)+". card: "+ this.cards[i]);
        }
    }

    void showhand() {
        System.out.println("Your hand:\n");
        if (this.hand[0] == 666) {
            System.out.println("Empty");
        }else{
        for (int i = 0; this.hand[i] != 666 ; i++) {
            System.out.println((i+1)+". card: "+this.hand[i]);
        }
        }
    }

    void handout() {
        for (int i = 0; i < this.hand.length; i++) {
            this.hand[i] = 666;
        }
    }

    void draw(int i) {
            int hn = handnow();
            this.hand[hn] = this.cards[0];
            for (int j = 0; j < i; j++) {                    
                sub(this.cards);
            }
        }

    private int handnow() {
        int hn = 0;
        for (int i = 0; this.hand[i] != 666; i++) {
            hn++;
        }
        return hn;
    }

    private void sub(int[] cards) {
        int cn = cardnow();
        cn--;
        for (int j = 0; j < cn; j++) {
            this.cards[j] = cards[j+1];
        }
        this.cards[cn] = 666;
    }
    }


    

