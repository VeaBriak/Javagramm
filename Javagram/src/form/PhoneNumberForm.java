package form;

import configs.Configs;
import helper.Helper;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.text.ParseException;


public class PhoneNumberForm extends JPanel{
    private JPanel rootPanel;
    private JButton button;
    private JTextPane textPane;
    private JPanel logoPanel;
    private JLabel phoneLogo;
    private JPanel numberPanel;
    private JFormattedTextField phoneTextField;
    private BufferedImage background, logo, iconPhone;
    private static PhoneNumberForm instance;


    {
        Helper.centerAlingText(textPane);
        try {
            MaskFormatter maskFormatter = new MaskFormatter("+7##########");
            maskFormatter.setValueContainsLiteralCharacters(false);
            phoneTextField.setFormatterFactory(new DefaultFormatterFactory(maskFormatter));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public PhoneNumberForm() {
        background = Configs.BG_IMAGE;
        logo = Configs.LOGO;
        iconPhone = Configs.ICON_PHONE;

        phoneLogo.setIcon(new ImageIcon(iconPhone));
        phoneTextField.setBorder(BorderFactory.createEmptyBorder());
        phoneTextField.setFont(Configs.getFont(20));
        textPane.setFont(Configs.getFont(14));
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

        logoPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(logo, 20, 0, null);
            }
        };
        numberPanel = new JPanel();
        numberPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, (new Color(255, 255, 255))));
    }

    public String getPhone(){
        try {
            phoneTextField.commitEdit();
            return "+7" + (String) phoneTextField.getValue();
        } catch (ParseException e){
            return null;
        }
    }

    public void addApplyAction(ActionListener  listener){
        button.addActionListener(listener);
        phoneTextField.getText().trim();
    }


}
