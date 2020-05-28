package form;

import configs.Configs;
import helper.Helper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class RegisterForm extends JPanel {
    private JPanel rootPanel;
    private JPanel logoMiniPanel;
    private JTextPane textPane;
    private JButton finishButton;
    private JTextPane namePane;
    private JTextPane surnamePane;
    private JPanel namePanel;
    private JLabel avatarLabel;
    private BufferedImage background, logoMini, photoMask, avatarA;

    {
        Helper.centerAlingText(textPane);
    }

    public RegisterForm(){
        background = Configs.BG_IMAGE;
        logoMini = Configs.LOGO_MINI;
//        photoMask = Configs.MASK_DG_BIG;
        avatarA = Configs.AVATAR_A;

        avatarLabel.setIcon(new ImageIcon(avatarA));
        textPane.setFont(Configs.getFont(14));
        namePane.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, (new Color(255, 255, 255))));
        surnamePane.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, (new Color(255, 255, 255))));
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

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

    }

    public void addApplyAction(ActionListener listener){
        finishButton.addActionListener(listener);
  //      contactsForm.signUp(namePane.getText().trim(), surnamePane.getText().trim());
    }
}
