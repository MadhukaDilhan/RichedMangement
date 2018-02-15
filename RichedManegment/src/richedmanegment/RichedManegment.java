package richedmanegment;

import javax.swing.JFrame;

public class RichedManegment {

    public static void main(String[] args) {
        MainWindow frame = new MainWindow();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
