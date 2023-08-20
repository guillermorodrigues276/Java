package Random2;

import java.util.ArrayList;
import java.util.Scanner;

public class UsaConta {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Conta> contas = new ArrayList<Conta>();

        // Conta c1 = new Conta(1, "Pedro");
        // Conta c2 = new Conta(2, "João");

        // contas.add(c1);
        // contas.add(c2);
        
        Conta operacao = new Conta(0, null);
        String escolhaUsuario;
        int opcao, variavelConta, usuarioID;
        double deposito, saque;
        boolean variavelBoo = true;

        opcao = 0;
        variavelConta = 0;
        usuarioID = 0;
        deposito = 0;
        saque = 0;



        while(variavelBoo){
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
                    operacao.sacar(saque);
                }
                else if(escolhaUsuario.equals("3")) {
                    System.out.println("Saldo: " + operacao.getSaldo());
                    
                }
                else{
                    System.out.println("Erro");
                    throw new IllegalArgumentException("Aconteceu um erro, tente novamente!");
                }
            }
            // novo usuario
            else if(opcaoPerguntaUsuario.equals("2")){
                int novoID = usuarioID + 1;

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