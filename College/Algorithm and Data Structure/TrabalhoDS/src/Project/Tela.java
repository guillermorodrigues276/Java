package Project;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;

public class Tela extends JFrame{

    Tela(){
        setLayout(null);

            //! Arquivo:
            JLabel escritaArquivo = new JLabel("Arquivo:");
            escritaArquivo.setBounds(10,15,100,20);
            add(escritaArquivo);

            //! Espaço para colocar o arquivo HTML
            JTextField archiveHTML = new JTextField();
            archiveHTML.setBounds(73,17,210,20);
            add(archiveHTML);

            //! Botao search
            JButton serachButton = new JButton("Search");
            serachButton.setBounds(295,17,83,20);
            add(serachButton);

            //! Escrita no espaço em branco
            JLabel WriteOnBlackSpace = new JLabel("Arquivo bem formatado");
            WriteOnBlackSpace.setBounds(8,0,370,170);
            add(WriteOnBlackSpace);

            //! Painel em branco
            JPanel panel = new JPanel();
            panel.setBounds(8,50,370,130);
            add(panel);

            //! Painel branco de baixo
            JPanel panel2 = new JPanel();
            panel2.setBounds(8,230,370,175);
            add(panel2);
        

            // JTable table = new JTable();
            // JScrollPane spTable = new JScrollPane(table);     
            // spTable.setBounds(8,230,350,170);
            // table.setVisible(true);
            // panel2.add(spTable);
            

        setTitle("HTML Scanner");
        setSize(400,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(211,211,0));
        setVisible(true);
    }
    public static void main(String[] args) {
        Tela tela = new Tela();
    }
}