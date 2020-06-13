package ir.sharif.math.ap98.hearthstone.game;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    private Hand(Card card1, Card card2, Card card3){
        cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
    }
}
