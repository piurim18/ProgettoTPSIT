import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    JButton goCatalogo = new JButton("torna al catalogo");

    public Uomo() {
        uomo.setSize(600, 700);
        uomo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uomo.setLayout(new BorderLayout());

        JPanel panelProd = new JPanel(new GridLayout(4, 2, 10, 10));
        panelProd.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        ImageIcon im15 = new ImageIcon("immagini/im15.jpg");
        Image img15 = im15.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        jeansLevis.setIcon(new ImageIcon(img15));
        jeansLevis.setHorizontalTextPosition(JLabel.CENTER);
        jeansLevis.setVerticalTextPosition(JLabel.BOTTOM);
        jeansLevis.setHorizontalAlignment(JLabel.CENTER);
        panelProd.add(jeansLevis);


        ImageIcon im16 = new ImageIcon("immagini/im16.jpg");
        Image img16 = im16.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        camiciaHugoBoss.setIcon(new ImageIcon(img16));
        camiciaHugoBoss.setHorizontalTextPosition(JLabel.CENTER);
        camiciaHugoBoss.setVerticalTextPosition(JLabel.BOTTOM);
        camiciaHugoBoss.setHorizontalAlignment(JLabel.CENTER);
        panelProd.add(camiciaHugoBoss);


        ImageIcon im17 = new ImageIcon("immagini/im17.jpg");
        Image img17 = im17.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        giaccaNorthFace.setIcon(new ImageIcon(img17));
        giaccaNorthFace.setHorizontalTextPosition(JLabel.CENTER);
        giaccaNorthFace.setVerticalTextPosition(JLabel.BOTTOM);
        giaccaNorthFace.setHorizontalAlignment(JLabel.CENTER);
        panelProd.add(giaccaNorthFace);


        ImageIcon im18 = new ImageIcon("immagini/im18.jpg");
        Image img18 = im18.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        poloLacoste.setIcon(new ImageIcon(img18));
        poloLacoste.setHorizontalTextPosition(JLabel.CENTER);
        poloLacoste.setVerticalTextPosition(JLabel.BOTTOM);
        poloLacoste.setHorizontalAlignment(JLabel.CENTER);
        panelProd.add(poloLacoste);


        ImageIcon im19 = new ImageIcon("immagini/im19.jpg");
        Image img19 = im19.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        scarpeNike.setIcon(new ImageIcon(img19));
        scarpeNike.setHorizontalTextPosition(JLabel.CENTER);
        scarpeNike.setVerticalTextPosition(JLabel.BOTTOM);
        scarpeNike.setHorizontalAlignment(JLabel.CENTER);
        panelProd.add(scarpeNike);


        ImageIcon im20 = new ImageIcon("immagini/im20.jpg");
        Image img20 = im20.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        pantaloniDockers.setIcon(new ImageIcon(img20));
        pantaloniDockers.setHorizontalTextPosition(JLabel.CENTER);
        pantaloniDockers.setVerticalTextPosition(JLabel.BOTTOM);
        pantaloniDockers.setHorizontalAlignment(JLabel.CENTER);
        panelProd.add(pantaloniDockers);


        ImageIcon im21 = new ImageIcon("immagini/im21.jpg");
        Image img21 = im21.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        tShirtAdidas.setIcon(new ImageIcon(img21));
        tShirtAdidas.setHorizontalTextPosition(JLabel.CENTER);
        tShirtAdidas.setVerticalTextPosition(JLabel.BOTTOM);
        tShirtAdidas.setHorizontalAlignment(JLabel.CENTER);
        panelProd.add(tShirtAdidas);


        ImageIcon im22 = new ImageIcon("immagini/im22.jpg");
        Image img22 = im22.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        cappottoZaraMan.setIcon(new ImageIcon(img22));
        cappottoZaraMan.setHorizontalTextPosition(JLabel.CENTER);
        cappottoZaraMan.setVerticalTextPosition(JLabel.BOTTOM);
        cappottoZaraMan.setHorizontalAlignment(JLabel.CENTER);
        panelProd.add(cappottoZaraMan);

        uomo.add(panelProd, BorderLayout.CENTER);

        JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        goCatalogo.setPreferredSize(new Dimension(200, 40));
        panelButton.add(goCatalogo);
        goCatalogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameCatalogo();
                uomo.dispose();
            }
        });
        uomo.add(panelButton, BorderLayout.SOUTH);

        uomo.setLocationRelativeTo(null);
        uomo.setVisible(true);
    }
}
