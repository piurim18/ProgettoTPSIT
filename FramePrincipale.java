import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FramePrincipale {

    JFrame frame = new JFrame();

    JLabel titolo = new JLabel("E-COMMERCE ONLINE");
    JButton accesso = new JButton("ACCEDI");
    JButton sfogliaCatalogo = new JButton("SFOGLIA CATALOGO");

    public FramePrincipale(){

        frame.setPreferredSize(new Dimension(500, 300));
        JPanel pannelloBottoni = new JPanel(new GridLayout(3, 1));
        frame.setContentPane(pannelloBottoni);



        titolo.setPreferredSize(new Dimension(250,250));
        accesso.setSize(100,100);
        sfogliaCatalogo.setSize(100,100);
        pannelloBottoni.add(titolo);
        pannelloBottoni.add(accesso);
        pannelloBottoni.add(sfogliaCatalogo);
        sfogliaCatalogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EtaSesso();
            }
        });


        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
