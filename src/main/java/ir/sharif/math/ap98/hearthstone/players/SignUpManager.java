package ir.sharif.math.ap98.hearthstone.players;

import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.io.log.Logger;

public class SignUpManager extends SignManager {

    public SignUpManager() {super();}
    private static SignUpManager signUpManager;
    public static SignUpManager getInstance() {
        if(signUpManager==null) { signUpManager = new SignUpManager();}
        return signUpManager;
    }


    public Result signUp(String Username, String Password){
        PlayerRegistry playerRegistry = PlayerRegistry.getInstance();
        Player player = new Player(Username,passToHash(Password));
        if(playerRegistry.IsPlayer(player)) return Result.Error_UsernameAlreadyUsed;
        else{
            playerRegistry.Add(player);
            playerManager.Save(player);
            GameState.getInstance().setCurrentPlayer(player);
            GameState.getInstance().setCurrentDeck(null);
            return Result.Success;
        }
    }


    public enum Result{
        Success,
        Error_UsernameAlreadyUsed;
    }
}
