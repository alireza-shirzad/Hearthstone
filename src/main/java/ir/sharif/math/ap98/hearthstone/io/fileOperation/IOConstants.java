package ir.sharif.math.ap98.hearthstone.gui;

import ir.sharif.math.ap98.hearthstone.io.confLoader.DirectoryConfigLoader;
import ir.sharif.math.ap98.hearthstone.io.confLoader.GraphicConfigLoader;

import java.awt.*;

public final  class IOConstants {

    public static final String  PLAYERS_DIRECTORY;
    public static final String CARD_DIRECTORY;
    public static final String SOUND_DIRECTORY;
    public static final String IMAGE_DIRECTORY;
    public static final String LOG_DIRECTORY;

    static {
        PLAYERS_DIRECTORY = DirectoryConfigLoader.getInstance().getPropVal("playersDirectory");
        CARD_DIRECTORY = DirectoryConfigLoader.getInstance().getPropVal("cardDirectory");
        IMAGE_DIRECTORY = DirectoryConfigLoader.getInstance().getPropVal("imageDirectory");
        LOG_DIRECTORY = DirectoryConfigLoader.getInstance().getPropVal("logDirectory");
        SOUND_DIRECTORY = DirectoryConfigLoader.getInstance().getPropVal("soundDirectory");

    }


}
