package Random2;

import java.util.ArrayList;
import java.util.Scanner;

public class UsaConta {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Conta> contas = new ArrayList<Conta>();

        String escolhaUsuario;
        int usuarioID;
        double deposito, saque;
        boolean variavelBoo = true;

        usuarioID = 0;
        deposito = 0;
        saque = 0;



        while(variavelBoo){
            System.out.println("A lista está vazia? " + contas.isEmpty());
            System.out.println("Tamanho da lista: " + contas.size());
            
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Usuario");
            System.out.println("2 - Usuario Novo");
            System.out.println("3 - Sair");

            String opcaoPerguntaUsuario = input.next();

            // usuario existente
            if(opcaoPerguntaUsuario.equals("1")){
                
                System.out.println("Qual seu ID?");
                usuarioID = input.nextInt();

                System.out.println("--- BANCO ---");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Saldo");
                
                escolhaUsuario = input.next();

                if(escolhaUsuario.equals("1")) {
                    System.out.println("Valor do deposito: ");
                    deposito = input.nextDouble();
                    contas.get(usuarioID).depositar(deposito);
                }
                else if(escolhaUsuario.equals("2")) {
                    System.out.println("Valor do saque: ");
                    saque = input.nextDouble();
                    contas.get(usuarioID).sacar(saque);
                }
                else if(escolhaUsuario.equals("3")) {
                    System.out.println("Saldo: " + contas.get(usuarioID).getSaldo());
                    
                }
                else{
                    System.out.println("Erro");
                    throw new IllegalArgumentException("Aconteceu um erro, tente novamente!");
                }
            }
            // novo usuario
            else if(opcaoPerguntaUsuario.equals("2")){
                int novoID = usuarioID++;

                System.out.println("Seus ID de usuario sera: " + novoID);

                System.out.println("Informe o nome do titular: ");
                String titular = input.next();

                contas.add(new Conta(novoID, titular));
            }
            else if(opcaoPerguntaUsuario.equals("3")){
                variavelBoo = false;
            }
            else{
                throw new IllegalArgumentException("Houve um erro!");
            }
        
        }
    }
}