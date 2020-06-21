package ir.sharif.math.ap98.hearthstone.game;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;
import ir.sharif.math.ap98.hearthstone.game.Passive.Passive;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.players.Player;

public class MatchState {
    private GameEntity myEntity;
    private GameEntity oponentEntity;
    private EntityType turn;
    private MatchState(GameEntity myEntity, GameEntity oponentEntity) {
        this.myEntity = myEntity;
        this.oponentEntity = oponentEntity;
    }

    public EntityType getTurn() {
        return turn;
    }
    public void setTurn(EntityType turn) {
        this.turn = turn;
    }
    public GameEntity getMyEntity() {
        return myEntity;
    }
    public void setMyEntity(GameEntity myEntity) {
        this.myEntity = myEntity;
    }
    public GameEntity getOponentEntity() {
        return oponentEntity;
    }
    public void setOponentEntity(GameEntity oponentEntity) {
        this.oponentEntity = oponentEntity;
    }


    private static MatchState matchState;
    public static void createMatch(){
        GameState gameState = GameState.getInstance();
        Player player = gameState.getCurrentPlayer();
        Hand hand = gameState.getHand();
        SimpleDeck deck = gameState.getPlayDeck();
        Passive passive = gameState.getPassive();
        Hero hero = new Hero(deck.getName(), deck.getHeroType());
        GameEntity myEntity = new GameEntity(player, hand, deck, passive,hero,EntityType.MY_ENTITY);
        try {
            if (passive==null){
                GameEntity oponentEntity = new GameEntity((Player) player.clone()
                        ,(Hand) hand.clone()
                        , (SimpleDeck) deck.clone()
                        ,(Hero) hero.clone()
                        ,EntityType.MY_ENTITY);
                matchState = new MatchState(myEntity,oponentEntity);
            }else {
                GameEntity oponentEntity = new GameEntity((Player) player.clone()
                        , (Hand) hand.clone()
                        , (SimpleDeck) deck.clone()
                        , (Passive) passive.clone()
                        , (Hero) hero.clone()
                        ,EntityType.OPONENT_ENTITY);
                matchState = new MatchState(myEntity,oponentEntity);
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    public static MatchState get(){
        return matchState;
    }
    public enum EntityType{
        MY_ENTITY,
        OPONENT_ENTITY;
    }
}
