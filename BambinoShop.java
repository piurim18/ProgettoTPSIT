import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BambinoShop {

    JFrame bambino = new JFrame();
    ArrayList<JLabel> listaPrezziBambini = new ArrayList<>();
    JButton goShop = new JButton("torna allo shop");

    public BambinoShop() {
        bambino.setSize(800, 800);
        bambino.setLayout(new BorderLayout());

        JPanel prodottiPanel = new JPanel(new GridLayout(4, 2));
        prodottiPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        addProduct("Calze con dinosauri ", "immagini/im1.jpg", "€5.99", prodottiPanel);
        addProduct("Scarpe Geox ", "immagini/im2.jpg", "€49.90", prodottiPanel);
        addProduct("Pantaloni Zara Kids ", "immagini/im3.jpg", "€25.00", prodottiPanel);
        addProduct("Maglietta OVS ", "immagini/im4.jpg", "€9.99", prodottiPanel);
        addProduct("Giacca Benetton ", "immagini/im5.jpg", "€59.99", prodottiPanel);
        addProduct("Cappello GAP ", "immagini/im6.jpg", "€14.50", prodottiPanel);
        addProduct("Zaino Seven ", "immagini/im7.jpg", "€39.90", prodottiPanel);
        addProduct("Felpa Nike ", "immagini/im8.jpg", "€34.90", prodottiPanel);

        bambino.add(prodottiPanel, BorderLayout.CENTER);

        JPanel bottonePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        goShop.setPreferredSize(new Dimension(200, 40));
        bottonePanel.add(goShop);
        goShop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameShop();
                bambino.dispose();
            }
        });

        bambino.add(bottonePanel, BorderLayout.SOUTH);

        bambino.setLocationRelativeTo(null);
        bambino.setVisible(true);
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
        listaPrezziBambini.add(labelPrezzo);

        JButton bottoneCarrello = new JButton("Aggiungi");
        bottoneCarrello.setAlignmentX(Component.LEFT_ALIGNMENT);
        bottoneCarrello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double prezzoD = Double.parseDouble(prezzo.replace("€",""));
                Carrello.aggiungiProdotto(descrizioneProdotto,prezzoD);
                JOptionPane.showMessageDialog(bambino,"Prodotto aggiunto al carrello!");
            }
        });

        prodottoPanel.add(labelImmagine);
        prodottoPanel.add(areaDescrizione);
        prodottoPanel.add(labelPrezzo);
        prodottoPanel.add(bottoneCarrello);

        parentPanel.add(prodottoPanel);
    }


}
