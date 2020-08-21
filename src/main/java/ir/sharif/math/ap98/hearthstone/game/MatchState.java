package ir.sharif.math.ap98.hearthstone.game;

import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;
import ir.sharif.math.ap98.hearthstone.game.Passive.Passive;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.players.Player;

import java.util.Random;

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
        // Creating my player entity
        GameState gameState = GameState.getInstance();
        Player player = gameState.getCurrentPlayer();
        Hand hand = gameState.getHand();
        SimpleDeck deck = gameState.getPlayDeck();
        Passive passive = gameState.getPassive();
        Hero hero = new Hero(deck.getName(), deck.getHeroType());
        GameEntity myEntity = new GameEntity(player, hand, deck, passive,hero,EntityType.MY_ENTITY);
        // Creating Oponent player entity, For now we clone my player
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
                // Let's create the Match state!
                matchState = new MatchState(myEntity,oponentEntity);
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        /////////////////////////////////////

        // First round random turn generator
        Random rand = new Random(System.nanoTime());
        if(rand.nextBoolean()){
            matchState.setTurn(EntityType.MY_ENTITY);
        }else{
            matchState.setTurn(EntityType.OPONENT_ENTITY);
        }
        /////////////////////////////////////
    }
    public static MatchState get(){
        return matchState;
    }
    public enum EntityType{
        MY_ENTITY,
        OPONENT_ENTITY;
    }
}
