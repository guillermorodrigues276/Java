import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        double valorMenor, valorMaior, valor;

        System.out.println("Informe qtd. de números: ");
        n = input.nextInt();

        valorMenor = Double.MAX_VALUE;
        valorMaior = Double.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.println("valor: ");
            valor = input.nextDouble();
            if (valor < valorMenor) {
                valorMenor = valor;
            }
            if (valor > valorMaior) {
                valorMaior = valor;
            }
        }
        System.out.println("menor: " + valorMenor);
        System.out.println("maior: " + valorMaior);

        input.close();
    }
}