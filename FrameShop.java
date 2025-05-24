import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameShop {
    JFrame frame = new JFrame("SHOP");

    JButton bambino = new JButton("bambino/a");
    JButton uomo = new JButton("uomo");
    JButton donna = new JButton("donna");

    public FrameShop(){
        frame.setPreferredSize(new Dimension(400,100));
        frame.setLayout(new BorderLayout(100,300));

        JPanel pannelloBottoni = new JPanel();

        pannelloBottoni.add(bambino);
        bambino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BambinoShop();
            }
        });

        pannelloBottoni.add(uomo);
        uomo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Uomo();
            }
        });

        pannelloBottoni.add(donna);
        donna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Donna();
            }
        });

        frame.add(pannelloBottoni);
        frame.pack();
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
