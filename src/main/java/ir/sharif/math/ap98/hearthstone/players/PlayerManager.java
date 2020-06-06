package ir.sharif.math.ap98.hearthstone.players;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.FileOperator;
import ir.sharif.math.ap98.hearthstone.io.json.AbstractElementAdapter;

public class PlayerManager {
    private PlayerRegistry playerRegistry;
    private final String BaseAddress;
    private FileOperator fileOperator;
    private Gson mapper ;

    //// Constructor
    public PlayerManager() {
        BaseAddress = "\\Players";
        fileOperator = FileOperator.getInstance();
        GsonBuilder gsonBilder = new GsonBuilder().setPrettyPrinting();
        gsonBilder.registerTypeAdapter(Card.class, new AbstractElementAdapter());
        mapper = gsonBilder.create();
    }


    //// Save and Load Functions
    public void Save(Player player) {
        String json = mapper.toJson(player, Player.class);
        fileOperator.Write(json, player.getUsername(), FileOperator.fileType.PLAYER, false);
    }
    public Player Load(String Username){
        String text = fileOperator.Read(Username + ".json", FileOperator.fileType.PLAYER);
        Player player = mapper.fromJson(text, Player.class);
        return player;
    }

    //// Singleton Design
    //// This is actually a Player factory
    private static PlayerManager playerManager;
    public static PlayerManager getInstance() {
        if(playerManager==null) { playerManager = new PlayerManager();}
        return playerManager;
    }

}
