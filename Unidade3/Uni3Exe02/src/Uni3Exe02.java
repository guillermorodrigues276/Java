import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o preço do sapato?");
        int precoTenis = input.nextInt();

        double valorDesconto;

        valorDesconto = (precoTenis * 0.12);
        double tenisDesconto;
        tenisDesconto = precoTenis-valorDesconto;

        System.out.println("O valor do desconto é: " + valorDesconto);
        System.out.println("O valor do tênis é: " + tenisDesconto);

        input.close();
        
    }
}
