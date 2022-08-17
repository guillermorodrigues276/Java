import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float temperaturaC, temperaturaF;

        temperaturaC = input.nextFloat();

        temperaturaF = (temperaturaC*9/5)+32;

        System.out.println(("A temperatura em F é:") + temperaturaF);

        input.close();

    }
}
