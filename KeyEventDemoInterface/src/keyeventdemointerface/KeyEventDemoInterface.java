
package keyeventdemointerface;
import javax.swing.*;
import java.awt.event.*;

public class KeyEventDemoInterface extends JFrame implements KeyListener {

    public KeyEventDemoInterface() {
        addKeyListener(this);
        setSize(300, 300);
        setTitle("KeyEvent Demo using Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyEventDemoInterface();
    }
}
