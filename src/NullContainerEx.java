import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame{
    public NullContainerEx() {
        setTitle("배치관리자가 없이 절대 위치에 배치하는 에제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanne = getContentPane();
        contentPanne.setLayout(null);
        
        JLabel la = new JLabel("Hello, press Buttons");
        la.setBounds(130, 50, 200, 20);
        contentPanne.add(la);

        for(int i=1; i<=9; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i)
        }
    
       

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
} 