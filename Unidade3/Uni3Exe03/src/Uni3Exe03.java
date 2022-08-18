import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double dinheiro = input.nextDouble();
        double gasolinaLitro = input.nextDouble();
        double litro = dinheiro/gasolinaLitro;

        System.out.println("LITROS: " + litro);

        input.close();
        
    
    }
}
