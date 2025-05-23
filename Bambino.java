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

        bambino.setSize(500,500);
        bambino.setVisible(true);

        bambino.setLayout(new GridLayout(4,2));

        ImageIcon im1=new ImageIcon("immagini/im1.jpg");
        int largo1 = 100;
        int alto1 = 100;
        Image resizedImage = im1.getImage().getScaledInstance(largo1, alto1, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon1 = new ImageIcon(resizedImage);

        calzeBambino.setIcon(resizedIcon1);
        calzeBambino.setPreferredSize(new Dimension(largo1, alto1));

        calzeBambino.setPreferredSize(new Dimension(400,300));



        ImageIcon im2=new ImageIcon("immagini/im2.jpg");
        int largo2 = 100;
        int alto2 = 100;
        Image resizedImage2 = im2.getImage().getScaledInstance(largo2, alto2, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon2 = new ImageIcon(resizedImage2);

        scarpeGeox.setIcon(resizedIcon2);
        scarpeGeox.setPreferredSize(new Dimension(largo2, alto2));

        scarpeGeox.setPreferredSize(new Dimension(400,300));




        ImageIcon im3=new ImageIcon("immagini/im3.jpg");
        int largo3 = 100;
        int alto3 = 100;
        Image resizedImage3 = im3.getImage().getScaledInstance(largo3, alto3, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon3 = new ImageIcon(resizedImage3);

        pantaloniZaraKids.setIcon(resizedIcon3);
        pantaloniZaraKids.setPreferredSize(new Dimension(largo3, alto3));

        pantaloniZaraKids.setPreferredSize(new Dimension(400,300));




        ImageIcon im4=new ImageIcon("immagini/im4.jpg");
        int largo4 = 100;
        int alto4 = 100;
        Image resizedImage4 = im4.getImage().getScaledInstance(largo4, alto4, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon4 = new ImageIcon(resizedImage4);

        magliettaOVS.setIcon(resizedIcon4);
        magliettaOVS.setPreferredSize(new Dimension(largo4, alto4));

        magliettaOVS.setPreferredSize(new Dimension(400,300));




        ImageIcon im5=new ImageIcon("immagini/im5.jpg");
        int largo5 = 100;
        int alto5 = 100;
        Image resizedImage5 = im5.getImage().getScaledInstance(largo5, alto5, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon5 = new ImageIcon(resizedImage5);

        giaccaBenetton.setIcon(resizedIcon5);
        giaccaBenetton.setPreferredSize(new Dimension(largo5, alto5));

        giaccaBenetton.setPreferredSize(new Dimension(400,300));




        ImageIcon im6=new ImageIcon("immagini/im6.jpg");
        int largo6 = 100;
        int alto6 = 100;
        Image resizedImage6 = im6.getImage().getScaledInstance(largo6, alto6, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon6 = new ImageIcon(resizedImage6);

        cappelloGap.setIcon(resizedIcon6);
        cappelloGap.setPreferredSize(new Dimension(largo6, alto6));

        cappelloGap.setPreferredSize(new Dimension(400,300));




        ImageIcon im7=new ImageIcon("immagini/im7.jpg");
        int largo7 = 100;
        int alto7 = 100;
        Image resizedImage7 = im7.getImage().getScaledInstance(largo7, alto7, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon7 = new ImageIcon(resizedImage7);

        zainoSeven.setIcon(resizedIcon7);
        zainoSeven.setPreferredSize(new Dimension(largo7, alto7));

        zainoSeven.setPreferredSize(new Dimension(400,300));




        ImageIcon im8=new ImageIcon("immagini/im8.jpg");
        int largo8 = 100;
        int alto8 = 100;
        Image resizedImage8 = im8.getImage().getScaledInstance(largo8, alto8, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon8 = new ImageIcon(resizedImage8);

        felpaNike.setIcon(resizedIcon8);
        felpaNike.setPreferredSize(new Dimension(largo8, alto8));

        felpaNike.setPreferredSize(new Dimension(400,300));




        bambino.add(calzeBambino);
        bambino.add(scarpeGeox);
        bambino.add(pantaloniZaraKids);
        bambino.add(magliettaOVS);
        bambino.add(giaccaBenetton);
        bambino.add(cappelloGap);
        bambino.add(zainoSeven);
        bambino.add(felpaNike);


        bambino.setLocationRelativeTo(null);
    }
}
