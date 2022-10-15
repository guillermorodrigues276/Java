import java.util.Scanner;

public class AtividadeExtraCurricular1versao2 {
    public static void main(String[] args) {

        int numeroEntrada, resultadoTabuada, adicionar;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número de 1-10: ");
        numeroEntrada = input.nextInt();

        adicionar = 1;
        while (true) {

            if (adicionar == 10) {
                break;
            }
            adicionar++;
            resultadoTabuada = numeroEntrada * adicionar;

            System.out.println(resultadoTabuada);

        }
        input.close();
    }
}
