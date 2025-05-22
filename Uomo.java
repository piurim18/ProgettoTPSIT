import javax.swing.*;
import java.awt.*;

public class Uomo {

    JFrame uomo = new JFrame();

    JLabel jeansLevis = new JLabel("jeans Levi's");
    JLabel camiciaHugoBoss = new JLabel("camicia Hugo Boss");
    JLabel giaccaNorthFace = new JLabel("giacca The North Face");
    JLabel poloLacoste = new JLabel("polo Lacoste");
    JLabel scarpeNike = new JLabel("scarpe Nike");
    JLabel pantaloniDockers = new JLabel("pantaloni Dockers");
    JLabel tShirtAdidas = new JLabel("t-shirt Adidas");
    JLabel cappottoZaraMan = new JLabel("cappotto Zara Man");

    public Uomo(){


        uomo.setSize(500,500);
        uomo.setVisible(true);

        uomo.setLayout(new GridLayout(4,4));

        ImageIcon im15=new ImageIcon("immagini/im15.jpg");
        int largo15 = 100;
        int alto15 = 100;
        Image resizedImage = im15.getImage().getScaledInstance(largo15, alto15, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon15 = new ImageIcon(resizedImage);

        jeansLevis.setIcon(resizedIcon15);
        jeansLevis.setPreferredSize(new Dimension(largo15, alto15));

        jeansLevis.setPreferredSize(new Dimension(400,300));



        ImageIcon im16=new ImageIcon("immagini/im16.jpg");
        int largo16 = 100;
        int alto16 = 100;
        Image resizedImage16 = im16.getImage().getScaledInstance(largo16, alto16, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon16 = new ImageIcon(resizedImage16);

        camiciaHugoBoss.setIcon(resizedIcon16);
        camiciaHugoBoss.setPreferredSize(new Dimension(largo16, alto16));

        camiciaHugoBoss.setPreferredSize(new Dimension(400,300));




        ImageIcon im17=new ImageIcon("immagini/im17.jpg");
        int largo17 = 100;
        int alto17 = 100;
        Image resizedImage17 = im17.getImage().getScaledInstance(largo17, alto17, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon17 = new ImageIcon(resizedImage17);

        giaccaNorthFace.setIcon(resizedIcon17);
        giaccaNorthFace.setPreferredSize(new Dimension(largo17, alto17));

        giaccaNorthFace.setPreferredSize(new Dimension(400,300));




        ImageIcon im18=new ImageIcon("immagini/im18.jpg");
        int largo18 = 100;
        int alto18 = 100;
        Image resizedImage18 = im18.getImage().getScaledInstance(largo18, alto18, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon18 = new ImageIcon(resizedImage18);

        poloLacoste.setIcon(resizedIcon18);
        poloLacoste.setPreferredSize(new Dimension(largo18, alto18));

        poloLacoste.setPreferredSize(new Dimension(400,300));




        ImageIcon im19=new ImageIcon("immagini/im19.jpg");
        int largo19 = 100;
        int alto19 = 100;
        Image resizedImage19 = im19.getImage().getScaledInstance(largo19, alto19, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon19 = new ImageIcon(resizedImage19);

        scarpeNike.setIcon(resizedIcon19);
        scarpeNike.setPreferredSize(new Dimension(largo19, alto19));

        scarpeNike.setPreferredSize(new Dimension(400,300));




        ImageIcon im20=new ImageIcon("immagini/im20.jpg");
        int largo20 = 100;
        int alto20 = 100;
        Image resizedImage20 = im20.getImage().getScaledInstance(largo20, alto20, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon20 = new ImageIcon(resizedImage20);

        pantaloniDockers.setIcon(resizedIcon20);
        pantaloniDockers.setPreferredSize(new Dimension(largo20, alto20));

        pantaloniDockers.setPreferredSize(new Dimension(400,300));




        ImageIcon im21=new ImageIcon("immagini/im21.jpg");
        int largo21 = 100;
        int alto21 = 100;
        Image resizedImage21 = im21.getImage().getScaledInstance(largo21, alto21, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon21 = new ImageIcon(resizedImage21);

        tShirtAdidas.setIcon(resizedIcon21);
        tShirtAdidas.setPreferredSize(new Dimension(largo21, alto21));

        tShirtAdidas.setPreferredSize(new Dimension(400,300));




        ImageIcon im22=new ImageIcon("immagini/im22.jpg");
        int largo22 = 100;
        int alto22 = 100;
        Image resizedImage22 = im22.getImage().getScaledInstance(largo22, alto22, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon22 = new ImageIcon(resizedImage22);

        cappottoZaraMan.setIcon(resizedIcon22);
        cappottoZaraMan.setPreferredSize(new Dimension(largo22, alto22));

        cappottoZaraMan.setPreferredSize(new Dimension(400,300));



        uomo.add(jeansLevis);
        uomo.add(camiciaHugoBoss);
        uomo.add(giaccaNorthFace);
        uomo.add(poloLacoste);
        uomo.add(scarpeNike);
        uomo.add(pantaloniDockers);
        uomo.add(tShirtAdidas);
        uomo.add(cappottoZaraMan);


        uomo.setLocationRelativeTo(null);
    }

}
