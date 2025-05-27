import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameShop {
    JFrame frame = new JFrame("SHOP");

    JButton bambino = new JButton("bambino/a");
    JButton uomo = new JButton("uomo");
    JButton donna = new JButton("donna");
    JButton vaiACarrello = new JButton("Vai al carrello");

    public FrameShop(){
        frame.setPreferredSize(new Dimension(500, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel pannelloScelte = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        pannelloScelte.add(bambino);
        pannelloScelte.add(uomo);
        pannelloScelte.add(donna);

        JPanel pannelloCarrello = new JPanel();
        vaiACarrello.setPreferredSize(new Dimension(200, 30));
        pannelloCarrello.add(vaiACarrello);

        bambino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BambinoShop();
                frame.dispose();
            }
        });

        uomo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UomoShop();
                frame.dispose();
            }
        });

        donna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DonnaShop();
                frame.dispose();
            }
        });

        vaiACarrello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameCarrello();
                frame.dispose();
            }
        });

        mainPanel.add(pannelloScelte);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        mainPanel.add(pannelloCarrello);

        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
