import javax.swing.*;
import java.awt.*;

public class FramePagamento {

    JLabel labelPswrd= new JLabel("password");
    JLabel labelCAP = new JLabel("CAP");
    JLabel labelIndirizzo = new JLabel("indirizzo");
    JLabel labelSpedizione = new JLabel("scegliere tipo di spedizione");
    JTextField pswr= new JTextField();
    JTextField cap = new JTextField();
    JTextField indirizzo = new JTextField();
    JComboBox spedizione = new JComboBox();
    JButton paga = new JButton("EFFETTUA PAGAMENTO");

    public FramePagamento(){
        JFrame frame = new JFrame("PAGAMENTO");
        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.setContentPane(mainPanel);

        JPanel panelInserimento = new JPanel(new GridLayout(6,1));
        panelInserimento.add(labelPswrd);
        panelInserimento.add(pswr);
        panelInserimento.add(labelIndirizzo);
        panelInserimento.add(indirizzo);
        panelInserimento.add(labelCAP);
        panelInserimento.add(cap);



        mainPanel.add(panelInserimento);




        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);

    }

}
