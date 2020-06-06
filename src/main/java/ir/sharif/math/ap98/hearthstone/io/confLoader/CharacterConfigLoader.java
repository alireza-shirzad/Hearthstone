package ir.sharif.math.ap98.hearthstone.io.confLoader;

public class CharacterConfigLoader extends ConfigLoader {
    private String propFileName;
    public CharacterConfigLoader(){
        super("src/main/resources/conf/CharacterConfig.properties");
    }

    // Singletone design pattern
    private static GraphicConfigLoader graphicConfigLoader;
    public static GraphicConfigLoader getInstance(){
        if (graphicConfigLoader == null) graphicConfigLoader = new GraphicConfigLoader();
        return graphicConfigLoader;
    }
}
