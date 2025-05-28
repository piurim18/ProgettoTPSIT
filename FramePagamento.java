import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FramePagamento {

    JLabel labelPswrd = new JLabel("Password:");
    JLabel labelCAP = new JLabel("CAP:");
    JLabel labelIndirizzo = new JLabel("Indirizzo:");
    JLabel labelSpedizione = new JLabel("Scegli tipo di spedizione:");
    JTextField pswr = new JTextField();
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
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        frame.setContentPane(mainPanel);

        JPanel panelInserimento = new JPanel();
        panelInserimento.setLayout(new BoxLayout(panelInserimento, BoxLayout.Y_AXIS));

        pswr.setMaximumSize(fieldDim);
        cap.setMaximumSize(fieldDim);
        indirizzo.setMaximumSize(fieldDim);

        panelInserimento.add(labelPswrd);
        panelInserimento.add(pswr);
        panelInserimento.add(Box.createVerticalStrut(10));
        panelInserimento.add(labelIndirizzo);
        panelInserimento.add(indirizzo);
        panelInserimento.add(Box.createVerticalStrut(10));
        panelInserimento.add(labelCAP);
        panelInserimento.add(cap);


        JPanel panelFin = new JPanel();
        panelFin.setLayout(new BoxLayout(panelFin, BoxLayout.Y_AXIS));
        panelFin.setAlignmentX(Component.LEFT_ALIGNMENT);

        panelFin.add(Box.createVerticalStrut(20));
        panelFin.add(labelSpedizione);
        spedizione.addItem("Spedizione standard");
        spedizione.addItem("Spedizione espressa");
        spedizione.addItem("Spedizione rapida");
        spedizione.setMaximumSize(fieldDim);
        panelFin.add(spedizione);

        panelFin.add(Box.createVerticalStrut(20));
        paga.setAlignmentX(Component.CENTER_ALIGNMENT);
        paga.setMaximumSize(new Dimension(300, 50));
        panelFin.add(paga);
        paga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!pswr.getText().isEmpty() && !cap.getText().isEmpty() && !indirizzo.getText().isEmpty()){
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
