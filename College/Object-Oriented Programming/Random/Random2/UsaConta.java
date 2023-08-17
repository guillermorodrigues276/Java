package Random2;

import java.util.Scanner;

public class UsaConta {

    public static void mostrarConta(){
        Scanner input = new Scanner(System.in);

        Conta c1 = new Conta();

        String opt = "s";
        int opcao = 0;
        boolean variavelBoo = true;
        
        while(opt != "n"){

            while(variavelBoo == true){
                System.out.print("Digite a sua escolha: ");
                System.out.println();
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Saldo");
                System.out.println("4 - Opções");

            
                opcao = input.nextInt();
            
                if(opcao == 1){
                    System.out.println("Informe um valor para depositar: ");
                    double valorDeposito = input.nextDouble();
                    c1.depositar(valorDeposito);
                    variavelBoo = true;
                }else if(opcao == 2){
                    System.out.println("Informe um valor para sacar: ");
                    double valorSaque = input.nextDouble();
                    c1.sacar(valorSaque);
                    variavelBoo = true;
                }else if(opcao == 3){
                    System.out.println("Saldo: " + c1.getSaldo());
                    variavelBoo = true;

                }
            }
            
            // switch(opcao){
            //     case 1:
            //         System.out.println("Informe um valor para depositar: ");
            //         double valorDeposito = input.nextDouble();
            //         c1.depositar(valorDeposito);
            //     break;
            //     case 2:
            //         System.out.println("Informe um valor para sacar: ");
            //         double valorSaque = input.nextDouble();
            //         c1.sacar(valorSaque);
            //     break;
            //     case 3:
            //         System.out.println("Saldo: " + c1.getSaldo());
            //     break;        
            //     case 4:
            //         System.out.print("Digite a sua escolha: ");
            //         System.out.println();
            //         System.out.println("1 - Depositar");
            //         System.out.println("2 - Sacar");
            //         System.out.println("3 - Saldo");
            //         System.out.println("4 - Opções");
            //     break;
            // }
            opt = input.next();
        }
    }

    public static void main(String[] args) {
        Conta c1 = new Conta();

        mostrarConta();
    }
}
