import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFileChooser extends JFrame implements ActionListener {

    // JFileChooser = A GUI mechanism that lets a user choose a file
    //                helpful for opening or saving files
    JButton button;

    MyFileChooser() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);
        this.add(button);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File(".")); // goes to project folder
            // int response = fileChooser.showOpenDialog(null); // select file to open
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
