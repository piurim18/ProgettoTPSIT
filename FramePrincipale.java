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
        frame.setLayout(new BorderLayout());


        titolo.setFont(new Font("Arial", Font.BOLD, 24));
        titolo.setHorizontalAlignment(SwingConstants.CENTER);
        titolo.setVerticalAlignment(SwingConstants.CENTER);
        frame.add(titolo, BorderLayout.NORTH);


        JPanel pannelloBottoni = new JPanel();
        pannelloBottoni.setLayout(new BoxLayout(pannelloBottoni, BoxLayout.Y_AXIS));
        pannelloBottoni.setAlignmentX(Component.CENTER_ALIGNMENT);


        Dimension buttonSize = new Dimension(200, 40);
        accesso.setMaximumSize(buttonSize);
        accesso.setPreferredSize(buttonSize);
        accesso.setAlignmentX(Component.CENTER_ALIGNMENT);

        sfogliaCatalogo.setMaximumSize(buttonSize);
        sfogliaCatalogo.setPreferredSize(buttonSize);
        sfogliaCatalogo.setAlignmentX(Component.CENTER_ALIGNMENT);


        pannelloBottoni.add(Box.createVerticalGlue());
        pannelloBottoni.add(accesso);
        pannelloBottoni.add(Box.createRigidArea(new Dimension(0, 20)));
        pannelloBottoni.add(sfogliaCatalogo);
        pannelloBottoni.add(Box.createVerticalGlue());

        frame.add(pannelloBottoni, BorderLayout.CENTER);


        sfogliaCatalogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EtaSesso(); // Presumo sia un'altra classe definita altrove
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
