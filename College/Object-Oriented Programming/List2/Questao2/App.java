package List2.Questao2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ContaBancaria[] conta = new ContaBancaria[2];

        for(int i = 0; i < conta.length; i++){
            conta[i] = new ContaBancaria();

            System.out.println("Informe o nome do titular da " + (i + 1) + " conta.");
            conta[i].setTitular(input.nextLine());
            System.out.println("Informe o numero da conta " + (i + 1));
            conta[i].setNumero(input.nextLine());
        }

        conta[0].depositar(1000);
        conta[0].depositar(700);

        conta[1].depositar(5000);
        conta[1].sacar(3000);

        conta[1].transferir(conta[0], 1800);

        for(int i = 0; i < conta.length; i++){
            System.out.println();
            System.out.println("--- DADOS ---");
            System.out.println();
            System.out.println("Titular: " + conta[i].getTitular());
            System.out.println("Conta: " + conta[i].getNumero());
            System.out.println("Saldo: " + conta[i].getSaldo());
        }
    }
}
