package ir.sharif.math.ap98.hearthstone.io.fileOperation;

import ir.sharif.math.ap98.hearthstone.io.confLoader.DirectoryConfigLoader;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageOperater {

    //// Singleton Design
    private static ImageOperater imageOperater;
    public static ImageOperater getInstance(){
        if(imageOperater==null) { imageOperater = new ImageOperater();}
        return imageOperater;
    }

    //// Read Method
    public Image Read(String name, imageType imageType){
        String AbsoluteAddress = getAddress(imageType)+ "/" + name;
        try {
            return ImageIO.read(new File(AbsoluteAddress));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String getAddress(imageType imageType){
        String BaseAddress = DirectoryConfigLoader.getInstance().getPropVal("imageDirectory");
        switch (imageType){
            case BACKGROUND: return BaseAddress + "/Background";
            case LOGO: return BaseAddress + "/Logo";
            default: return null;
        }
    }


    public enum imageType{
        BACKGROUND,
        LOGO;
    }

}
