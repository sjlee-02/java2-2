import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
    private JLabel la =
        new JLabel("<Enter>키로 배경색이 바뀝니다.");

public KeyCharEx() {
    super("KeyListener의 ")
}
}

c. setLayout(new FlowLayout());
c.add(la);
c.addKeyListener(new MyKeyListener());
setSize(250, 150);
setVisible(true);

