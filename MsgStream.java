import javax.swing.*;
import java.awt.*;


public class MsgStream extends JPanel {
    private JTextArea chatMsgs;
    
    public MsgStream() {
        super();
        chatMsgs = new JTextArea("Rhys Chambers", 20,50);

        JPanel dpanel = new JPanel(new BorderLayout()); 
        dpanel.add(new JLabel("Members "), BorderLayout.NORTH);
        dpanel.setSize(1000, 1000);
        chatMsgs.setEditable(false);
        dpanel.add(chatMsgs, BorderLayout.SOUTH);


        this.add(dpanel);


    }
}