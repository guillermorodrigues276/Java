import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        int numeroFuncionario = teclado.nextInt();
        int horasTrabalhadas = teclado.nextInt();
        double valorRecebido = teclado.nextDouble();
        double salario = horasTrabalhadas * valorRecebido;

        System.out.println("Numero: " + numeroFuncionario);
        System.out.printf("Salario = R$ %.2f%n", salario);

        teclado.close();
    }
}
