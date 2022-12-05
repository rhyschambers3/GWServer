import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.DocumentEvent;
import  javax.swing.event.DocumentListener;

public class MsgStream extends JPanel {
    private JTextField chatMsgs;
    
    public MsgStream() {
        super();
        
        chatMsgs = new JTextField("Incoming Messages:", 50);

        JPanel dpanel = new JPanel(new FlowLayout()); 
        
        chatMsgs.setEditable(false);
        dpanel.add(chatMsgs, BorderLayout.SOUTH);
        chatMsgs.setBackground(Color.LIGHT_GRAY);

       
        this.add(dpanel);


    }
}