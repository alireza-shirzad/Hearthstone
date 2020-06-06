package ir.sharif.math.ap98.hearthstone.players;

public class SignInManager extends SignManager{

    private SignInManager() {super();}
    private static SignInManager signInManager;
    public static SignInManager getInstance() {
        if(signInManager==null) { signInManager = new SignInManager();}
        return signInManager;
    }


    public Result signIn(String Username, String Password){
        PlayerRegistry playerRegistry = PlayerRegistry.getInstance();
        Player player = new Player(Username,passToHash(Password));
        if(!playerRegistry.IsPlayer(player)) return Result.Error_UsernameNotFound;
        else {
            player = playerManager.Load(Username);
            if (!player.getPasswordHash().equals(passToHash(Password))) return Result.Error_WrongPassword;
            else{
                return Result.Success;
            }
        }
    }




    public enum Result{
        Success,
        Error_UsernameNotFound,
        Error_WrongPassword;
    }
}
