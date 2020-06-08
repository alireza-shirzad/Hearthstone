package ir.sharif.math.ap98.hearthstone.io.fileOperation;

import ir.sharif.math.ap98.hearthstone.gui.IOConstants;
import ir.sharif.math.ap98.hearthstone.io.confLoader.DirectoryConfigLoader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileOperator {

    //// Attributes
    private static FileOperator fileOperator;
    private FileWriter fileWriter;


    //// Write and Read Methods
    public void Write(String text, String name, fileType fileType, boolean append){
        try {
            fileWriter = new FileWriter(getAddress(fileType) + "\\" + name ,append);
            fileWriter.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public String Read(String name, fileType fileType){
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(getAddress(fileType) + "/" + name)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
    public ArrayList<String> getAllFileNames(fileType fileType){
        ArrayList<String> fileNames = new ArrayList<>();
        File folder = new File(getAddress(fileType));
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile())
                fileNames.add(file.getName());
        }
        return fileNames;
    }


    private String getAddress(fileType fileType){
        switch (fileType){
            case PLAYER: return IOConstants.PLAYERS_DIRECTORY;
            case CARD: return IOConstants.CARD_DIRECTORY;
            default: return null;
        }
    }


    //// Singleton design
    public static FileOperator getInstance() {
        if(fileOperator==null) { fileOperator = new FileOperator(); }
        return fileOperator;
    }

    public enum fileType{
        CARD,
        PLAYER,
        LOG;
    }
}
