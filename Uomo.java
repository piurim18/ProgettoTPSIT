import javax.swing.*;
import java.awt.*;

public class Uomo {
    JFrame frameUomo = new JFrame();
    JLabel jeansLevis = new JLabel("jeans Levi's");
    JButton aggiungiJeansLevis = new JButton("Aggiungi al carrello");

    JLabel camiciaHugoBoss = new JLabel("camicia Hugo Boss");
    JButton aggiungiCamiciaHugoBoss = new JButton("Aggiungi al carrello");

    JLabel giaccaNorthFace = new JLabel("giacca The North Face");
    JButton aggiungiGiaccaNorthFace = new JButton("Aggiungi al carrello");

    JLabel poloLacoste = new JLabel("polo Lacoste");
    JButton aggiungiPoloLacoste = new JButton("Aggiungi al carrello");

    JLabel scarpeNike = new JLabel("scarpe Nike");
    JButton aggiungiScarpeNike = new JButton("Aggiungi al carrello");

    JLabel pantaloniDockers = new JLabel("pantaloni Dockers");
    JButton aggiungiPantaloniDockers = new JButton("Aggiungi al carrello");

    JLabel tShirtAdidas = new JLabel("t-shirt Adidas");
    JButton aggiungiTShirtAdidas = new JButton("Aggiungi al carrello");

    JLabel cappottoZaraMan = new JLabel("cappotto Zara Man");
    JButton aggiungiCappottoZaraMan = new JButton("Aggiungi al carrello");


    public Uomo(){
        frameUomo.setPreferredSize(new Dimension(400,400));
        frameUomo.setLayout(new GridLayout(8,2));



        frameUomo.pack();
        frameUomo.setVisible(true);
        frameUomo.setLocationRelativeTo(null);
    }

}
