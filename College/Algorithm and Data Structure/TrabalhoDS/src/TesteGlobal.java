import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteGlobal extends JFrame{

    static JFrame frame;
    static JLabel label;
    static JButton button;

    TesteGlobal()
    { 
    }

    public static void main(String[] args) {
        frame = new JFrame("Blank Title");
        label = new JLabel("Archive");
        button = new JButton("Analise");

        JPanel painel = new JPanel();
        
        painel.add(button);
        painel.add(label);

        button.setBounds(315,5,70,20);
        
        frame.add(painel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
