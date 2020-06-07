package ir.sharif.math.ap98.hearthstone.io.confLoader;

import java.io.IOException;

public class GraphicConfigLoader extends ConfigLoader {



    public GraphicConfigLoader(){
        super("src/main/resources/conf/graphicConfig.properties");
    }
//Singletone design pattern
    private static GraphicConfigLoader graphicConfigLoader;
    public static GraphicConfigLoader getInstance(){
        if (graphicConfigLoader == null) graphicConfigLoader = new GraphicConfigLoader();
        return graphicConfigLoader;
    }

}
