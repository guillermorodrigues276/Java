import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia de vencimento");
        int diaVencimento = scanner.nextInt();
        System.out.println("Digite o dia em que o pagamento foi realizado");
        int diaPagamento = scanner.nextInt();
        System.out.println("Digite o valor da prestação");
        double valorPrestacao = scanner.nextDouble();

        int diasAtraso = diaPagamento - diaVencimento;
        double multa = 0;

        if (diasAtraso <= 0) {
            valorPrestacao = valorPrestacao - (valorPrestacao * 0.10);
            System.out.println(
                    "O pagamento está em dia e o valor será: R$ " + (valorPrestacao)
                            + " Com 10% de desconto já aplicado.");
        } else if (diasAtraso > 0 && diasAtraso <= 5) {
            System.out.println("O pagamento está levemente atrasado e o valor será: R$ " + (valorPrestacao)
                    + " Sem descontos aplicados.");
        } else if (diasAtraso > 5) {
            multa = diasAtraso * 0.2;
            valorPrestacao = valorPrestacao + multa;
            System.out.println("O pagamento está atrasado e o valor será: R$ " + (valorPrestacao) + " Com " + diasAtraso
                    + " dias de atraso.");
        }
        scanner.close();
    }
}