import javax.swing.*;
import java.awt.*;

public class Donna {

    JFrame donna = new JFrame();

    JLabel vestitoDonna = new JLabel("vestito");
    JLabel mutandeDonna = new JLabel("mutandine");
    JLabel reggiseno = new JLabel("reggiseno");
    JLabel jeansDonna = new JLabel("jeans");
    JLabel magliaDonna = new JLabel("maglietta");
    JLabel cappelloDonna = new JLabel("cappello");

    public Donna(){

        donna.setSize(400,500);
        donna.setVisible(true);

        donna.setLayout(new GridLayout(4,4));


        ImageIcon im9=new ImageIcon("immagini/im9.jpg");
        int largo9 = 100;
        int alto9 = 100;
        Image resizedImage = im9.getImage().getScaledInstance(largo9, alto9, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon9 = new ImageIcon(resizedImage);

        vestitoDonna.setIcon(resizedIcon9);
        vestitoDonna.setPreferredSize(new Dimension(largo9, alto9));

        vestitoDonna.setPreferredSize(new Dimension(400,300));



        ImageIcon im10=new ImageIcon("immagini/im10.jpg");
        int largo10 = 100;
        int alto10 = 100;
        Image resizedImage10 = im10.getImage().getScaledInstance(largo10, alto10, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon10 = new ImageIcon(resizedImage10);

        mutandeDonna.setIcon(resizedIcon10);
        mutandeDonna.setPreferredSize(new Dimension(largo10, alto10));

        mutandeDonna.setPreferredSize(new Dimension(400,300));




        ImageIcon im11=new ImageIcon("immagini/im11.jpg");
        int largo11 = 100;
        int alto11 = 100;
        Image resizedImage11 = im11.getImage().getScaledInstance(largo11, alto11, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon11 = new ImageIcon(resizedImage11);

        reggiseno.setIcon(resizedIcon11);
        reggiseno.setPreferredSize(new Dimension(largo11, alto11));

        reggiseno.setPreferredSize(new Dimension(400,300));




        ImageIcon im12=new ImageIcon("immagini/im12.jpg");
        int largo12 = 100;
        int alto12 = 100;
        Image resizedImage12 = im12.getImage().getScaledInstance(largo12, alto12, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon12 = new ImageIcon(resizedImage12);

        jeansDonna.setIcon(resizedIcon12);
        jeansDonna.setPreferredSize(new Dimension(largo12, alto12));

        jeansDonna.setPreferredSize(new Dimension(400,300));




        ImageIcon im13=new ImageIcon("immagini/im13.jpg");
        int largo13 = 100;
        int alto13 = 100;
        Image resizedImage13 = im13.getImage().getScaledInstance(largo13, alto13, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon13 = new ImageIcon(resizedImage13);

        magliaDonna.setIcon(resizedIcon13);
        magliaDonna.setPreferredSize(new Dimension(largo13, alto13));

        magliaDonna.setPreferredSize(new Dimension(400,300));




        ImageIcon im14=new ImageIcon("immagini/im14.jpg");
        int largo14 = 100;
        int alto14 = 100;
        Image resizedImage14 = im14.getImage().getScaledInstance(largo14, alto14, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon14 = new ImageIcon(resizedImage14);

        cappelloDonna.setIcon(resizedIcon14);
        cappelloDonna.setPreferredSize(new Dimension(largo14, alto14));

        cappelloDonna.setPreferredSize(new Dimension(400,300));


        donna.add(vestitoDonna);
        donna.add(mutandeDonna);
        donna.add(reggiseno);
        donna.add(jeansDonna);
        donna.add(magliaDonna);
        donna.add(cappelloDonna);



        donna.setLocationRelativeTo(null);
    }

}
