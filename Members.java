import javax.swing.*;
import java.awt.*;


public class Members extends JPanel {
    private JTextField members;
    
    public Members() {
        super();
        
        members = new JTextField("Rhys Chambers", 10);

        JPanel dpanel = new JPanel(new BorderLayout()); 
        dpanel.add(new JLabel("Members "), BorderLayout.NORTH);
        dpanel.add(members, BorderLayout.SOUTH);


        this.add(dpanel);


    }
}
