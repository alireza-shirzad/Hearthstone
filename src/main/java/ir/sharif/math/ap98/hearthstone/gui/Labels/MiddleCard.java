package ir.sharif.math.ap98.hearthstone.gui.Labels;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.Minion_Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.Weapon_Card;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;
import java.awt.event.MouseAdapter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class MiddleCard extends JLabel {
    private Card card;
    public MiddleCard() {
        this.card = card;
        int w = 100;
        int h = 200;
        this.setPreferredSize(new Dimension(w, h));
        this.requestFocus();
        this.setOpaque(false);

        //setTransferHandler(new TransferHandler("icon"));
        //MouseListener listener = new DragMouseAdapter();

        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBorder(BorderFactory.createLineBorder(GUIConstants.COLOR5, 4, true));
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                setBorder(BorderFactory.createEmptyBorder());
            }
        });




        paintButton(card, w, h);
    }




    private void paintButton(Card card, int w, int h){
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
}
