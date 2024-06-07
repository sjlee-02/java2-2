import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame {
	public GraphicsDrawLineEx() {
		setTitle("drawLine 사용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(200, 150);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED); 
			g.drawLine(20, 20, 100, 100);
            g.drawOval(20,20,80,80);
            g.drawRect(20,20,80,80);
            g.drawRoundRect(20,20,120,80,40,60);
			g.drawArc(20,100,80,80,90,270);

			int []x = {80,40,80,120};
			int []y = {40,120,200,120}; 
			g.drawPolygon(x, y, 4);
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawLineEx();
	}
}