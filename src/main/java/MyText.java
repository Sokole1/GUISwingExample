import javax.swing.*;
import java.awt.*;

public class MyText extends JFrame {

    // JTextField = A GUI text box component that can be used to add, set, or get text
    JButton button;
    JTextField textField;

    MyText() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("username");

        button = new JButton("Submit");
        button.addActionListener(e -> {
            if (e.getSource() == button) {
                System.out.println("Welcome " + textField.getText());
                button.setEnabled(false);
                textField.setEnabled(false);
            }
        });

        this.add(button);
        this.add(textField);

        this.pack();
        this.setVisible(true);
    }
}
