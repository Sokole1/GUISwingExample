import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame {
    // JFrame = a GUI window to add components to
    MyFrame() {

        ImageIcon image = new ImageIcon("src/main/resources/img.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); // create a label
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of icon
        label.setVerticalTextPosition(JLabel.TOP); // set text pos to image
        label.setForeground(new Color(0x00FF00)); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font
        label.setIconTextGap(-25); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true);  // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical pos of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100, 0, 250, 250); // fix x,y and dimensions

        this.add(label);

        this.setTitle("JFrame title goes here"); // sets title of frame
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // exit when hitting x
        this.setSize(420, 420); // sets x and y dimension of frame
        // this.setLayout(null); // change layout maanger
        this.setVisible(true); // make frame visible
        this.pack(); // adjusts to size of things inside (add all before packing)

        ImageIcon image1 = new ImageIcon("src/main/resources/img.png"); // create image icon top left
        this.setIconImage(image1.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(123,50,250)); // change colour of background
    }
}
