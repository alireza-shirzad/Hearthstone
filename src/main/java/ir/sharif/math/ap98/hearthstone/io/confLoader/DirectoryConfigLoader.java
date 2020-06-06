package ir.sharif.math.ap98.hearthstone.io.confLoader;

public class DirectoryConfigLoader extends ConfigLoader {

    private String propFileName;
    public DirectoryConfigLoader(){
        super("main/resources/conf/directoryConfig.properties");
    }

    // Singletone design pattern
    private static DirectoryConfigLoader directoryConfigLoader;
    public static DirectoryConfigLoader getInstance(){
        if (directoryConfigLoader == null) directoryConfigLoader = new DirectoryConfigLoader();
        return directoryConfigLoader;
    }

}
