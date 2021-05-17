package com.thinkful.blackjack;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println("This is the shuffled Deck");
        System.out.println(deck);

        Hand hand = new Hand();
        System.out.println("The empty Hand:");
        System.out.println(hand);
        hand.addCard(deck.deal());
        System.out.println("After one card is dealt");
        System.out.println(hand);
        hand.addCard(deck.deal());
        System.out.println("After two cards are dealt");
        System.out.println(hand);

        System.out.println("The deck after two cards are dealt");
        System.out.println(deck);
    }
}
