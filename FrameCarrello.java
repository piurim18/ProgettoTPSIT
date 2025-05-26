import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCarrello {

    JLabel labelLista = new JLabel("LISTA PRODOTTI");
    JButton btn = new JButton("Vai a pagamento");
    JTextArea carrello = new JTextArea();


    public FrameCarrello(){
         JFrame frame = new JFrame();
         frame.setPreferredSize(new Dimension(500,500));
         JPanel mainPanel = new JPanel(new BorderLayout(10,10));
         frame.setContentPane(mainPanel);

         labelLista.setHorizontalAlignment(SwingConstants.CENTER);

         mainPanel.add(labelLista,BorderLayout.NORTH);
         mainPanel.add(carrello,BorderLayout.CENTER);

         JPanel panelBottone = new JPanel();
         btn.setPreferredSize(new Dimension(300,50));
         panelBottone.add(btn);

         btn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 new FramePagamento();
             }
         });

         mainPanel.add(panelBottone,BorderLayout.SOUTH);

         frame.pack();
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
    }

}
