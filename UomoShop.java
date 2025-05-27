import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UomoShop {

    JFrame uomo = new JFrame();
    ArrayList<JLabel> listaPrezziUomo = new ArrayList<>();
    JButton goShop = new JButton("torna allo shop");

    public UomoShop() {
        uomo.setSize(800, 800);
         uomo.setLayout(new BorderLayout());

         JPanel prodottiPanel = new JPanel(new GridLayout(4, 2));
        prodottiPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

         addProduct("jeans Levi's ", "immagini/im15.jpg", "€34.99", prodottiPanel);
        addProduct("camicia Hugo Boss ", "immagini/im16.jpg", "€60.50", prodottiPanel);
        addProduct("giacca The North Face ", "immagini/im17.jpg", "€174.90", prodottiPanel);
        addProduct("polo Lacoste ", "immagini/im18.jpg", "€41.00", prodottiPanel);
        addProduct("scarpe Nike ", "immagini/im19.jpg", "€130.00", prodottiPanel);
        addProduct("pantaloni Dockers ", "immagini/im20.jpg", "€27.90", prodottiPanel);
        addProduct("t-shirt Adidas ", "immagini/im21.jpg", "€24.75", prodottiPanel);
        addProduct("cappotto Zara Man ", "immagini/im22.jpg", "€90.00", prodottiPanel);

         uomo.add(prodottiPanel, BorderLayout.CENTER);

         JPanel bottonePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        goShop.setPreferredSize(new Dimension(200, 40));
        bottonePanel.add(goShop);
        goShop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameShop();
                uomo.dispose();
            }
        });

         uomo.add(bottonePanel, BorderLayout.SOUTH);

        uomo.setLocationRelativeTo(null);
        uomo.setVisible(true);
    }


    private void addProduct(String descrizioneProdotto, String percorsoImmagine, String prezzo, JPanel parentPanel) {
        JPanel prodottoPanel = new JPanel();
        prodottoPanel.setLayout(new BoxLayout(prodottoPanel, BoxLayout.Y_AXIS));
        prodottoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ImageIcon icon = new ImageIcon(percorsoImmagine);
        Image resizedImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel labelImmagine = new JLabel(new ImageIcon(resizedImage));
        labelImmagine.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextArea areaDescrizione = new JTextArea(descrizioneProdotto);
        areaDescrizione.setWrapStyleWord(true);
        areaDescrizione.setLineWrap(true);
        areaDescrizione.setEditable(false);
        areaDescrizione.setFocusable(false);
        areaDescrizione.setOpaque(false);
        areaDescrizione.setFont(new Font("Arial", Font.PLAIN, 12));
        areaDescrizione.setMaximumSize(new Dimension(200, 50));
        areaDescrizione.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel labelPrezzo = new JLabel(prezzo);
        labelPrezzo.setFont(new Font("Arial", Font.BOLD, 12));
        labelPrezzo.setAlignmentX(Component.LEFT_ALIGNMENT);
        listaPrezziUomo.add(labelPrezzo);

        JButton bottoneCarrello = new JButton("Aggiungi");
        bottoneCarrello.setAlignmentX(Component.LEFT_ALIGNMENT);

        prodottoPanel.add(labelImmagine);
        prodottoPanel.add(areaDescrizione);
        prodottoPanel.add(labelPrezzo);
        prodottoPanel.add(bottoneCarrello);

        parentPanel.add(prodottoPanel);
    }
}
