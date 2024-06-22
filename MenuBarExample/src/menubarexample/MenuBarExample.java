
package menubarexample;
import javax.swing.*;

public class MenuBarExample extends JFrame {
    public MenuBarExample() {
        setTitle("MenuBar Demo");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the File menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenu openSubMenu = new JMenu("Open");
        JMenuItem openProjectMenuItem = new JMenuItem("Open Project");
        JMenuItem openFileMenuItem = new JMenuItem("Open file");
        openSubMenu.add(openProjectMenuItem);
        openSubMenu.add(openFileMenuItem);
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(newMenuItem);
        fileMenu.add(openSubMenu);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        // Create the Edit menu
        JMenu editMenu = new JMenu("Edit");

        // Create the View menu
        JMenu viewMenu = new JMenu("View");

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuBarExample example = new MenuBarExample();
            example.setVisible(true);
        });
    }
}
