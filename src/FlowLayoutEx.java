import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
    public FlowLayoutEx() {
        setTitle("FlowLayout 에제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanne = getContentPane();

        contentPanne.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
    
        contentPanne.add(new JButton("add"));
        contentPanne.add(new JButton("sub"));
        contentPanne.add(new JButton("mul"));
        contentPanne.add(new JButton("div"));
        contentPanne.add(new JButton("Calculate"));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutEx();
    }
} 