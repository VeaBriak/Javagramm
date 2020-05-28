package form;

import configs.Configs;
import helper.Helper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class CodeForm extends JPanel{
    private JPanel rootPanel;
    private JButton button;
    private JTextPane textPane;
    private JPanel logoMiniPanel;
    private JPanel codePanel;
    private JLabel lockLogo;
    private JPasswordField codeField;
    private JLabel numberLabel;
    private BufferedImage background, logoMini, iconLock;

    {
        Helper.centerAlingText(textPane);
    }

    public CodeForm(){
        background = Configs.BG_IMAGE;
        logoMini = Configs.LOGO_MINI;
        iconLock = Configs.ICON_LOCK;

        lockLogo.setIcon(new ImageIcon(iconLock));
        codeField.setBorder(BorderFactory.createEmptyBorder());
        codeField.grabFocus();
        codeField.selectAll();
        codeField.setFont(Configs.getFont(20));
        textPane.setFont(Configs.getFont(14));
        numberLabel.setFont(Configs.getFont(20));
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

//    public void fillPhoneNumber(String phone){
//        numberLabel.setText();
//    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        rootPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background, 0, 0, null);
            }
        };

        logoMiniPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(logoMini, 60, 0, null);
            }
        };

        codePanel = new JPanel();
        codePanel.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, (new Color(255, 255, 255))));

    }


    public void addApplyAction(ActionListener  listener){
        button.addActionListener(listener);
    }

}
