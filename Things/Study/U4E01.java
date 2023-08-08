import java.util.Scanner;

public class U4E01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroHoraTrabalhada;
        double valorHoraTrabalhada;

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        numeroHoraTrabalhada = input.nextInt();

        System.out.println("Informe o valor da hora trabalhada: ");
        valorHoraTrabalhada = input.nextDouble();

        if(numeroHoraTrabalhada < 40){
            System.out.println("Voce trabalhou menos horas do que está no seu contrato. R$" + (numeroHoraTrabalhada * valorHoraTrabalhada));

        }else if(numeroHoraTrabalhada == 40){
            System.out.println("Você vai ganhar o seu salário normalmente, não fez horas extras. R$" + (numeroHoraTrabalhada * valorHoraTrabalhada));
        }else{
            int horasExtras = numeroHoraTrabalhada - 40;
            double dinheiroH = (horasExtras * (valorHoraTrabalhada + (valorHoraTrabalhada * 0.5)));
            double dinheiroTotal = (40 * valorHoraTrabalhada + dinheiroH);

            System.out.println("Parabéns, você fez horas extras, seu salário vai ser de: R$" + dinheiroTotal);
        }
    }
}
