package ir.sharif.math.ap98.hearthstone.players;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.FileOperator;
import ir.sharif.math.ap98.hearthstone.io.json.AbstractElementAdapter;

import java.util.ArrayList;

public class PlayerRegistry {
    private  ArrayList<String> registeredPlayers;
    private static FileOperator fileOperator = FileOperator.getInstance();
    private static PlayerRegistry playerRegistry;
    //// Semi-Singleton Design
    public static PlayerRegistry getInstance() {
        playerRegistry = load();
        return playerRegistry;
    }


    //// Save and Load Functions
    private static void save() {
            Gson gson = new Gson();
            String json = gson.toJson(playerRegistry, PlayerRegistry.class);
            fileOperator.Write(json, "Player_Registry.json", FileOperator.fileType.PLAYER, false);
    }
    private static PlayerRegistry load(){
        Gson gson = new Gson();
        String text = fileOperator.Read("Player_Registry.json", FileOperator.fileType.PLAYER);
        playerRegistry = gson.fromJson(text, PlayerRegistry.class);
        return playerRegistry;
    }

    public void Add(Player player){
        this.registeredPlayers.add(player.getUsername());
        save();
    }
    public void Remove(Player player){
        this.registeredPlayers.remove(player.getUsername());
        save();
    }
    public boolean IsPlayer(Player player){
        return this.registeredPlayers.contains(player.getUsername());
    }


    public ArrayList<String> getregisteredPlayers() {
        return registeredPlayers;
    }

    public void setregisteredPlayers(ArrayList<String> registeredPlayers) {
        registeredPlayers = registeredPlayers;
    }
}
