import javax.swing.*;
import java.awt.*;

public class Bambino {

    JFrame bambino = new JFrame();


    JLabel calzeBambino = new JLabel("calze dinosauri");
    JButton btnCalze = new JButton("Aggiungi al carrello");

    JLabel scarpeGeox = new JLabel("scarpe Geox");
    JButton btnScarpe = new JButton("Aggiungi al carrello");

    JLabel pantaloniZaraKids = new JLabel("pantaloni Zara Kids");
    JButton btnPantaloni = new JButton("Aggiungi al carrello");

    JLabel magliettaOVS = new JLabel("maglietta OVS");
    JButton btnMaglietta = new JButton("Aggiungi al carrello");

    JLabel giaccaBenetton = new JLabel("giacca Benetton");
    JButton btnGiacca = new JButton("Aggiungi al carrello");

    JLabel cappelloGap = new JLabel("cappello GAP");
    JButton btnCappello = new JButton("Aggiungi al carrello");

    JLabel zainoSeven = new JLabel("zaino Seven");
    JButton btnZaino = new JButton("Aggiungi al carrello");

    JLabel felpaNike = new JLabel("felpa Nike");
    JButton btnFelpa = new JButton("Aggiungi al carrello");

    public Bambino(){

        bambino.setSize(400,400);
        bambino.setVisible(true);

        bambino.setLayout(new BorderLayout(10,30));

        ImageIcon im1=new ImageIcon("immagini/im1.jpg");
        calzeBambino.setIcon(im1);
        calzeBambino.setPreferredSize(new Dimension(200,200));

        ImageIcon im2=new ImageIcon("immagini/im2.jpg");
        scarpeGeox.setIcon(im2);
        scarpeGeox.setPreferredSize(new Dimension(200,200));

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


        bambino.setLocationRelativeTo(null);
    }
}
