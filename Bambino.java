import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    JButton goCatalogo = new JButton("torna al catalogo");

    public Bambino() {
        bambino.setSize(600, 700);
        bambino.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bambino.setLayout(new BorderLayout());

        JPanel panelProd = new JPanel(new GridLayout(4, 2, 10, 10));
        panelProd.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelProd.setOpaque(true);
        panelProd.setBackground(Color.black);

        ImageIcon im1 = new ImageIcon("immagini/im1.jpg");
        Image img1 = im1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        calzeBambino.setIcon(new ImageIcon(img1));
        calzeBambino.setHorizontalTextPosition(JLabel.CENTER);
        calzeBambino.setVerticalTextPosition(JLabel.BOTTOM);
        calzeBambino.setHorizontalAlignment(JLabel.CENTER);
        calzeBambino.setOpaque(true);
        calzeBambino.setBackground(Color.black);
        calzeBambino.setForeground(Color.white);
        panelProd.add(calzeBambino);


        ImageIcon im2 = new ImageIcon("immagini/im2.jpg");
        Image img2 = im2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        scarpeGeox.setIcon(new ImageIcon(img2));
        scarpeGeox.setHorizontalTextPosition(JLabel.CENTER);
        scarpeGeox.setVerticalTextPosition(JLabel.BOTTOM);
        scarpeGeox.setHorizontalAlignment(JLabel.CENTER);
        scarpeGeox.setOpaque(true);
        scarpeGeox.setBackground(Color.black);
        scarpeGeox.setForeground(Color.white);
        panelProd.add(scarpeGeox);


        ImageIcon im3 = new ImageIcon("immagini/im3.jpg");
        Image img3 = im3.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        pantaloniZaraKids.setIcon(new ImageIcon(img3));
        pantaloniZaraKids.setHorizontalTextPosition(JLabel.CENTER);
        pantaloniZaraKids.setVerticalTextPosition(JLabel.BOTTOM);
        pantaloniZaraKids.setHorizontalAlignment(JLabel.CENTER);
        pantaloniZaraKids.setOpaque(true);
        pantaloniZaraKids.setBackground(Color.black);
        pantaloniZaraKids.setForeground(Color.white);
        panelProd.add(pantaloniZaraKids);


        ImageIcon im4 = new ImageIcon("immagini/im4.jpg");
        Image img4 = im4.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        magliettaOVS.setIcon(new ImageIcon(img4));
        magliettaOVS.setHorizontalTextPosition(JLabel.CENTER);
        magliettaOVS.setVerticalTextPosition(JLabel.BOTTOM);
        magliettaOVS.setHorizontalAlignment(JLabel.CENTER);
        magliettaOVS.setOpaque(true);
        magliettaOVS.setBackground(Color.black);
        magliettaOVS.setForeground(Color.white);
        panelProd.add(magliettaOVS);


        ImageIcon im5 = new ImageIcon("immagini/im5.jpg");
        Image img5 = im5.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        giaccaBenetton.setIcon(new ImageIcon(img5));
        giaccaBenetton.setHorizontalTextPosition(JLabel.CENTER);
        giaccaBenetton.setVerticalTextPosition(JLabel.BOTTOM);
        giaccaBenetton.setHorizontalAlignment(JLabel.CENTER);
        giaccaBenetton.setOpaque(true);
        giaccaBenetton.setBackground(Color.black);
        giaccaBenetton.setForeground(Color.white);
        panelProd.add(giaccaBenetton);


        ImageIcon im6 = new ImageIcon("immagini/im6.jpg");
        Image img6 = im6.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        cappelloGap.setIcon(new ImageIcon(img6));
        cappelloGap.setHorizontalTextPosition(JLabel.CENTER);
        cappelloGap.setVerticalTextPosition(JLabel.BOTTOM);
        cappelloGap.setHorizontalAlignment(JLabel.CENTER);
        cappelloGap.setOpaque(true);
        cappelloGap.setBackground(Color.black);
        cappelloGap.setForeground(Color.white);
        panelProd.add(cappelloGap);


        ImageIcon im7 = new ImageIcon("immagini/im7.jpg");
        Image img7 = im7.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        zainoSeven.setIcon(new ImageIcon(img7));
        zainoSeven.setHorizontalTextPosition(JLabel.CENTER);
        zainoSeven.setVerticalTextPosition(JLabel.BOTTOM);
        zainoSeven.setHorizontalAlignment(JLabel.CENTER);
        zainoSeven.setOpaque(true);
        zainoSeven.setBackground(Color.black);
        zainoSeven.setForeground(Color.white);
        panelProd.add(zainoSeven);


        ImageIcon im8 = new ImageIcon("immagini/im8.jpg");
        Image img8 = im8.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        felpaNike.setIcon(new ImageIcon(img8));
        felpaNike.setHorizontalTextPosition(JLabel.CENTER);
        felpaNike.setVerticalTextPosition(JLabel.BOTTOM);
        felpaNike.setHorizontalAlignment(JLabel.CENTER);
        felpaNike.setOpaque(true);
        felpaNike.setBackground(Color.black);
        felpaNike.setForeground(Color.white);
        panelProd.add(felpaNike);

        bambino.add(panelProd, BorderLayout.CENTER);

        JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        goCatalogo.setPreferredSize(new Dimension(200, 40));
        panelButton.setOpaque(true);
        panelButton.setBackground(Color.black);
        goCatalogo.setOpaque(true);
        goCatalogo.setBackground(new Color(61,59,59));
        goCatalogo.setForeground(Color.white);
        panelButton.add(goCatalogo);
        goCatalogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameCatalogo();
                bambino.dispose();
            }
        });
        bambino.add(panelButton, BorderLayout.SOUTH);


        bambino.setLocationRelativeTo(null);
        bambino.setVisible(true);
    }
}
