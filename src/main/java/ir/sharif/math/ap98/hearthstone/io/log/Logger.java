package ir.sharif.math.ap98.hearthstone.io.log;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.FileOperator;
import ir.sharif.math.ap98.hearthstone.players.Player;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private String name ;

    public Logger(Player player, boolean firstTime){
        name = player.getUsername() + "-" + player.getId() ;
        if (firstTime){
            String Header = "'''Header'''\nUSER: " + player.getUsername() + "\nCREATED AT: "
                    + dateTime() + "\nPASSWORD HASH: " + player .getPasswordHash()+
                    "\n ---------------------------------------------------" +
                    "\n'''Body'''" ;
            FileOperator.getInstance().Write(Header, player.getUsername() + "-" + player.getId(), FileOperator.fileType.LOG,false);
        }
    }

    public void log(EventType eventType, String Origin, String Description){
        String LogText = "\n" + eventType + "|Date & Time: " + dateTime() + "|Origin: " + Origin + ">>>" + Description;
        FileOperator.getInstance().Write(LogText, name, FileOperator.fileType.LOG,true);
    }

    private static String dateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }



    //// Singletone Design
    private static Logger logger;
    public static Logger access() {
        return logger;
    }
    public static void createLogger(Player player){
        logger = new Logger(player,true);
    }
    public static void loadLogger(Player player){
        logger = new Logger(player,false);
    }
}

