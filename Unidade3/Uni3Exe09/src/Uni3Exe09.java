import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float volume, pi, raio, altura;

        pi = 3.14f;
        raio = input.nextFloat();
        altura = input.nextFloat();

        volume = pi * (raio*raio) * altura;


            System.out.println("O volume da lata de oleo é:" + volume);
        input.close();


    }
}

