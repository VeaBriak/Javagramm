package contacts;

import javax.swing.*;
import java.awt.*;

public class ContactsRenderer extends JPanel //implements ListCellRenderer<UserContact>
{
    private JPanel rootPanel;
    private JLabel nameLabel;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        rootPanel = this;
    }
//
//    @Override
//    public Component getListCellRendererComponent(JList<? extends UserContact> jList, UserContact o, int index, boolean selected, boolean hasFocus) {
//        nameLabel.setText(o.toString());
//        if (selected){
//            setBackground(Color.gray);
//        } else {
//            setBackground(Color.white);
//        }
//        setPreferredSize(new Dimension(0, 50));
//        return this;
//    }

}
