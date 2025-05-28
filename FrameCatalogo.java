import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCatalogo {

    JFrame etaSesso = new JFrame("CATALOGO");

    JButton bambino = new JButton("bambino/a");
    JButton uomo = new JButton("uomo");
    JButton donna = new JButton("donna");
    JButton goHome = new JButton("torna alla home");

    public FrameCatalogo(){
        etaSesso.setPreferredSize(new Dimension(400, 150));
        etaSesso.setLayout(new BorderLayout());

        JPanel pannelloBottoni = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        pannelloBottoni.setOpaque(true);
        pannelloBottoni.setBackground(Color.black);

        pannelloBottoni.add(bambino);
        bambino.setOpaque(true);
        bambino.setBackground(new Color(61,59,59));
        bambino.setForeground(Color.white);

        pannelloBottoni.add(uomo);
        uomo.setOpaque(true);
        uomo.setBackground(new Color(61,59,59));
        uomo.setForeground(Color.white);

        pannelloBottoni.add(donna);
        donna.setOpaque(true);
        donna.setBackground(new Color(61,59,59));
        donna.setForeground(Color.white);

        bambino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Bambino();
                etaSesso.dispose();
            }
        });

        uomo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Uomo();
                etaSesso.dispose();
            }
        });

        donna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Donna();
                etaSesso.dispose();
            }
        });

        JPanel pannelloHome = new JPanel();
        pannelloHome.setOpaque(true);
        pannelloHome.setBackground(Color.black);
        pannelloHome.add(goHome);
        goHome.setOpaque(true);
        goHome.setBackground(new Color(61,59,59));
        goHome.setForeground(Color.white);
        goHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FramePrincipale();
                etaSesso.dispose();
            }
        });

        etaSesso.add(pannelloBottoni, BorderLayout.CENTER);
        etaSesso.add(pannelloHome, BorderLayout.SOUTH);

        etaSesso.pack();
        etaSesso.setLocationRelativeTo(null);
        etaSesso.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        etaSesso.setVisible(true);
    }

}
