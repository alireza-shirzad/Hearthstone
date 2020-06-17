package ir.sharif.math.ap98.hearthstone.game;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

    private ArrayList<Card> cards;

    public Hand(){
        ArrayList<Integer> list = new ArrayList<>();
        cards = new ArrayList<>();
        for (int i = 0; i<= GameState.getInstance().getPlayDeck().getNumOfTotallCards()-1; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i=0; i<3; i++) {
            cards.add(GameState.getInstance().getPlayDeck().getCards().get(list.get(i)));
            GameState.getInstance().getPlayDeck().getCards().remove(cards.get(i));
        }
    }

    public void addRandom(){
        int randomInt = (int)(GameState.getInstance().getHand().getCards().size() * Math.random());
        cards.add(GameState.getInstance().getPlayDeck().getCards().get(randomInt));
        GameState.getInstance().getPlayDeck().getCards().remove(randomInt);
        System.out.println(GameState.getInstance().getPlayDeck().getCards());

    }

    public void add(Card card){
        cards.add(card);
        GameState.getInstance().getPlayDeck().getCards().remove(card);
    }
    public void returnCard(Card card){
        cards.remove(card);
        GameState.getInstance().getPlayDeck().getCards().add(card);
    }
    public void remove(Card card){
        cards.remove(card);
    }
    public ArrayList<Card> getCards() {
        return cards;
    }
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
