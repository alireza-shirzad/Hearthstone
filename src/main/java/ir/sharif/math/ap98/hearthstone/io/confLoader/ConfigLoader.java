package ir.sharif.math.ap98.hearthstone.io.confLoader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;


public abstract class ConfigLoader {
    protected FileInputStream fileInputStream;
    protected String propFileName;
    protected Properties properties;
    public ConfigLoader(String propFileName){
        this.propFileName = propFileName;
        try {
            this.fileInputStream = new FileInputStream(propFileName);
            this.properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPropVal(String propName){
        return properties.getProperty(propName);
        //TODO set the default value of each configuration
    }


}