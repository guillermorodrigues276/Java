import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int voto1, voto2, voto3, voto4, voto5, voto, total;
        double percentual1, percentual2, percentual3, percentual4, percentual5;

        voto1 = 0;
        voto2 = 0;
        voto3 = 0;
        voto4 = 0;
        voto5 = 0;
        voto = 0;
        total = 0;

        percentual1 = 0.0;
        percentual2 = 0.0;
        percentual3 = 0.0;
        percentual4 = 0.0;
        percentual5 = 0.0;

        do {
            System.out.println();
            System.out.println("Opção 1 = Nenhum de Nós");
            System.out.println("Opção 2 = CPM22");
            System.out.println("Opção 3 = Skank");
            System.out.println("Opção 4 = Jota Quest");
            System.out.println("Opção 5 = Nenhum dos anteriores");
            System.out.println();

            voto = input.nextInt();

            switch (voto) {
                case 1:
                    voto1++;
                    break;
                case 2:
                    voto2++;
                    break;
                case 3:
                    voto3++;
                    break;
                case 4:
                    voto4++;
                    break;
                case 5:
                    voto5++;
                    break;
                default:
                    System.out.println("Voto Inválido");
            }

            System.out.println("Você deseja votar novamente? S (SIM) / N (NÃO)");
            String opt = input.next();

            if (opt.toLowerCase().equals("s")) {
                System.out.println("//////////////////////");
                System.out.println("Novo voto: ");
                System.out.println("");
            }
            if (opt.toLowerCase().equals("n")) {
                break;
            }
        } while (voto != 0);

        total = voto1 + voto2 + voto3 + voto4 + voto5;

        percentual1 = (voto1 * 100) / (double) total;
        percentual2 = (voto2 * 100) / (double) total;
        percentual3 = (voto3 * 100) / (double) total;
        percentual4 = (voto4 * 100) / (double) total;
        percentual5 = (voto5 * 100) / (double) total;

        System.out.println("Votos do Nenhum de Nós = " + voto1 + " com: " + df.format(percentual1) + "% de votos.");
        System.out.println("Votos do CPM22 = " + voto2 + " com: " + df.format(percentual2) + "% de votos.");
        System.out.println("Votos do Skank = " + voto3 + " com: " + df.format(percentual3) + "% de votos.");
        System.out.println("Votos do Jota Quest = " + voto4 + " com: " + df.format(percentual4) + "% de votos.");
        System.out.println("Nenhuma das anteriores = " + voto5 + " com: " + df.format(percentual5) + "% de votos.");

        if (voto1 > voto2 && voto1 > voto3 && voto1 > voto4 && voto1 > voto5) {
            System.out.println("Nenhum de Nós ganhou a votação!");
        }
        if (voto2 > voto1 && voto2 > voto3 && voto2 > voto4 && voto2 > voto5) {
            System.out.println("CPM22 ganhou a votação!");
        }
        if (voto3 > voto1 && voto3 > voto2 && voto3 > voto4 && voto3 > voto5) {
            System.out.println("Skank ganhou a votação!");
        }
        if (voto4 > voto1 && voto4 > voto2 && voto4 > voto3 && voto4 > voto5) {
            System.out.println("Jota Quest ganhou a votação!");
        }
        if (voto5 > voto1 && voto5 > voto2 && voto5 > voto3 && voto5 > voto4) {
            System.out.println("O público se recusou a votar em alguma das bandas.");
        }
        input.close();
    }
}
