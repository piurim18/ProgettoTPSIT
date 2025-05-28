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
        prodottiPanel.setOpaque(true);
        prodottiPanel.setBackground(Color.black);

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
        bottonePanel.setOpaque(true);
        bottonePanel.setBackground(Color.black);
        goShop.setPreferredSize(new Dimension(200, 40));
        goShop.setOpaque(true);
        goShop.setBackground(new Color(61, 59, 59));
        goShop.setForeground(Color.white);
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
        uomo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

        JTextArea areaDescrizione = new JTextArea(descrizioneProdotto);
        areaDescrizione.setWrapStyleWord(true);
        areaDescrizione.setLineWrap(true);
        areaDescrizione.setEditable(false);
        areaDescrizione.setFocusable(false);
        areaDescrizione.setOpaque(false);
        areaDescrizione.setOpaque(true);
        areaDescrizione.setBackground(Color.black);
        areaDescrizione.setForeground(Color.white);
        areaDescrizione.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel labelPrezzo = new JLabel(prezzo);
        labelPrezzo.setOpaque(true);
        labelPrezzo.setBackground(Color.black);
        labelPrezzo.setForeground(Color.white);
        listaPrezziUomo.add(labelPrezzo);

        JButton bottoneCarrello = new JButton("Aggiungi");
        bottoneCarrello.setOpaque(true);
        bottoneCarrello.setBackground(new Color(61,59,59));
        bottoneCarrello.setForeground(Color.white);
        bottoneCarrello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double prezzoDouble = Double.parseDouble(prezzo.replace("€", ""));
                Carrello.aggiungiProdotto(descrizioneProdotto, prezzoDouble);
                UIManager.put("OptionPane.background", Color.black);
                UIManager.put("Panel.background", Color.black);
                UIManager.put("OptionPane.messageForeground", Color.white);
                UIManager.put("Button.background", new Color(61, 59, 59));
                UIManager.put("Button.foreground", Color.white);
                JOptionPane.showMessageDialog(uomo, "Prodotto aggiunto al carrello!");
            }
        });

        prodottoPanel.add(labelImmagine);
        prodottoPanel.add(areaDescrizione);
        prodottoPanel.add(labelPrezzo);
        prodottoPanel.add(bottoneCarrello);

        parentPanel.add(prodottoPanel);
    }
}
