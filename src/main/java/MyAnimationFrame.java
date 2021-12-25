import javax.swing.*;
import java.awt.*;

public class MyAnimationFrame extends JFrame {

    MyAnimationPanel panel;

    MyAnimationFrame() {

        panel = new MyAnimationPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
