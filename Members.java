import javax.swing.*;
import java.awt.*;


public class Members extends JPanel {
    private JTextArea members;
    
    public Members() {
        super();
        
        members = new JTextArea("Rhys Chambers", 20,10);

        JPanel dpanel = new JPanel(new BorderLayout()); 
        dpanel.add(new JLabel("Members "), BorderLayout.NORTH);
        dpanel.setSize(1000, 1000);
        dpanel.add(members, BorderLayout.SOUTH);


        this.add(dpanel);


    }
}
