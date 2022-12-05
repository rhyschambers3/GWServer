import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.DocumentEvent;
import  javax.swing.event.DocumentListener;

public class Chat extends JPanel {
    private JTextField chat;
    
    public Chat() {
        super();
        
        chat = new JTextField("Hello", 50);

        JPanel dpanel = new JPanel(new FlowLayout()); 
        dpanel.add(new JLabel("Message: "), BorderLayout.NORTH);
        dpanel.add(chat, BorderLayout.SOUTH);


        JButton b = new JButton("Send");
        dpanel.add(b);

       
        this.add(dpanel);


    }
}
