package ir.sharif.math.ap98.hearthstone.characters.cards;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ir.sharif.math.ap98.hearthstone.io.confLoader.DirectoryConfigLoader;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.FileOperator;
import ir.sharif.math.ap98.hearthstone.io.json.AbstractElementAdapter;

import java.util.ArrayList;

//// Singletone design Pattern
public class CardFactory {

    private final String BaseAddress;
    private FileOperator fileOperator;
    private Gson mapper;


    private CardFactory() {
        BaseAddress = "\\Cards";
        fileOperator = FileOperator.getInstance();
        GsonBuilder gsonBilder = new GsonBuilder().setPrettyPrinting();
        gsonBilder.registerTypeAdapter(Card.class, new AbstractElementAdapter());
        mapper = gsonBilder.create();
    }
    private static CardFactory cardFactory;
    public static CardFactory getInstance() {
        if(cardFactory==null) { cardFactory = new CardFactory();}
        return cardFactory;
    }

    public void Save(Card card) {
        String json = mapper.toJson(card, Card.class);
        fileOperator.Write(json, card.getName() + ".json", FileOperator.fileType.CARD, false);
    }

    public Card make(String name){
        String text = fileOperator.Read(name + ".json", FileOperator.fileType.CARD);
        Card card = mapper.fromJson(text, Card.class);
        return card;
    }

    public ArrayList<Card> makeAllCards(){
        ArrayList<String> CardNames = FileOperator
                .getInstance().getAllFileNames(FileOperator.fileType.CARD);
        ArrayList<Card> AllCards = new ArrayList<>();
        for (String cardName : CardNames) {
            AllCards.add(make(cardName.substring(0,cardName.length()-5)));
        }
        return AllCards;
    }

}
