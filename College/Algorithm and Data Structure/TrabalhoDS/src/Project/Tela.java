package Project;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridLayout;

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
            WriteOnBlackSpace.setText("PEDRO PAULO"); //? Escrita pos verificação

            //! Painel em branco
            JPanel panel = new JPanel();
            panel.setBounds(8,50,370,130);
            add(panel);

            //! Painel e Tabela
            JPanel panel2 = new JPanel();
            panel2.setLayout(new GridLayout(1,1));
            panel2.setBounds(8,230,370,175);
            JTable table = new JTable(dados,colunas);
            JScrollPane scroll = new JScrollPane(table);
            panel2.add(scroll);
            add(panel2);
            
            //! Configuração JFrame
            setTitle("HTML Scanner");
            setSize(400,450);
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            getContentPane().setBackground(new Color(211,211,211));
            setVisible(true);
    };

    Object [][] dados = {
        {"html", "1"},
        {"body", "2"},
        {"p", "3"},
        {"br", "4"}
    };

    String [] colunas = {"Tag", "Numeros de Ocorrências"};
    
    public static void main(String[] args) {
        Tela tela = new Tela();
    }
}


//? @test fazer um scanner no blankSpace que vai ler o que for escrito e armazenar em uma variavel,
//? após isso ele ira verificar no outro scanner se o arquivo escrito contem um .html, se tiver vai
//? vai ser ser verificado pela biblioteca readArchive

//? Ler arquivo com scanner, fazer verificação e achar um jeito de ver o arquivo .html
//