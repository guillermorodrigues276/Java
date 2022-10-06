import java.util.Scanner;

public class AtividadeExtraCurricular3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String fruta1, fruta2, fruta3, fruta4, fruta5;

        System.out.println("Escreva o valor de 5 frutas ->");
        fruta1 = input.next();
        fruta2 = input.next();
        fruta3 = input.next();
        fruta4 = input.next();
        fruta5 = input.next();

        System.out.println();
        System.out.println(fruta1);
        System.out.println(fruta2);
        System.out.println(fruta3);
        System.out.println(fruta4);
        System.out.println(fruta5);

        input.close();
    }
}
