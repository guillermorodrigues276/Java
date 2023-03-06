import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        double PI = 3.14159;

        System.out.println("Qual é o raio? ");

        int raio = teclado.nextInt();
        

        System.out.println(PI * raio*raio);


       teclado.close();
    }
}
