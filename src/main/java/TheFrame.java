import javax.swing.*;
import java.awt.*;

public class TheFrame extends JFrame {
    // JButton = a button that performs an action when clicked on

    JButton button;
    JLabel label;

    TheFrame() {

        ImageIcon icon = new ImageIcon(new ImageIcon("src/main/resources/img.png")
                .getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        ImageIcon icon2 = new ImageIcon(new ImageIcon("src/main/resources/img.png")
                .getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(e -> {
            System.out.println("poo");
            button.setEnabled(false);
            label.setVisible(true);
        });
        button.setText("I'm a button!");
        button.setFocusable(false); // removes annoying box around text
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
}
