package form;

import configs.Configs;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class OverlayBackground extends JPanel{
    private JPanel rootPanel;
    private BufferedImage iconFrame;

    public OverlayBackground(){
        iconFrame = Configs.ICON_FRAME;
    }

    public JPanel getRootPanel(){
        return rootPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        rootPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(iconFrame, 0, 0, null);
            }
        };
    }

    public void setContentPanel(Component component){
        rootPanel.removeAll();
        rootPanel.add(component);
        rootPanel.revalidate();
        rootPanel.repaint();
    }
}
