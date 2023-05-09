import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Button extends JFrame{

    // Botao Analisar
    JButton Button = new JButton("Analisar");
    
    public Button(){
        setLayout(null);
        Button.setBounds(315,5,70,20);
        add(Button);
        
        setTitle("Button");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
    

