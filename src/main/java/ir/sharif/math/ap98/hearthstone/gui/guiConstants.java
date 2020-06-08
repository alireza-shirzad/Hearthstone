package ir.sharif.math.ap98.hearthstone.gui;

import ir.sharif.math.ap98.hearthstone.io.confLoader.GraphicConfigLoader;

import java.awt.*;

public final  class GUIConstants {

        public static final int FRAME_WIDTH;
        public static final int FRAME_HEIGHT;
        public static final int RENDERING_SPEED;
        public static final String GAME_TITLE;
        public static final String DEFAULTBACKGROUND_ADDRESS;
        public static final String HEADER_FONT_NAME;
        public static final int HEADER_FONT_SIZE;
        public static final String HEADER1_FONT_NAME;
        public static final int HEADER1_FONT_SIZE;
        public static final Color COLOR1;
        public static final Color COLOR2;
        public static final Color COLOR3;
        public static final Color COLOR4;
        public static final Color COLOR5;
        static {
            FRAME_WIDTH = Integer.valueOf(GraphicConfigLoader.getInstance().getPropVal("frameWidth"));
            FRAME_HEIGHT = Integer.valueOf(GraphicConfigLoader.getInstance().getPropVal("frameHeight"));
            RENDERING_SPEED = Integer.valueOf(GraphicConfigLoader.getInstance().getPropVal("renderingSpeed"));
            GAME_TITLE = GraphicConfigLoader.getInstance().getPropVal("gameTitle");
            DEFAULTBACKGROUND_ADDRESS = GraphicConfigLoader.getInstance().getPropVal("defaultBackgroundAddress");
            COLOR1 = new Color(38,42,54);
            COLOR2 = new Color(176, 177, 171);
            COLOR3 = new Color(94,98,109);
            COLOR4 = new Color(139,109,181);
            COLOR5 = new Color(202,207,203);
            HEADER_FONT_NAME = "MAD hacker";
            HEADER1_FONT_NAME = "Stencil";
            HEADER_FONT_SIZE = 90;
            HEADER1_FONT_SIZE = 40;
        }


}
