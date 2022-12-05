import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;

public class GWackClientGUI {
    
       //class for handling events
  static class WindowDisposer implements WindowListener {
    public void windowActivated(WindowEvent e) {}

    public void windowClosed(WindowEvent e) {}

    //only care about one event, the rest do nothing
    public void windowClosing(WindowEvent e) {
      System.out.println("Closed a window!");
    }

    public void windowDeactivated(WindowEvent e) {}

    public void windowDeiconified(WindowEvent e) {}

    public void windowIconified(WindowEvent e) {}

    public void windowOpened(WindowEvent e) {}
  }

    public static void main(String args[]) {
        WindowDisposer wd = new WindowDisposer();
        
        JFrame f = new JFrame();
        Connection c = new Connection();
        Chat h = new Chat();
        Members m = new Members();
        MsgStream s = new MsgStream();
        m.setVisible(true);
        //h.setVisible(true);
        c.setVisible(true);
       
        // Chat compose = new Chat();
        // compose.setVisible(true);


        f.setTitle("GWACK: GW Slack!"); // sets title that appears on the top bar
        f.setSize(1000, 1000);          // sets the size (in pixels) of the frame
        f.setLocation(100, 100);      // sets the top-left corner of the window on the desktop
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // makes it so that closing window exits program
        f.setVisible(true);
        f.setBackground(Color.BLUE);

        
        
        //panel that can hold other components
        // JPanel Connection = new JPanel();
        // Connection.setLayout(new BorderLayout());
        // Connection.setVisible(true);


        //panel that holds chat 
        // JPanel Chat = new JPanel();
        // Chat.setLayout(new BorderLayout());
        // Chat.setVisible(true);

        

        
        f.add(c, BorderLayout.NORTH);
        f.add(s, BorderLayout.CENTER);
        f.add(h, BorderLayout.SOUTH);
        f.add(m, BorderLayout.WEST);
       
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
       
    }
}
