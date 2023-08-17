package Random2;

import java.util.Scanner;

public class ContaInterface {
    
    public void mostrarConta(){
        Scanner input = new Scanner(System.in);

        Conta c1 = new Conta();

        String opt = "";
        int opcao = 0;
        

        do{
            System.out.print("\nDigite a sua escolha: ");
            System.out.println();
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");

            switch(opcao){
                case 1:
                    System.out.println("Informe um valor para depositar: ");
                    double valorDeposito = input.nextDouble();
                    c1.depositar(valorDeposito);
                break;
                case 2:
                    System.out.println("Informe um valor para sacar: ");
                    double valorSaque = input.nextDouble();
                    c1.sacar(valorSaque);
                break;
                case 3:
                    System.out.println("Saldo: " + c1.getSaldo());
                break;
            }
    }while(opt != "n");



    }
}
