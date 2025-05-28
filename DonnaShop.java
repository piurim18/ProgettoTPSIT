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
        prodottiPanel.setOpaque(true);
        prodottiPanel.setBackground(Color.black);

        addProduct("vestito ", "immagini/im9.jpg", "€53.59",prodottiPanel);
        addProduct("mutandine ", "immagini/im10.jpg", "€9.99",prodottiPanel);
        addProduct("reggiseno ", "immagini/im11.jpg", "€13.50",prodottiPanel);
        addProduct("jeans ", "immagini/im12.jpg", "€31.19",prodottiPanel);
        addProduct("maglietta ", "immagini/im13.jpg", "€24.90",prodottiPanel);
        addProduct("cappello ", "immagini/im14.jpg", "€35.00",prodottiPanel);

        donna.add(prodottiPanel, BorderLayout.CENTER);

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
        listaPrezziDonna.add(labelPrezzo);


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
