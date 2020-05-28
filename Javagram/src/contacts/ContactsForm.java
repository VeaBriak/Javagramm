package contacts;
import configs.Configs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;


public class ContactsForm extends JPanel {
    private JPanel rootPanel, logoMicroPanel, avatarNamePanel, contactsPanel, addContactPanel,
            chatPanel, editPanel, sendButtonPanel;
    private JLabel iconSettingsButton, logoMicroLabel, avaBLebel, registerNameLabel, addContactButton,
            editButtonLabel, sendButtonLabel, contactAvatarLabel;
    private JTextField searchField;
    private JTextArea chatFieldArea;
    private JButton button;
    private BufferedImage iconSearch, logoMicro, iconSettings, blueMaskMini, iconEdit, iconPlus, sendButton,
            avaLogoB, msGrayOnline;

    public ContactsForm() {
        iconSearch = Configs.ICON_SEARCH;
        logoMicro = Configs.LOGO_MICRO;
        iconSettings = Configs.ICON_SETTINGS;
        blueMaskMini = Configs.BLUEM_MINI;
        iconEdit = Configs.ICON_EDIT;
        iconPlus = Configs.ICON_PLUS;
        sendButton = Configs.BUTTON_SEND;
        avaLogoB = Configs.AVA_B;
        msGrayOnline = Configs.MS_GRAY_ONLINE;
        setListeners();


        logoMicroLabel.setIcon(new ImageIcon(logoMicro));
        iconSettingsButton.setIcon(new ImageIcon(iconSettings));
        avaBLebel.setIcon(new ImageIcon(avaLogoB));
        avaBLebel.setIcon(new ImageIcon(blueMaskMini));
        addContactButton.setIcon(new ImageIcon(iconPlus));
        editButtonLabel.setIcon(new ImageIcon(iconEdit));
        sendButtonLabel.setIcon(new ImageIcon(sendButton));
        chatFieldArea.setFont(Configs.getFont(20));
        searchField.setFont(Configs.getFont(12));

    }

    private void setListeners() {
        editButtonLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        sendButtonLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        iconSettingsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        MouseAdapter settingsAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        };
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        rootPanel = new JPanel();

        searchField = new JTextField(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(iconSearch, 2, 5, null);
            }
        };
    }
    public void addApplyAction(ActionListener listener){
        button.addActionListener(listener);
    }
}
