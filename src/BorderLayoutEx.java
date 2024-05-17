import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
    public BorderLayoutEx() {
        setTitle("BorderLayout 에제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanne = getContentPane();

        contentPanne.setLayout(new BorderLayout ());
    
        contentPanne.add(new JButton("CENTER"), BorderLayout.CENTER);
        contentPanne.add(new JButton("NORTH"), BorderLayout.NORTH );
        contentPanne.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        contentPanne.add(new JButton("EAST"), BorderLayout.EAST);
        contentPanne.add(new JButton("WEST"), BorderLayout.WEST);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
} 