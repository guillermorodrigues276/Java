import java.util.Scanner;

public class Un4Exe08 {
    public static void main(String[] args) {

        System.out.println("introduza a letra:");
        Scanner input = new Scanner(System.in);

        String N = input.next();
        char c = N.charAt(0);

        System.out.println(N);

        if (N != "a") {
            System.out.println("É uma consoante");
        } else if (N != "e") {
            System.out.println("É uma consoante");
        } else if (N != "i") {
            System.out.println("É uma consoante");
        } else if (N != "o") {
            System.out.println("É uma consoante");
        } else if (N != "u") {
            System.out.println("É uma consoante");
        } else {
            System.out.println("É vogal");
        }
        input.close();
    }
}