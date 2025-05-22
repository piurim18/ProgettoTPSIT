import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameLogin {

    JLabel email = new JLabel("email");
    JTextField textemail= new JTextField();
    JLabel pswr = new JLabel("password");
    JTextField textpswrd = new JTextField();
    JButton vaiShop = new JButton("vai allo shop");
    JCheckBox condizioni = new JCheckBox("accetto condizioni privacy");
    Dimension dimension = new Dimension(1000,25);
    public FrameLogin(){

        JFrame login = new JFrame("login");
        login.setPreferredSize(new Dimension(500, 300));
        login.setLayout(new BorderLayout());
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        login.setContentPane(mainPanel);


        JPanel panelLog = new JPanel();
        panelLog.setLayout(new BoxLayout(panelLog, BoxLayout.Y_AXIS));

        email.setAlignmentX(Component.LEFT_ALIGNMENT);
        textemail.setMaximumSize(dimension);
        pswr.setAlignmentX(Component.LEFT_ALIGNMENT);
        textpswrd.setMaximumSize(dimension);

        panelLog.add(email);
        panelLog.add(textemail);
        panelLog.add(pswr);
        panelLog.add(textpswrd);


        JPanel logFIn = new JPanel();
        logFIn.add(condizioni);
        vaiShop.setAlignmentX(Component.CENTER_ALIGNMENT);
        vaiShop.setPreferredSize(new Dimension(350,50));
        vaiShop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(condizioni.isSelected() == true && !textpswrd.getText().isEmpty() && !textemail.getText().isEmpty()){
                   new FrameShop();
                }

            }
        });
        logFIn.add(vaiShop);


        mainPanel.add(panelLog,BorderLayout.NORTH);
        mainPanel.add(logFIn,BorderLayout.CENTER);


        login.pack();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

}
