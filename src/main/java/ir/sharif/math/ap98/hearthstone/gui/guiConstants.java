package ir.sharif.math.ap98.hearthstone.gui;

import ir.sharif.math.ap98.hearthstone.io.confLoader.GraphicConfigLoader;

public final  class guiConstants {

        public static final int FRAME_WIDTH;
        public static final int FRAME_HEIGHT;
        public static final int RENDERING_SPEED;
        public static final String GAME_TITLE;
        public static final String DEFAULTBACKGROUND_ADDRESS;
        static {
            FRAME_WIDTH = Integer.valueOf(GraphicConfigLoader.getInstance().getPropVal("frameWidth"));
            FRAME_HEIGHT = Integer.valueOf(GraphicConfigLoader.getInstance().getPropVal("frameHeight"));
            RENDERING_SPEED = Integer.valueOf(GraphicConfigLoader.getInstance().getPropVal("renderingSpeed"));
            GAME_TITLE = GraphicConfigLoader.getInstance().getPropVal("gameTitle");
            DEFAULTBACKGROUND_ADDRESS = GraphicConfigLoader.getInstance().getPropVal("defaultBackgroundAddress");;
        }


}
