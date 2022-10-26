import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valorCompra, totalAPagar, compraComDesconto, precoSoma;

        valorCompra = 0;
        totalAPagar = 0;
        precoSoma = 0;

        while (true) {
            System.out.println("Qual o valor da compra?");
            valorCompra = input.nextDouble();

            if (valorCompra == 0) {
                System.out.println("A compra foi finalizada!");
                break;
            }

            if (valorCompra > 500) {
                compraComDesconto = (valorCompra * 0.20);
                totalAPagar = valorCompra - compraComDesconto;
                System.out.println("O valor da compra é de: " + totalAPagar + " Com 20% de deconto.");
                precoSoma += totalAPagar;
            }
            if (valorCompra <= 500) {
                compraComDesconto = (valorCompra * 0.15);
                totalAPagar = valorCompra - compraComDesconto;
                System.out.println("O valor da compra é de: " + totalAPagar + " Com 15% de deconto.");
                precoSoma += totalAPagar;
            }

        }
        System.out.println("O valor total da compra é de: " + precoSoma);

        System.out.println("O valor que a loja vai receber é de: " + precoSoma);

        input.close();
    }
}
