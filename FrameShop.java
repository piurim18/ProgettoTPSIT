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
        mainPanel.setBorder(BorderFactory.createEmptyBorder());

        JPanel pannelloScelte = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        pannelloScelte.setOpaque(true);
        pannelloScelte.setBackground(Color.black);

        pannelloScelte.add(bambino);
        bambino.setOpaque(true);
        bambino.setBackground(new Color(61,59,59));
        bambino.setForeground(Color.white);


        pannelloScelte.add(uomo);
        uomo.setOpaque(true);
        uomo.setBackground(new Color(61,59,59));
        uomo.setForeground(Color.white);

        pannelloScelte.add(donna);
        donna.setOpaque(true);
        donna.setBackground(new Color(61,59,59));
        donna.setForeground(Color.white);


        JPanel pannelloCarrello = new JPanel();
        pannelloCarrello.setOpaque(true);
        pannelloCarrello.setBackground(Color.black);
        vaiACarrello.setPreferredSize(new Dimension(200, 30));
        vaiACarrello.setOpaque(true);
        vaiACarrello.setBackground(new Color(61,59,59));
        vaiACarrello.setForeground(Color.white);
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
        mainPanel.add(Box.createRigidArea(new Dimension()));
        mainPanel.add(pannelloCarrello);

        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
