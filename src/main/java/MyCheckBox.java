import javax.swing.*;
import java.awt.*;

public class MyCheckBox extends JFrame {

    // JCheckBox = A GUI component that can be selected or deselected
    JButton button;
    JCheckBox checkBox;
    MyCheckBox() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(e -> {
            if (e.getSource() == button) {
                System.out.println(checkBox.isSelected());
            }
        });

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));

        this.add(checkBox);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }
}
