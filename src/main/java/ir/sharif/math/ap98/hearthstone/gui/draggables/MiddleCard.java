package ir.sharif.math.ap98.hearthstone.gui.draggables;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.Minion_Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.Weapon_Card;
import ir.sharif.math.ap98.hearthstone.game.GameEntity;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public abstract class MiddleCard extends JLabel {


    private volatile int screenX ;
    private volatile int screenY ;
    private volatile int myX ;
    private volatile int myY ;

    private static MiddleCard destinationCard;
    private static boolean cardInMove;

    public MiddleCard(Card card, int num) {
        paintCard(card,130,140);
    }




    private void paintCard(Card card, int w, int h){
        Font font = new Font(GUIConstants.HEADER1_FONT_NAME,Font.BOLD,90);
        Image img = ImageOperater.getInstance().Read(card.getName() + ".png"
                , ImageOperater.imageType.CARD);
        Graphics2D g2D = (Graphics2D) img.getGraphics();
        g2D.setFont(font);
        g2D.drawString(String.valueOf(card.getManaCost()),35,95);
        switch (card.getCardType()){
            case Minion:
                Minion_Card minion_card = (Minion_Card) card;
                g2D.drawImage(ImageOperater.getInstance().Read("HP.png", ImageOperater.imageType.ICON),310,450,80,110,null);
                g2D.drawImage(ImageOperater.getInstance().Read("Attack.png", ImageOperater.imageType.ICON),-10,420,150,160,null);
                g2D.drawString(String.valueOf(minion_card.getAttack()),40,540);
                g2D.drawString(String.valueOf(minion_card.getHealth()),320,540);
                break;
            case Weapon:
                Weapon_Card weapon_card = (Weapon_Card) card;
                g2D.drawString(String.valueOf(weapon_card.getAttack()),40,540);
                g2D.drawString(String.valueOf(weapon_card.getDurability()),320,540);
                break;
        }
        Image newimg = img.getScaledInstance( w, h,  java.awt.Image.SCALE_SMOOTH ) ;
        this.setIcon(new ImageIcon(newimg));
    }



    protected void lockDnD(MatchState.EntityType type){
        addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) { }

            @Override
            public void mousePressed(MouseEvent e) {
                if (MatchState.get().getTurn()==type) {
                    setScreenX(e.getXOnScreen());
                    setScreenY(e.getYOnScreen());
                    setMyX(getX());
                    setMyY(getY());
                    setCardInMove(true);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (MatchState.get().getTurn()==type) {
                    setLocation(getMyX(), getMyY());
                    setCardInMove(false);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) { }

        });
        addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                if (MatchState.get().getTurn()==type) {
                    int deltaX = e.getXOnScreen() - getScreenX();
                    int deltaY = e.getYOnScreen() - getScreenY();
                    setLocation(getMyX() + deltaX, getMyY() + deltaY);
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }

        });
    }




    public int getScreenX() {
        return screenX;
    }

    public void setScreenX(int screenX) {
        this.screenX = screenX;
    }

    public int getScreenY() {
        return screenY;
    }

    public void setScreenY(int screenY) {
        this.screenY = screenY;
    }

    public int getMyX() {
        return myX;
    }

    public void setMyX(int myX) {
        this.myX = myX;
    }

    public int getMyY() {
        return myY;
    }

    public void setMyY(int myY) {
        this.myY = myY;
    }

    public static MiddleCard getDestinationCard() {
        return destinationCard;
    }

    public static void setDestinationCard(MiddleCard destinationCard) {
        MiddleCard.destinationCard = destinationCard;
    }

    public static boolean isCardInMove() {
        return cardInMove;
    }

    public static void setCardInMove(boolean cardInMove) {
        MiddleCard.cardInMove = cardInMove;
    }
}
