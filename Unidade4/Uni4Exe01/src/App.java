import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horasMes, valorPagoHora, salarioTotal, salarioExtra;

        System.out.println("Entre com as horas trabalhadas no mês: ");
        horasMes = input.nextInt();

        System.out.println("Entre com o valor pago por hora: ");
        valorPagoHora = input.nextInt();

        salarioTotal = horasMes * valorPagoHora;

        if (horasMes > 160) {
            salarioExtra = (horasMes - 160) * (valorPagoHora / 2);
            salarioTotal = salarioTotal + salarioExtra;

        }
        System.out.println("O salario total é: " + salarioTotal);

        input.close();
    }
}
