package com.thinkful.blackjack;

public class Main {
    public static void main(String[] args) {
//        Deck deck = new Deck();
//        deck.shuffle();
//        System.out.println("This is the shuffled Deck");
//        System.out.println(deck);
//
//        Hand hand = new Hand();
//        System.out.println("The empty Hand:");
//        System.out.println(hand);
//        hand.addCard(deck.deal());
//        System.out.println("After one card is dealt");
//        System.out.println(hand);
//        hand.addCard(deck.deal());
//        System.out.println("After two cards are dealt");
//        System.out.println(hand);
//
//        System.out.println("The deck after two cards are dealt");
//        System.out.println(deck);
        Game game = new Game();
        System.out.println("The initial Game");
        System.out.println(game);

        System.out.print("The player's turn");
        while(game.isPlayerTurn()){
            if(game.getPlayer().getValue() < 18){
                System.out.println("HIT");
                game.playerMove(Action.HIT);
            } else {
                System.out.println("STAND");
                game.playerMove(Action.STAND);
            }
            System.out.println("The dealer's Turn");
            game.dealerMove();

            System.out.println(game.outcome());
            System.out.println(game);

        }
    }
}
