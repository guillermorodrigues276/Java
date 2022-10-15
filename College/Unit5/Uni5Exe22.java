import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");

        int ano = 1995;
        double salario = 2000.00, aumentoSalario = 0.0, porcentagem = 0.015, diferenca = 0;
        System.out.println("Digite o ano atual");
        int anoAtual = input.nextInt();

        while (true) {
            if (ano == 1995) {
                salario = 2000.00;
                System.out.println("[" + ano + "]" + salario + "[" + "---" + "]");
            }

            ano++;

            if (ano == 1996) {
                porcentagem = 0.015;
                aumentoSalario = salario * porcentagem;
                salario += aumentoSalario;
                System.out.println("[" + ano + "]" + salario + "[" + porcentagem + "]");
            }
            if (ano > 1996) {
                porcentagem += porcentagem;
                diferenca = salario * porcentagem;
                salario += diferenca;
                System.out.println("[" + ano + "]" + df.format(salario) + "[" + porcentagem + "]");
            }

            if (ano >= anoAtual) {
                break;
            }
        }
        input.close();
    }
}
