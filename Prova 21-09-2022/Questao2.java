import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // FORMA DE PAGAMENTO
        String formaPagamento;
        // METODO DE PAGAMENTO
        double debito, pix; 
        // VALOR COMPRA
        double valorCompra;
        // PREÇOS SEPARADOS
        double restoDebito, descontoPIX, descontoCemDIa;
        // CREDIARIO
        int diaVencimento, diaPagamento, diaAtraso;
        double multa, quantidadesVezesPagar, parcelaCrediario;
        String sim;

        // LER FORMA DE PAGAMENTO
        System.out.println("Qual a forma de Pagamento?");
        System.out.println("1 - Débito?");
        System.out.println("2 - Pix");
        System.out.println("3 - Crediário");
        System.out.println("Escolha um número: ");
        formaPagamento = input.next();

        System.out.println("Qual o valor da compra?");
        valorCompra = input.nextDouble();

        debito = valorCompra;
        pix = valorCompra;

        sim = "sim";
        quantidadesVezesPagar = 0;
        diaPagamento = 0;
        diaVencimento = 0;
        diaAtraso = diaPagamento - diaVencimento;
        multa = 0;

        // OPÇÃO DE PAGAMENTO
        switch (formaPagamento) {

            case "1":
                restoDebito = valorCompra * 0.03;
                valorCompra = restoDebito + debito;

                System.out.println("O valor para pagar é: R$" + valorCompra + " com um acrécimo de R$" + restoDebito);
                break;
            case "2":
                descontoPIX = valorCompra * 0.05;
                valorCompra = pix - descontoPIX;

                System.out.println("O valor para pagar é: R$" + valorCompra + " com um desconto de R$" + descontoPIX);
                break;
            case "3":
                System.out.println("O valor da fatura total é: R$" + valorCompra);
                System.out.println("Gostaria de parcelar? ");
                System.out.println("Escreva (sim) se quiser.");
                sim = input.next();
                if (sim.equals("sim")) {
                    System.out.println("Quantas vezes?");
                    quantidadesVezesPagar = input.nextDouble();
                    parcelaCrediario = valorCompra / quantidadesVezesPagar;
                    valorCompra = parcelaCrediario;
                    System.out.println("A compra ficará em " + quantidadesVezesPagar + " vezes de " + parcelaCrediario);
                } else {
                    System.out.println("Sera o valor completo de: R$" + valorCompra);
                }
                System.out.println("Qual a data do pagamento?");
                diaPagamento = input.nextInt();
                System.out.println("Qual a data do vencimento");
                diaVencimento = input.nextInt();
                diaAtraso = diaPagamento - diaVencimento;

                if (diaAtraso <= 0) {
                    descontoCemDIa = valorCompra * 0.15;
                    valorCompra = valorCompra - descontoCemDIa;
                    System.out.println(
                            "O pagamento está em dia e o valor será: R$ " + (valorCompra)
                                    + " Com 15% de desconto já aplicado.");
                } else if (diaAtraso > 0 && diaAtraso <= 10) {
                    System.out.println("O pagamento está levemente atrasado e o valor será: R$ " + (valorCompra)
                            + " Sem descontos aplicados.");
                } else if (diaAtraso > 10) {
                    multa = valorCompra * diaAtraso * 0.02;
                    valorCompra = valorCompra + multa;
                    System.out.println(
                            "O pagamento está atrasado e o valor será: R$ " + (valorCompra) + " Com " + diaAtraso
                                    + " dias de atraso.");
                }
                input.close();
        }
    }
}
