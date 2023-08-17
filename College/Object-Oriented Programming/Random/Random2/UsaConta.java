package Random2;

import java.util.Scanner;

public class UsaConta {

    public static void mostrarConta(){
        Scanner input = new Scanner(System.in);

        Conta c1 = new Conta();

        int opcao = 0;
        boolean variavelBoo = true;

        while(variavelBoo){
            System.out.print("Digite a sua escolha: ");
            System.out.println();
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair do sistema");

            opcao = input.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Informe um valor para depositar: ");
                    double valorDeposito = input.nextDouble();
                    c1.depositar(valorDeposito);
                    variavelBoo = true;
                break;

                case 2:
                    System.out.println("Informe um valor para sacar: ");
                    double valorSaque = input.nextDouble();
                    c1.sacar(valorSaque);
                    variavelBoo = true;
                break;

                case 3:
                    System.out.println("Saldo: " + c1.getSaldo());
                    variavelBoo = true;
                break;

                case 4:
                    System.out.println("Saindo do sistema");
                    variavelBoo = false;
            }
        }
    }

    public static void main(String[] args) {
        Conta c1 = new Conta();

        mostrarConta();
    }
}