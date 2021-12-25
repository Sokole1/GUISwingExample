import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComboBox extends JFrame implements ActionListener {

    // JComboBox = A component that combines a button or editable field
    //             and a drop-down list

    JComboBox comboBox;

    MyComboBox() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
        // Integer[] ... <- use wrapper class

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        comboBox.setEditable(true);

//        System.out.println(comboBox.getItemCount());
//        comboBox.addItem("horse");
//        comboBox.insertItemAt("pig", 1);
//        comboBox.setSelectedIndex(2);
//        comboBox.removeItem("cat");
//        comboBox.removeItemAt(0);
//        comboBox.removeAllItems();

        this.add(comboBox);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
