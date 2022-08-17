import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o peso do prato?");
        float totalAPagar, peso, pesoPrato, pesoSozinho;
        peso = input.nextFloat();
        pesoPrato = 0.750f;
        pesoSozinho = peso-pesoPrato;

        totalAPagar = 25*pesoSozinho;

        

        System.out.println("O seu prato deu um valor total de: " + totalAPagar);

        input.close();
        
    }
}