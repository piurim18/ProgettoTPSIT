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
        prodottiPanel.setOpaque(true);
        prodottiPanel.setBackground(Color.black);


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
        bottonePanel.setOpaque(true);
        bottonePanel.setBackground(Color.black);
        goShop.setPreferredSize(new Dimension(200, 40));
        goShop.setPreferredSize(new Dimension(200, 40));
        goShop.setOpaque(true);
        goShop.setBackground(new Color(61, 59, 59));
        goShop.setForeground(Color.white);
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
        prodottoPanel.setOpaque(true);
        prodottoPanel.setBackground(Color.black);
        prodottoPanel.setLayout(new BoxLayout(prodottoPanel, BoxLayout.Y_AXIS));
        prodottoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ImageIcon icon = new ImageIcon(percorsoImmagine);
        Image resizedImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel labelImmagine = new JLabel(new ImageIcon(resizedImage));
        labelImmagine.setOpaque(true);
        labelImmagine.setBackground(Color.black);
        labelImmagine.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextArea areaDescrizione = new JTextArea(descrizioneProdotto);
        areaDescrizione.setWrapStyleWord(true);
        areaDescrizione.setLineWrap(true);
        areaDescrizione.setEditable(false);
        areaDescrizione.setFocusable(false);
        areaDescrizione.setOpaque(false);
        areaDescrizione.setFont(new Font("Arial", Font.PLAIN, 12));
        areaDescrizione.setMaximumSize(new Dimension(200, 50));
        areaDescrizione.setOpaque(true);
        areaDescrizione.setBackground(Color.black);
        areaDescrizione.setForeground(Color.white);
        areaDescrizione.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel labelPrezzo = new JLabel(prezzo);
        labelPrezzo.setFont(new Font("Arial", Font.BOLD, 12));
        labelPrezzo.setOpaque(true);
        labelPrezzo.setBackground(Color.black);
        labelPrezzo.setForeground(Color.white);
        labelPrezzo.setAlignmentX(Component.LEFT_ALIGNMENT);
        listaPrezziBambini.add(labelPrezzo);

        JButton bottoneCarrello = new JButton("Aggiungi");
        bottoneCarrello.setOpaque(true);
        bottoneCarrello.setBackground(new Color(61,59,59));
        bottoneCarrello.setForeground(Color.white);
        bottoneCarrello.setAlignmentX(Component.LEFT_ALIGNMENT);
        bottoneCarrello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double prezzoD = Double.parseDouble(prezzo.replace("€",""));
                Carrello.aggiungiProdotto(descrizioneProdotto,prezzoD);
                UIManager.put("OptionPane.background", Color.black);
                UIManager.put("Panel.background", Color.black);
                UIManager.put("OptionPane.messageForeground", Color.white);
                UIManager.put("Button.background", new Color(61, 59, 59));
                UIManager.put("Button.foreground", Color.white);
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
