import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cateto1, cateto2, hipotenusa;

        System.out.println("Qual o valor do cateto 1 e 2 respectivamente?");
        cateto1 = input.nextInt();
        cateto2 = input.nextInt();

        hipotenusa = ((cateto1 * cateto1) + (cateto2 * cateto2));

        System.out.println("O comprimento da hipotenusa é:" + hipotenusa);

        input.close();

    }
}
