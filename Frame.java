import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {

    JFrame frame = new JFrame();

    JButton accesso = new JButton("accesso");
    JButton sfogliaCatalogo = new JButton("sfoglia catalogo");

    public Frame(){

        frame.setPreferredSize(new Dimension(500, 300));
        frame.setLayout(new BorderLayout(10,30));

        JPanel pannelloBottoni = new JPanel(new GridLayout(1, 2));

        pannelloBottoni.add(accesso);
        pannelloBottoni.add(sfogliaCatalogo);
        sfogliaCatalogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EtaSesso();
            }
        });

        frame.add(pannelloBottoni,BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
