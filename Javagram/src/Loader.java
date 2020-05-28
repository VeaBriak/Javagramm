import frame.JavagramFrame;

import javax.swing.*;


public class Loader {
    public static void main(String[] args)
    {
        JavagramFrame frame = new JavagramFrame();

        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Javagram");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
