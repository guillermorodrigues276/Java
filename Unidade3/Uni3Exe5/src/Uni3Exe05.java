import java.util.Scanner;

public class Uni3Exe05{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int quantidadeFrango = input.nextInt();
        double anelChip = 4.00;
        double ane2 = 3.50*2;

        double total = quantidadeFrango*anelChip + quantidadeFrango*ane2;
        
        System.out.println("O total gasto é: " + total);

        input.close();


    }
}