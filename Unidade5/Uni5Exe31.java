import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int valor, i;

        System.out.println("Digite um valor: ");
        valor = input.nextInt();

        i = 0;


        System.out.println("| número    | decomposição    |");
                System.out.println("| ------    | -----------  | ");
        while(valor > 1){
            for(i = 2; i <= valor; i++){
                if(valor % i == 0){
                    System.out.println("| " + valor + "       |     " + i + "       |");
                    valor = valor / i;
                    break;
                    
                }
            }
        }
        System.out.println("| " + "1" + "      |     " + "       |");
        input.close();

    }
}
