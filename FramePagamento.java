import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FramePagamento {

    JLabel labelPswrd = new JLabel("Password:");
    JLabel labelCAP = new JLabel("CAP:");
    JLabel labelIndirizzo = new JLabel("Indirizzo:");
    JLabel labelSpedizione = new JLabel("Scegli tipo di spedizione:");
    JPasswordField pswr = new JPasswordField();
    JTextField cap = new JTextField();
    JTextField indirizzo = new JTextField();
    JComboBox spedizione = new JComboBox<>();
    JButton paga = new JButton("EFFETTUA PAGAMENTO");

    Dimension fieldDim = new Dimension(300, 30);

    public FramePagamento() {
        JFrame frame = new JFrame("PAGAMENTO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 400));

        JPanel mainPanel = new JPanel();
        mainPanel.setOpaque(true);
        mainPanel.setBackground(Color.black);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        frame.setContentPane(mainPanel);

        JPanel panelInserimento = new JPanel();
        panelInserimento.setOpaque(true);
        panelInserimento.setBackground(Color.black);
        panelInserimento.setLayout(new BoxLayout(panelInserimento, BoxLayout.Y_AXIS));

        pswr.setMaximumSize(fieldDim);
        cap.setMaximumSize(fieldDim);
        indirizzo.setMaximumSize(fieldDim);

        panelInserimento.add(labelPswrd);
        labelPswrd.setOpaque(true);
        labelPswrd.setBackground(Color.black);
        labelPswrd.setForeground(Color.white);

        panelInserimento.add(pswr);
        pswr.setOpaque(true);
        pswr.setBackground(new Color(61,59,59));
        pswr.setForeground(Color.white);

        panelInserimento.add(Box.createVerticalStrut(10));
        panelInserimento.add(labelIndirizzo);
        labelIndirizzo.setOpaque(true);
        labelIndirizzo.setBackground(Color.black);
        labelIndirizzo.setForeground(Color.white);

        panelInserimento.add(indirizzo);
        indirizzo.setOpaque(true);
        indirizzo.setBackground(new Color(61,59,59));
        indirizzo.setForeground(Color.white);

        panelInserimento.add(Box.createVerticalStrut(10));
        panelInserimento.add(labelCAP);
        labelCAP.setOpaque(true);
        labelCAP.setBackground(Color.black);
        labelCAP.setForeground(Color.white);

        panelInserimento.add(cap);
        cap.setOpaque(true);
        cap.setBackground(new Color(61,59,59));
        cap.setForeground(Color.white);


        JPanel panelFin = new JPanel();
        panelFin.setOpaque(true);
        panelFin.setBackground(Color.black);
        panelFin.setLayout(new BoxLayout(panelFin, BoxLayout.Y_AXIS));
        panelFin.setAlignmentX(Component.LEFT_ALIGNMENT);

        panelFin.add(Box.createVerticalStrut(20));
        panelFin.add(labelSpedizione);

        labelSpedizione.setOpaque(true);
        labelSpedizione.setBackground(Color.black);
        labelSpedizione.setForeground(Color.white);

        spedizione.setOpaque(true);
        spedizione.setBackground(new Color(61,59,59));
        spedizione.setForeground(Color.white);
        spedizione.addItem("Spedizione standard");
        spedizione.addItem("Spedizione espressa");
        spedizione.addItem("Spedizione rapida");
        spedizione.setMaximumSize(fieldDim);
        panelFin.add(spedizione);

        panelFin.add(Box.createVerticalStrut(20));
        paga.setAlignmentX(Component.CENTER_ALIGNMENT);
        paga.setOpaque(true);
        paga.setBackground(new Color(61,59,59));
        paga.setForeground(Color.white);
        paga.setMaximumSize(new Dimension(300, 50));
        panelFin.add(paga);
        paga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String passwordInserita = new String(pswr.getPassword());

                if (!passwordInserita.equals(ControlloPsw.CheckPassword)) {
                    JOptionPane.showMessageDialog(frame, "Password errata", "Errore", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!passwordInserita.isEmpty() && !cap.getText().isEmpty() && !indirizzo.getText().isEmpty()) {
                    new FrameFinale();
                    frame.dispose();
                }
            }
        });

        mainPanel.add(panelInserimento);
        mainPanel.add(panelFin);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
