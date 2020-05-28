package decoration;

import configs.Configs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

public class Decoration extends JPanel{
    private JPanel rootPanel;
    private JPanel northPanel;
    private JPanel contentPanel;
    private JLabel closeButton;
    private JLabel hideButton;
    private BufferedImage iconHide, iconClose;

    {
        contentPanel.add(new JPanel());
    }
    public Decoration(JFrame frame){
        iconHide = Configs.ICON_HIDE;
        iconClose = Configs.ICON_CLOSE;

        hideButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                frame.setExtendedState(frame.ICONIFIED);
            }
        });

        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });

        hideButton.setIcon(new ImageIcon(iconHide));
        closeButton.setIcon(new ImageIcon(iconClose));
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
        rootPanel = this;
    }

    public void setContentPanel(Component component){
        contentPanel.removeAll();
        contentPanel.add(component);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public Component getContentPanel(){
        return contentPanel.getComponent(0);
    }
}
