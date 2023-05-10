package Project;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;

public class Tela extends JFrame{

    Tela(){
        setLayout(null);

            JLabel escritaArquivo = new JLabel("Arquivo:");
            escritaArquivo.setBounds(20,15,100,20);
            add(escritaArquivo);

            JTextField archiveHTML = new JTextField();
            archiveHTML.setBounds(82,17,200,20);
            add(archiveHTML);

            JButton serachButton = new JButton("Search");
            serachButton.setBounds(295,17,85,20);
            add(serachButton);

            JLabel teste1 = new JLabel("Arquivo bem formatado");
            teste1.setBounds(8,0,370,170);
            add(teste1);

            JPanel panel = new JPanel(new BorderLayout());
            panel.setBounds(8,50,370,170);
            add(panel);

        setTitle("Titulo");
        setSize(400,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(211,211,211));
        setVisible(true);
    }
    public static void main(String[] args) {
        Tela tela = new Tela();
    }
}
