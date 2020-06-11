package ir.sharif.math.ap98.hearthstone.game.decks;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.CardFactory;

import java.util.ArrayList;
public class SpareDeck extends Deck {

    //// Constructor
    public SpareDeck() {
        super();
    }

    //// Add and Remove Methods of Deck
    public Result Add(Card card){
        Cards.add(card);
        return Result.Sucess;
    }
    public Result Remove(Card card){
        if (getNumOfTotallCards()==0) return Result.Error_DeckEmpty;
        else{
            Cards.remove(card);
            return Result.Sucess;
        }
    }


    public static SpareDeck GetDefault(){
        SpareDeck spareDeck = new SpareDeck();
        spareDeck.Add(CardFactory.getInstance().make("Abomination"));
        spareDeck.Add(CardFactory.getInstance().make("Arena Treasure Chest"));
        spareDeck.Add(CardFactory.getInstance().make("Bloodfen Raptor"));
        spareDeck.Add(CardFactory.getInstance().make("Cold Blood"));
        spareDeck.Add(CardFactory.getInstance().make("Ethereal Augmerchant"));
        spareDeck.Add(CardFactory.getInstance().make("Fossilized Devilsaur"));
        spareDeck.Add(CardFactory.getInstance().make("Frozen Shadoweaver"));
        /*
        spareDeck.Add(CardFactory.getInstance().make("Gnomish Inventor"));
        spareDeck.Add(CardFactory.getInstance().make("Loatheb"));
        spareDeck.Add(CardFactory.getInstance().make("Overconfident Orc"));
        spareDeck.Add(CardFactory.getInstance().make("Piloted Shredder"));
        spareDeck.Add(CardFactory.getInstance().make("River Crocolisk"));
        spareDeck.Add(CardFactory.getInstance().make("Scavenging Shivarra"));
        spareDeck.Add(CardFactory.getInstance().make("Supreme Abyssal"));

         */
        return spareDeck;
    }

}
