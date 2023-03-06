import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String opcao;
        int baseTriangulo, alturaTriangulo, ladoQuadrado, baseRetangulo, alturaRetangulo, raio;

        System.out.println("Escolha uma opção: (DIGITAR EM MAIUSCULO) ");
        System.out.println();
        System.out.println("T : calcular a área de um triângulo de base (b) e altura (h)");
        System.out.println();
        System.out.println("Q : calcular a área de um quadrado de lado (l)");
        System.out.println();
        System.out.println("R : calcular a área de um retângulo de base (b) e altura (h)");
        System.out.println();
        System.out.println("C : calcular a área de um círculo de raio (r)");
        System.out.println();

        opcao = input.next();

        switch (opcao) {
            case "T":
                System.out.println("Digite a base a altura do triangulo: ");
                alturaTriangulo = input.nextInt();
                baseTriangulo = input.nextInt();
                System.out.println();
                System.out.println("Area do triagulo = " + ((baseTriangulo * alturaTriangulo) / 2));
                break;

            case "Q":
                System.out.println("Digite o lado: ");
                ladoQuadrado = input.nextInt();
                System.out.println();
                System.out.println("Area do quadrado = " + (ladoQuadrado * ladoQuadrado));
                break;

            case "R":
                System.out.println("Digite a base e a altura do retângulo: ");
                baseRetangulo = input.nextInt();
                alturaRetangulo = input.nextInt();
                System.out.println();
                System.out.println("Area do retângulo = " + (alturaRetangulo * baseRetangulo));
                break;

            case "C":
                System.out.println("Digite o raio do circulo: ");
                raio = input.nextInt();
                System.out.println();
                System.out.println("Area do circulo = " + (Math.PI * Math.pow(raio, 2)));
                break;

            default:
                System.out.println("Opção inválida");

        }
        input.close();
    }
}
