import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MySlider implements ChangeListener {

    // JSlider = A GUI component that lets user enter a value
    //           by using an adjustable sliding knob on a track
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    MySlider() {

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        slider.setOrientation(SwingConstants.VERTICAL);

        slider.addChangeListener(this);

        label.setText("°C = " + slider.getValue());
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());
    }
}
