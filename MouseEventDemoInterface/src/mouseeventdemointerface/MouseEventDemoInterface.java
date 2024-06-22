
package mouseeventdemointerface;
import javax.swing.*;
import java.awt.event.*;

public class MouseEventDemoInterface extends JFrame implements MouseListener {

    public MouseEventDemoInterface() {
        addMouseListener(this);
        setSize(300, 300);
        setTitle("MouseEvent Demo using Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    System.out.println("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");}

    @Override
    public void mouseReleased(MouseEvent e) {
    System.out.println("Mouse released at (" + e.getX() + ", " + e.getY() + ")");}

    @Override
    public void mouseEntered(MouseEvent e) {
    System.out.println("Mouse entered at (" + e.getX() + ", " + e.getY() + ")");}

    @Override
    public void mouseExited(MouseEvent e) {
    System.out.println("Mouse exited at (" + e.getX() + ", " + e.getY() + ")");}

    public static void main(String[] args) {
        new MouseEventDemoInterface();
    }
}

