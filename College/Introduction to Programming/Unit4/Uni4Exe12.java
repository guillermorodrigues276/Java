import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float lado1, lado2, lado3;

        System.out.println("Entre com o comprimento do lado 1");
        lado1 = input.nextFloat();

        System.out.println("Entre com o comprimento do lado 2");
        lado2 = input.nextFloat();

        System.out.println("Entre com o comprimento do lado 3");
        lado3 = input.nextFloat();

        if ((lado1 >= lado2 + lado3) || (lado2 >= lado1 + lado3) || (lado3 >= lado1 + lado2) || (lado1 <= 0)
                || (lado2 <= 0) || (lado3 <= 0)) {
            System.out.println();
            System.out.println("Não forma um triangulo");
        } else if ((lado1 == lado2) && (lado2 == lado3)) {
            System.out.println();
            System.out.println("É um triangulo equilátero");
        } else if ((lado1 == lado2) && (lado2 == lado3) || (lado1 == lado3)) {
            System.out.println();
            System.out.println("É um triangulo isósceles");
        } else {
            System.out.println();
            System.out.println("É um triangulo escaleno");
        }

        input.close();
    }
}