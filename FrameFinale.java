import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FrameFinale {

    int giorni = new Random().nextInt(14) + 2;
    String mess = "Il pagamento è andato a buon fine.\nL'ordine arriverà tra " + giorni + " giorni.\nAlla prossima!";
    JButton btn = new JButton("torna alla home");
    JTextArea textArea = new JTextArea(mess);
    public FrameFinale() {

        JFrame frameFinale = new JFrame("Conferma Ordine");
        frameFinale.setPreferredSize(new Dimension(500, 250));
        frameFinale.setLayout(new BorderLayout());


        textArea.setFont(new Font("SansSerif", Font.BOLD, 16));
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(true);
        textArea.setBackground(Color.black);
        textArea.setForeground(Color.white);
        textArea.setMargin(new Insets(20, 20, 20, 20));
        textArea.setAlignmentX(Component.CENTER_ALIGNMENT);

        btn.setOpaque(true);
        btn.setBackground(new Color(61,59,59));
        btn.setForeground(Color.white);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FramePrincipale();
                frameFinale.dispose();
            }
        });


        frameFinale.add(textArea, BorderLayout.CENTER);
        frameFinale.add(btn,BorderLayout.SOUTH);


        frameFinale.pack();
        frameFinale.setLocationRelativeTo(null);
        frameFinale.setVisible(true);
        frameFinale.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
