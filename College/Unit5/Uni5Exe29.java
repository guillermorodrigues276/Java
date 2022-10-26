import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pagamentoCompra, nota1, nota2, nota5, nota10, nota20, atual;

        nota1 = 1;
        nota2 = 2;
        nota5 = 5;
        nota10 = 10;
        nota20 = 20;

        System.out.println("Informe o valor: ");
        pagamentoCompra = input.nextInt();

        atual = pagamentoCompra;

        nota20 = atual / 20;
        atual -= nota20 * 20;

        nota10 = atual / 10;
        atual -= nota10 * 10;

        nota5 = atual / 5;
        atual -= nota5 * 5;

        nota2 = atual / 2;
        atual -= nota2 * 2;

        nota1 = atual / 1;
        atual -= nota1 * 1;

        System.out.println(pagamentoCompra);
        System.out.println(nota20 + " Cédulas de R$20");
        System.out.println(nota10 + " Cédulas de R$10");
        System.out.println(nota5 + " Cédulas de R$5");
        System.out.println(nota2 + " Cédulas de R$2");
        System.out.println(nota1 + " Cédulas de R$1");

        input.close();
    }
}
