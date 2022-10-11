import java.util.Scanner;

public class Uni5Exe23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario = 0.0;
        double totalVendas = 0.0;
        double comissao = 0.0;

        while (true) {
            System.out.println("Nome vendedor: ");
            String nome = input.next();

            if (nome.toLowerCase().equals("fim")) {
                break;
            }

            while (true) {
                System.out.println("Preco do produto: ");
                double preco = input.nextDouble();
                System.out.println("Qnt do produto: ");
                int qnt = input.nextInt();

                if (qnt == 0) {
                    System.out.println("Você deseja cadastrar outro vendedor? SIM / NÃO");
                    String opt = input.next();
                    if (opt.toLowerCase().equals("sim")) {
                        break;
                    } else if (opt.toLowerCase().equals("nao")) {
                        System.exit(0);
                    } else {
                        System.out.println("Opcao Invalida!");
                    }
                }

                totalVendas = preco * qnt;
                comissao = preco * 0.30;

                salario += comissao;

            }
            System.out.println("Funcionário: " + nome + " Total de vendas: " + totalVendas + " Salario: " + salario);
        }

        input.close();

    }

}