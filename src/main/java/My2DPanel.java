import javax.swing.*;
import java.awt.*;

public class My2DPanel extends JPanel {

    Image image;

    My2DPanel() {
        image = new ImageIcon("src/main/resources/lambda.jpg").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.BLUE);
        g2D.setStroke(new BasicStroke(5));
//        g2D.drawLine(0, 0, 500, 500);
//        g2D.drawRect(0, 0, 100, 200);
//
//        g2D.setPaint(Color.PINK);
//        g2D.drawRect(100, 200, 100, 200);
//        g2D.fillRect(200, 300, 300, 400);

//        g2D.setPaint(Color.ORANGE);
//        g2D.drawOval(0, 0, 100, 100);
//        g2D.fillOval(0, 0, 100, 100);

//        g2D.setPaint(Color.RED);
//        g2D.fillArc(0, 0, 100, 100, 0, 180);
//        g2D.setPaint(Color.white);
//        g2D.fillArc(0, 0, 100, 100, 180, 180);

        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};

        g2D.setPaint(Color.YELLOW);
        g2D.fillPolygon(xPoints, yPoints, 3);


        g2D.drawImage(image, 0, 0, null);

        g2D.setPaint(Color.magenta);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("U R A WINNER!", 50, 50); // maps to bottom right of text
    }
}
