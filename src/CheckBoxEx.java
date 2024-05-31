import java.awt.*;
import javax.swing.*;

public class CheckBoxEx extends JFrame {
    public CheckBoxEx() {
        setTitle("체크 버튼 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

       ImageIcon normalIcon = new ImageIcon("images/gosline.jpg");
       ImageIcon rolloverIcon = new ImageIcon("images/go.jpg");
       ImageIcon pressedIcon = new ImageIcon("images/images.jpg");

        JButton btn = new JButton("call", normalIcon);
        btn.setPressedIcon(pressedIcon);
        btn.setRolloverIcon(rolloverIcon);

        c.add(btn);
        setSize(250, 250);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CheckBoxEx();
    }
}