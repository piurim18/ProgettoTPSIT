import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DonnaShop {

    JFrame donna = new JFrame();
    ArrayList<JLabel> listaPrezziDonna = new ArrayList<>();
    JButton goShop = new JButton("torna allo shop");

    public DonnaShop() {
        donna.setSize(800, 800);
        donna.setLayout(new BorderLayout());

        JPanel prodottiPanel = new JPanel(new GridLayout(4, 2));
        prodottiPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        addProduct("vestito ", "immagini/im9.jpg", "€53.59",prodottiPanel);
        addProduct("mutandine ", "immagini/im10.jpg", "€9.99",prodottiPanel);
        addProduct("reggiseno ", "immagini/im11.jpg", "€13.50",prodottiPanel);
        addProduct("jeans ", "immagini/im12.jpg", "€31.19",prodottiPanel);
        addProduct("maglietta ", "immagini/im13.jpg", "€24.90",prodottiPanel);
        addProduct("cappello ", "immagini/im14.jpg", "€35.00",prodottiPanel);

        donna.add(prodottiPanel, BorderLayout.CENTER);

        JPanel bottonePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        goShop.setPreferredSize(new Dimension(200, 40));
        bottonePanel.add(goShop);
        goShop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameShop();
                donna.dispose();
            }
        });

        donna.add(bottonePanel, BorderLayout.SOUTH);

        donna.setVisible(true);
        donna.setLocationRelativeTo(null);
        donna.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void addProduct(String descrizioneProdotto, String percorsoImmagine, String prezzo, JPanel pannello) {
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
        bottoneCarrello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double prezzoDouble = Double.parseDouble(prezzo.replace("€", ""));
                Carrello.aggiungiProdotto(descrizioneProdotto, prezzoDouble);
                JOptionPane.showMessageDialog(donna, "Prodotto aggiunto al carrello!");
            }
        });
        bottoneCarrello.setAlignmentX(Component.LEFT_ALIGNMENT);


        prodottoPanel.add(labelImmagine);
        prodottoPanel.add(areaDescrizione);
        prodottoPanel.add(labelPrezzo);
        prodottoPanel.add(bottoneCarrello);

        pannello.add(prodottoPanel);
    }
}
