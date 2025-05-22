import javax.swing.*;
import java.awt.*;

public class Donna {

    JFrame frameDonna = new JFrame();

    JLabel vestitoDonna = new JLabel("vestito estivo");
    JButton aggiungiVestitoDonna = new JButton("Aggiungi al carrello");

    JLabel mutandeDonna = new JLabel("mutande Victoria's Secret");
    JButton aggiungiMutandeDonna = new JButton("Aggiungi al carrello");

    JLabel reggiseno = new JLabel("reggiseno");
    JButton aggiungiReggiseno = new JButton("Aggiungi al carrello");

    JLabel jeansDonna = new JLabel("jeans baggie");
    JButton aggiungiJeansDonna = new JButton("Aggiungi al carrello");

    JLabel magliaDonna = new JLabel("maglia Nike");
    JButton aggiungiMagliaDonna = new JButton("Aggiungi al carrello");

    JLabel cappelloDonna = new JLabel("cappellino New Era");
    JButton aggiungiCappelloDonna = new JButton("Aggiungi al carrello");


    public Donna(){

        frameDonna.setPreferredSize(new Dimension(400,400));
        frameDonna.setLayout(new GridLayout(6,2));



        frameDonna.pack();
        frameDonna.setVisible(true);
        frameDonna.setLocationRelativeTo(null);
    }

}
