import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCarrello {

    JLabel labelLista = new JLabel("LISTA PRODOTTI");
    JButton btn = new JButton("Vai a pagamento");
    JTextArea carrello = new JTextArea();

    public FrameCarrello() {
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(500, 500));
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setOpaque(true);
        mainPanel.setBackground(Color.black);
        frame.setContentPane(mainPanel);

        labelLista.setHorizontalAlignment(SwingConstants.CENTER);
        labelLista.setOpaque(true);
        labelLista.setBackground(Color.black);
        labelLista.setForeground(Color.white);
        mainPanel.add(labelLista, BorderLayout.NORTH);

        carrello.setEditable(false);
        carrello.setText(Carrello.getContenutoCarrello());
        carrello.setOpaque(true);
        carrello.setBackground(new Color(61,59,59));
        carrello.setForeground(Color.white);
        mainPanel.add(new JScrollPane(carrello), BorderLayout.CENTER);

        JPanel panelBottone = new JPanel();
        panelBottone.setOpaque(true);
        panelBottone.setBackground(Color.black);
        btn.setPreferredSize(new Dimension(300, 50));
        btn.setOpaque(true);
        btn.setBackground(new Color(61,59,59));
        btn.setForeground(Color.white);
        panelBottone.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FramePagamento();
                frame.dispose();
            }
        });

        mainPanel.add(panelBottone, BorderLayout.SOUTH);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
