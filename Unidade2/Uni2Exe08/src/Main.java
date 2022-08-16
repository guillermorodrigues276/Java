import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int codPeca1 = input.nextInt();
        int numPeca1 = input.nextInt();
        double valorPeca1 = input.nextDouble();
        int codPeca2 = input.nextInt();
        int numPeca2 = input.nextInt();
        double valorPeca2 = input.nextDouble();

        double valorTotal = numPeca1 * valorPeca1 * numPeca2 * valorPeca2;

        System.out.printf("Valor a pagar: %.2f%n", valorTotal);
        
        input.close();
    }
}
