package form;

import javax.swing.*;


public class EditContacts extends JPanel {
    private JPanel rootPanel;
    private JTextPane textPane;
    private JTextPane numberPane;
    private JButton saveButton;
    private JTextPane contactPane;
    private JLabel deleteButton;
    private JPanel contantPanel;
    private JPanel deletePanel;
    private JLayeredPane layeredPane;


    public EditContacts(){
//        this.layeredPane = new JLayeredPane();
//        layeredPane.setPreferredSize(new Dimension(800, 600));
//        layeredPane.add(rootPanel, JLayeredPane.MODAL_LAYER -1,50);
//        this.add(layeredPane);
    }


    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        rootPanel = this;
    }
}
