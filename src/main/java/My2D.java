import javax.swing.*;

public class My2D extends JFrame {

    My2DPanel panel;

    My2D() {
        panel = new My2DPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
