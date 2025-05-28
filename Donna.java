import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Donna {

    JFrame donna = new JFrame();

    JLabel vestitoDonna = new JLabel("vestito");
    JLabel mutandeDonna = new JLabel("mutandine");
    JLabel reggiseno = new JLabel("reggiseno");
    JLabel jeansDonna = new JLabel("jeans");
    JLabel magliaDonna = new JLabel("maglietta");
    JLabel cappelloDonna = new JLabel("cappello");
    JButton goCatalogo = new JButton("torna al catalogo");


    public Donna() {
        donna.setSize(500, 600);
        donna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        donna.setLayout(new BorderLayout());

        JPanel panelProd = new JPanel(new GridLayout(3, 2, 10, 10));
        panelProd.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelProd.setOpaque(true);
        panelProd.setBackground(Color.black);

        ImageIcon im9 = new ImageIcon("immagini/im9.jpg");
        Image img9 = im9.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        vestitoDonna.setIcon(new ImageIcon(img9));
        vestitoDonna.setHorizontalTextPosition(JLabel.CENTER);
        vestitoDonna.setVerticalTextPosition(JLabel.BOTTOM);
        vestitoDonna.setHorizontalAlignment(JLabel.CENTER);
        vestitoDonna.setOpaque(true);
        vestitoDonna.setBackground(Color.black);
        vestitoDonna.setForeground(Color.white);
        panelProd.add(vestitoDonna);


        ImageIcon im10 = new ImageIcon("immagini/im10.jpg");
        Image img10 = im10.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        mutandeDonna.setIcon(new ImageIcon(img10));
        mutandeDonna.setHorizontalTextPosition(JLabel.CENTER);
        mutandeDonna.setVerticalTextPosition(JLabel.BOTTOM);
        mutandeDonna.setHorizontalAlignment(JLabel.CENTER);
        mutandeDonna.setOpaque(true);
        mutandeDonna.setBackground(Color.black);
        mutandeDonna.setForeground(Color.white);
        panelProd.add(mutandeDonna);


        ImageIcon im11 = new ImageIcon("immagini/im11.jpg");
        Image img11 = im11.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        reggiseno.setIcon(new ImageIcon(img11));
        reggiseno.setHorizontalTextPosition(JLabel.CENTER);
        reggiseno.setVerticalTextPosition(JLabel.BOTTOM);
        reggiseno.setHorizontalAlignment(JLabel.CENTER);
        reggiseno.setOpaque(true);
        reggiseno.setBackground(Color.black);
        reggiseno.setForeground(Color.white);
        panelProd.add(reggiseno);


        ImageIcon im12 = new ImageIcon("immagini/im12.jpg");
        Image img12 = im12.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        jeansDonna.setIcon(new ImageIcon(img12));
        jeansDonna.setHorizontalTextPosition(JLabel.CENTER);
        jeansDonna.setVerticalTextPosition(JLabel.BOTTOM);
        jeansDonna.setHorizontalAlignment(JLabel.CENTER);
        jeansDonna.setOpaque(true);
        jeansDonna.setBackground(Color.black);
        jeansDonna.setForeground(Color.white);
        panelProd.add(jeansDonna);

        ImageIcon im13 = new ImageIcon("immagini/im13.jpg");
        Image img13 = im13.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        magliaDonna.setIcon(new ImageIcon(img13));
        magliaDonna.setHorizontalTextPosition(JLabel.CENTER);
        magliaDonna.setVerticalTextPosition(JLabel.BOTTOM);
        magliaDonna.setHorizontalAlignment(JLabel.CENTER);
        magliaDonna.setOpaque(true);
        magliaDonna.setBackground(Color.black);
        magliaDonna.setForeground(Color.white);
        panelProd.add(magliaDonna);


        ImageIcon im14 = new ImageIcon("immagini/im14.jpg");
        Image img14 = im14.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        cappelloDonna.setIcon(new ImageIcon(img14));
        cappelloDonna.setHorizontalTextPosition(JLabel.CENTER);
        cappelloDonna.setVerticalTextPosition(JLabel.BOTTOM);
        cappelloDonna.setHorizontalAlignment(JLabel.CENTER);
        cappelloDonna.setOpaque(true);
        cappelloDonna.setBackground(Color.black);
        cappelloDonna.setForeground(Color.white);
        panelProd.add(cappelloDonna);

        donna.add(panelProd, BorderLayout.CENTER);

        JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        goCatalogo.setPreferredSize(new Dimension(200, 40));
        panelButton.setOpaque(true);
        panelButton.setBackground(Color.black);
        goCatalogo.setOpaque(true);
        goCatalogo.setBackground(new Color(61,59,59));
        goCatalogo.setForeground(Color.white);
        panelButton.add(goCatalogo);
        goCatalogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameCatalogo();
                donna.dispose();
            }
        });
        donna.add(panelButton, BorderLayout.SOUTH);

        donna.setLocationRelativeTo(null);
        donna.setVisible(true);
    }
}
