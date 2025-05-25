import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class UomoShop {

    JFrame uomo = new JFrame();
    ArrayList<JLabel> listaPrezziUomo = new ArrayList<>();

    public UomoShop() {
        uomo.setSize(800, 800);
        uomo.setLayout(new GridLayout(4, 2));


        addProduct("jeans Levi's ", "immagini/im15.jpg", "€34.99");
        addProduct("camicia Hugo Boss ", "immagini/im16.jpg", "€60.50");
        addProduct("giacca The North Face ", "immagini/im17.jpg", "€174.90");
        addProduct("polo Lacoste ", "immagini/im18.jpg", "€41.00");
        addProduct("scarpe Nike ", "immagini/im19.jpg", "€130.00");
        addProduct("pantaloni Dockers ", "immagini/im20.jpg", "€27.90");
        addProduct("t-shirt Adidas ", "immagini/im21.jpg", "€24.75");
        addProduct("cappotto Zara Man ", "immagini/im22.jpg", "€90.00");

        uomo.setLocationRelativeTo(null);
        uomo.setVisible(true);
    }

    private void addProduct(String descrizioneProdotto, String percorsoImmagine, String prezzo) {
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

        uomo.add(prodottoPanel);
    }
}
