import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FrameFinale {

    int giorni = new Random().nextInt(14) + 2;
    String mess = "Il pagamento è andato a buon fine.\nL'ordine arriverà tra " + giorni + " giorni.\nAlla prossima!";

    public FrameFinale() {
        JTextArea textArea = new JTextArea(mess);
        textArea.setFont(new Font("SansSerif", Font.BOLD, 16));
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(false);
        textArea.setMargin(new Insets(20, 20, 20, 20));
        textArea.setAlignmentX(Component.CENTER_ALIGNMENT);

        JFrame frameFinale = new JFrame("Conferma Ordine");
        frameFinale.setPreferredSize(new Dimension(500, 250));
        frameFinale.setLayout(new BorderLayout());
        frameFinale.add(textArea, BorderLayout.CENTER);

        frameFinale.pack();
        frameFinale.setLocationRelativeTo(null);
        frameFinale.setVisible(true);
    }
}
