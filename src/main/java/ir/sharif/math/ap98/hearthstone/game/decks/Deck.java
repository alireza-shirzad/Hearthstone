package ir.sharif.math.ap98.hearthstone.game.decks;
import ir.sharif.math.ap98.hearthstone.characters.cards.Card;

import java.util.ArrayList;
public abstract class Deck {

    //// Attributes of Deck
    protected ArrayList<Card> Cards;

    //// Constructor
    public Deck() {
        Cards = new ArrayList<>();
    }

    //// Add and Remove Methods of Deck
    public abstract Result Add(Card card);
    public abstract Result Remove(Card card);



    // Auxiliary Methods of Deck
    public int getNumOfThisCard(Card cardToSearch){
        int Num=0;
        for (Card card : Cards) {
            if (card.equals(cardToSearch)) Num++;
        }
        return Num;
    }
    public int getNumOfTotallCards(){
        return Cards.size();
    }

    //// toString Method Overriding
    @Override
    public String toString() {
        return "Deck{" +
                "Cards=" + Cards +
                '}';
    }

    //// Getters and Setters
    public ArrayList<Card> getCards() {
        return Cards;
    }
    public void setCards(ArrayList<Card> cards) {
        Cards = cards;
    }



    //// Method Result Types
    public enum Result {
        Sucess,
        Error_DeckFull,
        Error_DeckLimit,
        Error_DeckEmpty,
        Error_HeroNotMatch;
    }

}
