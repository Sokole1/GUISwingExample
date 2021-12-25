import javax.swing.*;

public class LaunchPage {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    LaunchPage() {

        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);

        myButton.addActionListener(e -> {
            if (e.getSource() == myButton) {
                frame.dispose(); // close current frame
                NewWindow myWindow = new NewWindow();
            }
        });
        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
