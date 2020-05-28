package helper;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Helper {
    public static void centerAlingText(JTextPane text){
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_CENTER);
        text.setParagraphAttributes(attribs,false);
    }
}
