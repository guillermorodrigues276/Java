import java.util.Scanner;

public class ExtraCurricularActivity2_1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int quantidade;
        
        System.out.println("Escreva o numero de numeros que o array terá: ");
        quantidade = input.nextInt();

        int[] array = new int[quantidade];

        for(int i  = 0; i < quantidade; i++){
            System.out.println("Digite o " + (i+1) + " Número" );
            array[i] = input.nextInt();
        }
        System.out.println("A ordem inversa é: ");
        for(int z = (array.length-1); z >= 0; z--){
            System.out.println(array[z]);   
        }
        input.close();
    }
}