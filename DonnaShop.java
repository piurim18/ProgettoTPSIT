import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DonnaShop {

    JFrame donna = new JFrame();
    ArrayList<JLabel> listaPrezziDonna = new ArrayList<>();

    public DonnaShop() {
        donna.setSize(800, 800);
        donna.setLayout(new GridLayout(3, 2));


        addProduct("vestito ", "immagini/im9.jpg", "€53.59");
        addProduct("mutandine ", "immagini/im10.jpg", "€9.99");
        addProduct("reggiseno ", "immagini/im11.jpg", "€13.50");
        addProduct("jeans ", "immagini/im12.jpg", "€31.19");
        addProduct("maglietta ", "immagini/im13.jpg", "€24.90");
        addProduct("cappello ", "immagini/im14.jpg", "€35.00");

        donna.setVisible(true);
        donna.setLocationRelativeTo(null);
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
        listaPrezziDonna.add(labelPrezzo);


        JButton bottoneCarrello = new JButton("Aggiungi");
        bottoneCarrello.setAlignmentX(Component.LEFT_ALIGNMENT);


        prodottoPanel.add(labelImmagine);
        prodottoPanel.add(areaDescrizione);
        prodottoPanel.add(labelPrezzo);
        prodottoPanel.add(bottoneCarrello);

        donna.add(prodottoPanel);
    }
}
