import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        Double C = input.nextDouble();

        double areaTriangulo;
        areaTriangulo = (A * B)/2.0;
        System.out.println("A area do triangulo é: " + areaTriangulo);

        double areaCirculo;
        areaCirculo = 3.14159 * (C * C);
        System.out.println("A area do circulo é: " + areaCirculo);

        double areaTrapezio;
        areaTrapezio = ((A + B) * C);
        System.out.println("A area do trapezio é: " + areaTrapezio);

        double areaQuadrado;
        areaQuadrado = (B * B);
        System.out.println("A area do quadrado é: " + areaQuadrado);

        double areaRetangulo;
        areaRetangulo = (A * B);
        System.out.println("A area do retangulo é: " + areaRetangulo);



        



        input.close();
    }
}
