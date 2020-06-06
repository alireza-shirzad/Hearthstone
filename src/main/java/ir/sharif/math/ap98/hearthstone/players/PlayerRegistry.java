package ir.sharif.math.ap98.hearthstone.players;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.FileOperator;
import ir.sharif.math.ap98.hearthstone.io.json.AbstractElementAdapter;

import java.util.ArrayList;

public class PlayerRegistry {
    private  ArrayList<String> RegisteredPlayers;
    private static FileOperator fileOperator = FileOperator.getInstance();
    private static PlayerRegistry playerRegistry;
    //// Semi-Singleton Design
    public static PlayerRegistry getInstance() {
        playerRegistry = load();
        return playerRegistry;
    }

    //// Save and Load Functions
    private static void save() {
            GsonBuilder gsonBilder = new GsonBuilder().setPrettyPrinting();
            gsonBilder.registerTypeAdapter(PlayerRegistry.class, new AbstractElementAdapter());
            Gson mapper = gsonBilder.create();
            String json = mapper.toJson(playerRegistry, Card.class);
            fileOperator.Write(json, "Player_Registry.json", FileOperator.fileType.PLAYER, false);
    }
    private static PlayerRegistry load(){
        GsonBuilder gsonBilder = new GsonBuilder().setPrettyPrinting();
        gsonBilder.registerTypeAdapter(PlayerRegistry.class, new AbstractElementAdapter());
        Gson mapper = gsonBilder.create();
        String text = fileOperator.Read("Player_Registry.json", FileOperator.fileType.PLAYER);
        playerRegistry = mapper.fromJson(text, PlayerRegistry.class);
        return playerRegistry;
    }

    public void Add(Player player){
        this.RegisteredPlayers.add(player.getUsername());
        save();
    }
    public void Remove(Player player){
        this.RegisteredPlayers.remove(player.getUsername());
        save();
    }
    public boolean IsPlayer(Player player){
        return this.RegisteredPlayers.contains(player.getUsername());
    }


    public ArrayList<String> getRegisteredPlayers() {
        return RegisteredPlayers;
    }

    public void setRegisteredPlayers(ArrayList<String> registeredPlayers) {
        RegisteredPlayers = registeredPlayers;
    }
}
