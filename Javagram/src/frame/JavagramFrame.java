package frame;

import decoration.Decoration;
import form.*;
import contacts.ContactsForm;

import javax.swing.*;
import java.awt.*;

public class JavagramFrame extends JFrame {

//    private JLayeredPane layeredPane;
    private Decoration decoration;
    private PhoneNumberForm phoneNumberForm = new PhoneNumberForm();
//    private JPanel overlayBackground;
//    ContactsForm contactsForm = new ContactsForm();
//    EditContacts editContacts = new EditContacts();
//    OverlayBackground overlayBackground = new OverlayBackground();


    public JavagramFrame()
    {
        decoration = new Decoration(this);
        setContentPane(decoration);
        decoration.setContentPanel(phoneNumberForm);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
//        layeredPane = getLayeredPane();

    }

    {

        setContentPane(phoneNumberForm.getRootPanel());
        phoneNumberForm.addApplyAction(e -> codeForm());
    }

    protected void codeForm(){
        CodeForm codeForm=new CodeForm();
        setContentPanel(codeForm.getRootPanel());
        codeForm.addApplyAction(e -> registerForm());
    }

    protected void registerForm(){
        RegisterForm registerForm = new RegisterForm();
        setContentPanel(registerForm.getRootPanel());
        registerForm.addApplyAction(e -> contactsForm());
    }

    protected void contactsForm() {
        ContactsForm contactsForm = new ContactsForm();
        setContentPanel(contactsForm.getRootPanel());
//        contactsForm.addApplyAction(e -> setOverlay(editContacts));
    }

//    private void setOverlay(Component editContacts){
//        setContentPane(overlayBackground);
//        overlayBackground.setContentPanel(rootPane);
//        editContacts.setSize(getSize());
//        layeredPane = getLayeredPane();
//        JPanel componentBg = overlayBackground.getRootPanel();
//        componentBg.setSize(getSize());
//        componentBg.setBounds(0,25,getWidth(), getHeight()-25);
 //       frame.activateButtons(false);
 //       addConactButton.activateButtons(false);
//        layeredPane.add(componentBg, JLayeredPane.PALETTE_LAYER, 1);
//        layeredPane.add(editContacts, JLayeredPane.MODAL_LAYER, 2);
//        layeredPane.setVisible(true);
//        repaint();
//    }

//    public void editContacts(){
//        EditContacts editContacts = new EditContacts();
//        setContentPanel(editContacts.getRootPanel());
//    }
//
//    protected void setContentPanel(Container container){
//    setContentPane(container);
//    getContentPane().revalidate();
//    }

}