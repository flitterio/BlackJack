package com.thinkful.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public List<Card> getCards() {
        return cards;
    }
public Hand(){
        this.cards = new ArrayList<>();
}
public void addCard(Card card){
        this.getCards().add(card);
}

}
