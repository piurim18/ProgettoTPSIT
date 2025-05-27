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
        etaSesso.setLayout(new BorderLayout(10, 10));

        JPanel pannelloBottoni = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        pannelloBottoni.add(bambino);
        pannelloBottoni.add(uomo);
        pannelloBottoni.add(donna);

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
        pannelloHome.add(goHome);
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
        etaSesso.setVisible(true);
    }

}
