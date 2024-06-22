
package mouseeventdemoadapter;
import javax.swing.*;
import java.awt.event.*;

public class MouseEventDemoAdapter extends JFrame {

    public MouseEventDemoAdapter() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });
        setSize(300, 300);
        setTitle("MouseEvent Demo using Adapter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventDemoAdapter();
    }
}
