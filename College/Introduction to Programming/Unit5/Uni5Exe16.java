import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String genero = "";
        int qntMulheres = 0, qntHomens = 0, qntTotal = 0;
        double alturaTotal = 0.0, alturaMulheres = 0.0, altura = 0.0, alturaHomens = 0.0;

        while (true) {
            System.out.println("Qual o gênero do usuário (F ou M): ");
            genero = input.next();
            System.out.println("Qual a altura do usuário?");
            altura = input.nextDouble();

            if (altura == 0) {
                break;
            }

            if (genero.toLowerCase().equals("f")) {
                alturaMulheres += altura;
                qntMulheres++;
            } else if (genero.toLowerCase().equals("m")) {
                alturaHomens += altura;
                qntHomens++;
            } else {
                System.out.println("Gênero inválido.");
            }

        }

        System.out.println("A média de altura das mulheres é de: " + alturaMulheres / qntMulheres);

        alturaTotal = alturaHomens + alturaMulheres;
        qntTotal = qntHomens + qntMulheres;

        System.out.println("A média de altura geral do grupo é de: " + alturaTotal / qntTotal);

        input.close();
    }
}
