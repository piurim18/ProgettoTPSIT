import javax.swing.*;
import java.awt.*;

public class Bambino {

    JFrame bambino = new JFrame();


    JLabel calzeBambino = new JLabel("calze dinosauri");

    JLabel scarpeGeox = new JLabel("scarpe Geox");

    JLabel pantaloniZaraKids = new JLabel("pantaloni Zara Kids");

    JLabel magliettaOVS = new JLabel("maglietta OVS");

    JLabel giaccaBenetton = new JLabel("giacca Benetton");

    JLabel cappelloGap = new JLabel("cappello GAP");

    JLabel zainoSeven = new JLabel("zaino Seven");

    JLabel felpaNike = new JLabel("felpa Nike");

    public Bambino(){

        bambino.setSize(1000,1000);
        bambino.setVisible(true);

        bambino.setLayout(new GridLayout(8,3));

        ImageIcon im1=new ImageIcon("immagini/im1.jpg");
        int newWidth = 100; // larghezza desiderata
        int newHeight = 100; // altezza desiderata
        Image resizedImage = im1.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        // Crea un JLabel e imposta l'icona ridimensionata
        JLabel calzeBambino = new JLabel();
        calzeBambino.setIcon(resizedIcon);
        calzeBambino.setPreferredSize(new Dimension(newWidth, newHeight));

        calzeBambino.setIcon(im1);
        calzeBambino.setPreferredSize(new Dimension(400,300));


        ImageIcon im2=new ImageIcon("immagini/im2.jpg");
        scarpeGeox.setIcon(im2);
        scarpeGeox.setPreferredSize(new Dimension(100,100));

        ImageIcon im3=new ImageIcon("immagini/im3.jpg");
        pantaloniZaraKids.setIcon(im3);
        pantaloniZaraKids.setPreferredSize(new Dimension(200,200));

        ImageIcon im4=new ImageIcon("immagini/im4.jpg");
        magliettaOVS.setIcon(im4);
        magliettaOVS.setPreferredSize(new Dimension(200,200));

        ImageIcon im5=new ImageIcon("immagini/im5.jpg");
        giaccaBenetton.setIcon(im5);
        giaccaBenetton.setPreferredSize(new Dimension(200,200));

        ImageIcon im6=new ImageIcon("immagini/im6.jpg");
        cappelloGap.setIcon(im6);
        cappelloGap.setPreferredSize(new Dimension(200,200));

        ImageIcon im7=new ImageIcon("immagini/im7.jpg");
        zainoSeven.setIcon(im7);
        zainoSeven.setPreferredSize(new Dimension(200,200));

        ImageIcon im8=new ImageIcon("immagini/im8.jpg");
        felpaNike.setIcon(im8);
        felpaNike.setPreferredSize(new Dimension(200,200));

        bambino.add(calzeBambino);
        bambino.add(scarpeGeox);


        bambino.setLocationRelativeTo(null);
    }
}
