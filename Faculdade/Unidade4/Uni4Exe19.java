import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X, Y;

        System.out.println("X =");
        X = input.nextInt();

        System.out.println("Y =");
        Y = input.nextInt();

        if (X == 0 && Y == 0) {
            System.out.println();
            System.out.println("Quadrante 0");
        } else if (X > 0 && Y > 0) {
            System.out.println();
            System.out.println("Quadrante 1");
        } else if (X > 0 && Y < 0) {
            System.out.println();
            System.out.println("Quadrante 2");
        } else if (X < 0 && Y < 0) {
            System.out.println();
            System.out.println("Quadrante 3");
        } else {
            System.out.println();
            System.out.println("Quadrante 4");
        }

        input.close();
    }
}
