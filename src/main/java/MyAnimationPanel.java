import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAnimationPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyAnimationPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        enemy = new ImageIcon("src/main/resources/lambda.jpg").getImage();
        backgroundImage = new ImageIcon("src/main/resources/img.png").getImage();

        timer = new Timer(10, this); // calls actionPerformed every second
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g); // paint background
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        if (y >= PANEL_HEIGHT - enemy.getWidth(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        x = x + xVelocity;
        y = y + yVelocity;
        repaint(); // don't just directly call paint, call repaint()
    }
}
