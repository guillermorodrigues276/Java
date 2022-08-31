import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float peso, valorPagar, pesoExcedido, qtdAdicional;

        System.out.println("Entre com o peso da carta.");

        peso = input.nextFloat();

        valorPagar = 0;

        if (peso <= 50) {
            valorPagar = 0.45f;
        } else {
            pesoExcedido = peso - 50;
            qtdAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * qtdAdicional;
        }
        System.out.println("Custo do selo " + valorPagar);

        input.close();

    }
}
