import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.DocumentEvent;
import  javax.swing.event.DocumentListener;

public class Connection extends JPanel {

    private JTextField name;
    private JTextField ipAddy;



    Integer[] portNum = {8886, 8887, 8888};

    private final double[] cfact = {
        1.0000, 1.0 / 12, 3.28084, 0.0328084
    };

    public Connection() {
        super();

        name = new JTextField("Rhys", 10);
        ipAddy   = new JTextField("IP address", 10);
        JComboBox numberCombo = new JComboBox<Integer>(portNum); //dropdown options of port numbers

        // Top panel
        JPanel dpanel = new JPanel(new FlowLayout()); 
        dpanel.add(new JLabel("Name: "));
        dpanel.add(name);
        
        dpanel.add(new JLabel(" IP Address: "));
        dpanel.add(ipAddy);

        dpanel.add(new JLabel(" Port: "));
        dpanel.add(numberCombo);

    


        //add a button listener for connect/disconnect
        JButton b = new JButton("Connect");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                name.getDocument().addDocumentListener(new DocumentListener() {
                    public void changedUpdate(DocumentEvent e) {
                      warn();
                    }
                    public void removeUpdate(DocumentEvent e) {
                      warn();
                    }
                    public void insertUpdate(DocumentEvent e) {
                      warn();
                    }
                  
                    public void warn() {
                       if (Integer.parseInt(name.getText())<=0){
                        JFrame error = new JFrame();
                        error.setTitle("ERROR"); // sets title that appears on the top bar
                        error.setSize(100, 100);          // sets the size (in pixels) of the frame
                        error.setLocation(100, 100);      // sets the top-left corner of the window on the desktop
                        error.setVisible(true);  
                       }
                    }
                  });
              
                if (b.getText().equals("Connect")) {
                    b.setText("Disconnect");
                    name.setEditable(false); //can't edit name or IP while connected
                    ipAddy.setEditable(false);
                }else {
                    b.setText("Connect");
                    name.setEditable(true);
                    ipAddy.setEditable(true);
                }
            }
        });
        dpanel.add(b);

    
        this.add(dpanel);
    
      
       
    }
    public class ButtonClickConnect implements ActionListener {

        private JLabel label;
        
        public ButtonClickConnect(JLabel label) {
            this.label = label; //save the label to modify
        }
    
    
        public void actionPerformed(ActionEvent e) {
            if (label.getText().equals("Connect")) {
                label.setText("Disconnect"); //flip text back and forth
            }else{
                label.setText("Connect");
            }
        }
    }
         
}
