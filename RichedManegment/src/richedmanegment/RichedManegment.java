package richedmanegment;

import UserHandling.*;
import javax.swing.JFrame;

public class RichedManegment {

    public static void main(String[] args) {
        UserLogin userlog = new UserLogin();
        userlog.setVisible(true);
        System.out.println(userlog.loginstatus);
    }
}
