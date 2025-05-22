import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frameCatalogo {

    JFrame etaSesso = new JFrame("CATALOGO");

    JButton bambino = new JButton("bambino/a");
    JButton uomo = new JButton("uomo");
    JButton donna = new JButton("donna");

    public frameCatalogo(){
        etaSesso.setPreferredSize(new Dimension(400,100));
        etaSesso.setLayout(new BorderLayout(100,300));

        JPanel pannelloBottoni = new JPanel();

        pannelloBottoni.add(bambino);
        bambino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Bambino();
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

        etaSesso.add(pannelloBottoni);
        etaSesso.setLocationRelativeTo(null);
        etaSesso.pack();
        etaSesso.setVisible(true);
    }
}
