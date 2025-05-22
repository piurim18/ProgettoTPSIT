import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EtaSesso {

    JFrame etaSesso = new JFrame();

    JButton bambino = new JButton("bambino/a");
    JButton uomo = new JButton("uomo");
    JButton donna = new JButton("donna");

    public EtaSesso(){
        etaSesso.setSize(400,400);
        etaSesso.setVisible(true);

        etaSesso.setLayout(new BorderLayout(10,30));

        JPanel pannelloBottoni = new JPanel(new GridLayout(1, 3));

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
        // etaSesso.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        etaSesso.pack();
        etaSesso.setVisible(true);
    }
}
