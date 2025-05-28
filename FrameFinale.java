import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FrameFinale {

    int giorni = new Random().nextInt(14) + 2;
    String mess = "Il pagamento è andato a buon fine.\nL'ordine arriverà tra " + giorni + " giorni.\nAlla prossima!";
    JButton btn = new JButton("Torna alla Home");
    JButton close = new JButton("Chiudi");
    JTextArea textArea = new JTextArea(mess);

    public FrameFinale() {
        JFrame frameFinale = new JFrame("Conferma Ordine");
        frameFinale.setPreferredSize(new Dimension(500, 300));
        frameFinale.setLayout(new BorderLayout(10, 10));
        frameFinale.getContentPane().setBackground(Color.black);

        textArea.setFont(new Font("SansSerif", Font.BOLD, 16));
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(true);
        textArea.setBackground(Color.black);
        textArea.setForeground(Color.white);
        textArea.setMargin(new Insets(20, 20, 20, 20));

        btn.setOpaque(true);
        btn.setBackground(new Color(61, 59, 59));
        btn.setForeground(Color.white);
        btn.setPreferredSize(new Dimension(200, 40));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FramePrincipale();
                frameFinale.dispose();
            }
        });

        close.setOpaque(true);
        close.setBackground(new Color(61, 59, 59));
        close.setForeground(Color.white);
        close.setPreferredSize(new Dimension(200, 40));
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel panelBottoni = new JPanel();
        panelBottoni.setBackground(Color.black);
        panelBottoni.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBottoni.add(btn);
        panelBottoni.add(close);

        frameFinale.add(textArea, BorderLayout.CENTER);
        frameFinale.add(panelBottoni, BorderLayout.SOUTH);

        frameFinale.pack();
        frameFinale.setLocationRelativeTo(null);
        frameFinale.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameFinale.setVisible(true);
    }
}
