import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double massaInicial, massa, tempoSegundos;

        tempoSegundos = 0;

        System.out.println("Escreva a massa inicial em Kg");
        massa = input.nextDouble();

        massaInicial = massa;

        while (true) {
            massa -= massa / 2;
            tempoSegundos += 50;

            if (massa < 0.5) {
                break;
            }
        }

        System.out.println("A massa inicial é: " + massaInicial);
        System.out.println("A massa final é: " + massa);
        System.out.println("Tempo estimado em segundos: " + tempoSegundos);

        input.close();
    }
}
