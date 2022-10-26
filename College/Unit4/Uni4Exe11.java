import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade1, idade2, idade3;

        System.out.println("Entre o ano de nascimento do primeiro irmão");
        idade1 = input.nextInt();

        System.out.println("Entre o ano de nascimento do segundo irmão");
        idade2 = input.nextInt();

        System.out.println("Entre o ano de nascimento do terceiro irmão");
        idade3 = input.nextInt();

        if (idade1 == idade2) {
            if (idade1 == idade3) {
                if (idade3 == idade2) {
                    System.out.println("São trigêmeos");
                }
            }
        }
        if (idade1 == idade2) {
            if (idade1 != idade3) {
                System.out.println("São gêmeos");
            }
        }
        if (idade1 != idade2) {
            if (idade1 != idade3) {
                System.out.println("São apenas irmãos");
            }
        }
        input.close();
    }
}