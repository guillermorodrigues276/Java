package Project;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Tela<T> extends JFrame implements ActionListener{

    private JLabel escritaArquivo;
    private JTextField archiveHTML;
    private JButton searchButton;
    private JLabel WriteOnBlankSpace;
    private JPanel panel;
    private JPanel panel2;
    private JTable table;
    private JScrollPane scroll;
    private T taConteudo;  
    private PilhaVetor<T> tags = new PilhaVetor<T>(15);



    public Tela(){
        setLayout(null); 

            //! Arquivo:
            escritaArquivo = new JLabel("Arquivo:");
            escritaArquivo.setBounds(10,15,100,20);
            add(escritaArquivo);

            //! Espaço para colocar o arquivo HTML
            archiveHTML = new JTextField();
            archiveHTML.setBounds(73,17,210,20);
            add(archiveHTML);                 
            

            //! Botao search
            searchButton = new JButton("Search");
            searchButton.setBounds(295,17,83,20);
            searchButton.addActionListener(this);
            add(searchButton);

            //! Escrita no espaço em branco
            WriteOnBlankSpace = new JLabel("Arquivo bem formatado");
            WriteOnBlankSpace.setBounds(8,0,370,170);
            add(WriteOnBlankSpace);
            WriteOnBlankSpace.setText("a"); //? código de escrita pos verificação 
            
            //! Painel em branco
            panel = new JPanel();
            panel.setBounds(8,50,370,130);
            add(panel);

            //! Painel e Tabela
            panel2 = new JPanel();
            panel2.setLayout(new GridLayout(1,1));
            panel2.setBounds(8,230,370,175);
            table = new JTable(dados,colunas);
            scroll = new JScrollPane(table);
            panel2.add(scroll);
            add(panel2);
            
            //! Configuração JFrame
            setTitle("HTML Scanner");
            setSize(400,450);
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            getContentPane().setBackground(new Color(0,211,211));
            setVisible(true);
    };

    Object [][] dados = {
        {"html",    "1"},
        {"body",    "2"},
        {"p",       "3"},
        {"br",      "4"}
    };

    String [] colunas = {"Tag", "Numeros de Ocorrências"};
    
    public static void main(String[] args) {
        Tela tela = new Tela();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub 
        JOptionPane.showMessageDialog(null, "Arquivo encontrado!");
        throw new UnsupportedOperationException("NAO FUNCIONOU");
    }   

    public T ReceberArquivo(){
        try { 
        Scanner arquivo = new Scanner(new File(archiveHTML.getText())); 
        while (arquivo.hasNextLine()) { 
            String linhaDoArquivo = arquivo.nextLine(); 
            taConteudo = (T) (linhaDoArquivo + "\n");
            tags.push((T)taConteudo);
        } 
    } catch (FileNotFoundException ex) {      
        }
        return taConteudo;
    }

    public T VerificaPilha(){    
        
        if(tags.peek().equals("<meta>")   || tags.peek().equals("<base>")     || 
        tags.peek().equals("<br>")      || tags.peek().equals("<col>")      || 
        tags.peek().equals("<command>") || tags.peek().equals("<embed>")    || 
        tags.peek().equals("<hr>")      || tags.peek().equals("<img>")      || 
        tags.peek().equals("<input>")   || tags.peek().equals("<link>")     || 
        tags.peek().equals("<param>")   || tags.peek().equals("<source>")   || tags.peek().equals("!DOCTYPE")) {
    }
    return tags;
}           
            
            


// if(tags.peek().equals("<meta>") || tags.peek().equals("<base>")     || 
// tags.peek().equals("<br>")      || tags.peek().equals("<col>")      || 
// tags.peek().equals("<command>") || tags.peek().equals("<embed>")    || 
// tags.peek().equals("<hr>")      || tags.peek().equals("<img>")      || 
// tags.peek().equals("<input>")   || tags.peek().equals("<link>")     || 
// tags.peek().equals("<param>")   || tags.peek().equals("<source>")   || tags.peek().equals("!DOCTYPE")) {}