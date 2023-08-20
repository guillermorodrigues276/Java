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
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Usuario");
            System.out.println("2 - Usuario Novo");
            System.out.println("3 - Sair");

            String opcaoPerguntaUsuario = input.next();
            System.out.println();

            // usuario existente
            if(opcaoPerguntaUsuario.equals("1")){
                
                System.out.println("Qual seu ID?");
                usuarioID = input.nextInt();
                System.out.println();

                System.out.println("Bem vindo senhor(a) " + contas.get(usuarioID).getTitular());
                System.out.println();
                System.out.println("--- BANCO ---");
                System.out.println();
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Saldo");
                System.out.println("4 - Transferir (INACESSIVEL)");
                System.out.println("5 - Dados");
                System.out.println();
                
                escolhaUsuario = input.next();
                System.out.println();

                if(escolhaUsuario.equals("1")) { // DEPOSITO
                    System.out.println();
                    System.out.println("Valor do deposito: ");
                    deposito = input.nextDouble();
                    contas.get(usuarioID).depositar(deposito);
                    System.out.println();
                }
                else if(escolhaUsuario.equals("2")) { // SAQUE
                    System.out.println();
                    System.out.println("Valor do saque: ");
                    saque = input.nextDouble();
                    contas.get(usuarioID).sacar(saque);
                    System.out.println();
                }
                // else if(escolhaUsuario.equals("")) { // TRANSFERIR
                //     System.out.println("Para qual conta deseja transferir? (Digite o numero da conta)");

                // }
                else if(escolhaUsuario.equals("3")) { // SALDO
                    System.out.println();
                    System.out.println("Saldo: " + contas.get(usuarioID).getSaldo());  
                    System.out.println();
                }
                else if (escolhaUsuario.equals("5")) { // MOSTRAR
                    contas.get(usuarioID).mostrarDados();
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
                System.out.println();

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