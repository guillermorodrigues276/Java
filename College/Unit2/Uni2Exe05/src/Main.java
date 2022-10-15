import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();
        int DIFERENCA;

        DIFERENCA = (A * B - C * D)*1;

        System.out.println("A diferenca é: " + DIFERENCA);

        teclado.close();

        
    }
}
