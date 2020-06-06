package ir.sharif.math.ap98.hearthstone.io.confLoader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;


public abstract class ConfigLoader {
    protected InputStream inputStream;
    protected String propFileName;
    protected Properties properties;
    public ConfigLoader(String propFileName){
        this.propFileName = propFileName;
        this.properties = new Properties();
        loadProp();
    }
    private void loadProp(){
        inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        try {
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String  getPropVal(String propName){
        return properties.getProperty(propName);
        //TODO set the default value of each configuration
    }


}