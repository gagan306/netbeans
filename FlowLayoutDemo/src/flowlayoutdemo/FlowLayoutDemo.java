
package flowlayoutdemo;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    public FlowLayoutDemo() {
        setTitle("FlowLayout Demo");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        for (int i = 1; i <= 5; i++) {
            add(new JButton("Button " + i));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FlowLayoutDemo demo = new FlowLayoutDemo();
            demo.setVisible(true);
        });
    }
}
