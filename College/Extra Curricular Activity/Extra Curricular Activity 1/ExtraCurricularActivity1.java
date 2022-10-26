import java.util.Scanner;

public class ExtraCurricularActivity1 {
    public static void main(String[] args) {

        int numeroEntrada, resultadoTabuada;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número de 1-10: ");
        numeroEntrada = input.nextInt();
        System.out.println();

        for (int n = 1; n <= 10; n++) {
            resultadoTabuada = numeroEntrada * n;

            System.out.println(resultadoTabuada);
        }
        input.close();
    }
}