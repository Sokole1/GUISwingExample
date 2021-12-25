import javax.swing.*;
import java.awt.*;

public class MyProgressBar {

    // Progress bar = Visual aid to let user know that an operation
    //                is processing
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);

    MyProgressBar() {
        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);

        frame.add(bar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill() {
        int counter = 100;
        while (counter >= 0) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter--;
        }
        bar.setString("Done!");

    }
}
