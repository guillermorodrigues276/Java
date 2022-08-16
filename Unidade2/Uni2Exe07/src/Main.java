import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String nome = input.next();
        double salarioFixo = input.nextDouble();
        double vendasEfetuadas = input.nextDouble();
        double comissao = vendasEfetuadas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.printf("TOTAL - R$ %.2f%n", salarioFinal);

       input.close();
    }
}
