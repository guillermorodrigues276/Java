import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        List<Integer> producao = new ArrayList<Integer>();
        List<Integer> dias = new ArrayList<Integer>();

        int dia = 0, producaoManha = 0, producaoTarde = 0, producaoTotal;
        double salario = 0.0;

        while (true) {
            System.out.println("Qual é o dia?: ");
            dia = input.nextInt();

            if (dia < 0 || dia > 31) {
                System.out.println("Dia inválido!");
            } else {
                dias.add(dia);

                System.out.println("Digite a producao do periodo matutino: ");
                producaoManha = input.nextInt();
                System.out.println("Digite a producao do periodo vespertino: ");
                producaoTarde = input.nextInt();

                producaoTotal = (producaoManha + producaoTarde);
                producao.add(producaoTotal);

                if (dia <= 15 && producaoManha >= 30 && producaoTarde >= 30) {
                    salario = producaoTotal * 0.8;
                }
                if (dia <= 15) {
                    salario = producaoTotal * 0.5;
                }
                if (dia >= 16) {
                    salario = (producaoManha * 0.4) + (producaoTarde * 0.3);
                }

                if (producaoManha > producaoTarde) {
                    System.out.println(
                            "A produção da manhã foi maior que a da tarde; " +
                                    producaoManha +
                                    " produtos produzidos.");
                }
                if (producaoTarde > producaoManha) {
                    System.out.println(
                            "A produção da tarde foi maior que a produção da manhã; " +
                                    producaoTarde +
                                    " produtos produzidos.");
                }

                System.out.println("R$ " + df.format(salario) + " (valor recebido)");
                System.out.println("///////////////////////////////////"); // separador <<

                System.out.println("Novo funcionário? (1 - sim, 2 - não)");
                int opt = input.nextInt();

                if (opt == 1) {
                    System.out.println("////////////////////");
                }
                if (opt == 2) {
                    System.out.println(
                            "Resultados de desempenho obtidos e sistema finalizado.");
                    break;
                }
            }
        }

        int maxIndex = producao.indexOf(
                producao.stream().max(Comparator.naturalOrder()).get());

        System.out.println(
                "O dia onde obteve-se a maior produção foi o dia: " +
                        dias.get(maxIndex) +
                        " de Abril.");

        input.close();
    }
}
