import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameLogin {

    JLabel email = new JLabel("email   (deve contentenere la '@')");
    JTextField textemail= new JTextField();
    JLabel pswr = new JLabel("password");
    JPasswordField textpswrd = new JPasswordField();
    JButton vaiShop = new JButton("vai allo shop");
    JCheckBox condizioni = new JCheckBox("accetto condizioni privacy");
    Dimension dimension = new Dimension(1000,25);
    JButton goHome = new JButton("torna alla home");

    public FrameLogin(){

        JFrame frameLogin = new JFrame("login");
        frameLogin.setPreferredSize(new Dimension(500, 300));
        frameLogin.setLayout(new BorderLayout());
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frameLogin.setContentPane(mainPanel);


        JPanel panelLog = new JPanel();
        panelLog.setLayout(new BoxLayout(panelLog, BoxLayout.Y_AXIS));
        panelLog.setOpaque(true);
        panelLog.setBackground(Color.black);

        email.setAlignmentX(Component.LEFT_ALIGNMENT);
        email.setOpaque(true);
        email.setBackground(Color.black);
        email.setForeground(Color.white);

        textemail.setMaximumSize(dimension);
        textemail.setOpaque(true);
        textemail.setBackground(new Color(61,59,59));
        textemail.setForeground(Color.white);

        pswr.setAlignmentX(Component.LEFT_ALIGNMENT);
        pswr.setOpaque(true);
        pswr.setBackground(Color.black);
        pswr.setForeground(Color.white);

        textpswrd.setMaximumSize(dimension);
        textpswrd.setOpaque(true);
        textpswrd.setBackground(new Color(61,59,59));
        textpswrd.setForeground(Color.white);

        panelLog.add(email);
        panelLog.add(textemail);
        panelLog.add(pswr);
        panelLog.add(textpswrd);


        JPanel logFIn = new JPanel();
        logFIn.add(condizioni);
        condizioni.setOpaque(true);
        condizioni.setBackground(Color.black);
        condizioni.setForeground(Color.white);
        logFIn.setOpaque(true);
        logFIn.setBackground(Color.black);
        vaiShop.setAlignmentX(Component.CENTER_ALIGNMENT);
        vaiShop.setBackground(new Color(61,59,59));
        vaiShop.setForeground(Color.white);
        vaiShop.setPreferredSize(new Dimension(350,50));
        vaiShop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControlloPsw.CheckPassword = new String(textpswrd.getPassword());

                if(condizioni.isSelected() == true && !textpswrd.getText().isEmpty() && !textemail.getText().isEmpty() && textemail.getText().contains("@")){
                     new FrameShop();
                    frameLogin.dispose();
                }


            }
        });
        logFIn.add(vaiShop);

        JPanel panelHome = new JPanel();
        panelHome.setOpaque(true);
        panelHome.setBackground(Color.black);
        goHome.setOpaque(true);
        goHome.setBackground(new Color(61,59,59));
        goHome.setForeground(Color.white);
        panelHome.add(goHome);
        goHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FramePrincipale();
                frameLogin.dispose();
            }
        });


        mainPanel.add(panelLog,BorderLayout.NORTH);
        mainPanel.add(logFIn,BorderLayout.CENTER);
        mainPanel.add(panelHome,BorderLayout.SOUTH);


        frameLogin.pack();
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameLogin.setVisible(true);
    }

}
