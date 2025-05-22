import javax.swing.*;
import java.awt.*;

public class Bambino {

    JFrame bambino = new JFrame();

    JLabel calzeBambino = new JLabel("calze nike");
    JLabel scarpeGeox = new JLabel("scarpe Geox");
    JLabel pantaloniZaraKids = new JLabel("pantaloni Zara Kids");
    JLabel magliettaOVS = new JLabel("maglietta OVS");
    JLabel giaccaBenetton = new JLabel("giacca Benetton");
    JLabel cappelloGap = new JLabel("cappello GAP");
    JLabel zainoSeven = new JLabel("zaino Seven");
    JLabel felpaNike = new JLabel("felpa Nike");

    public Bambino(){

        bambino.setSize(400,400);
        bambino.setVisible(true);

        bambino.setLayout(new BorderLayout(10,30));

        ImageIcon im1=new ImageIcon("immagini/im1.jpg");
        calzeBambino.setIcon(im1);
        calzeBambino.setPreferredSize(new Dimension(200,200));

        bambino.add(calzeBambino);


        bambino.setLocationRelativeTo(null);
    }
}
