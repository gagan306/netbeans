package keyeventdemoadapter;
import javax.swing.*;
import java.awt.event.*;

public class KeyEventDemoAdapter extends JFrame {

    public KeyEventDemoAdapter() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }
        });
        setSize(300, 300);
        setTitle("KeyEvent Demo using Adapter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEventDemoAdapter();
    }
}
