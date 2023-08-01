package Project;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListarContatos extends JFrame{
    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;

    Object [][] dados = {
        {"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com"},
        {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com"},
        {"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com"}
    };

    String [] colunas = {"Nome", "Telefone", "Email"};

    public void criaJanela(){

         

        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        ListarContatos lc = new ListarContatos();
        lc.criaJanela();
    }
}
