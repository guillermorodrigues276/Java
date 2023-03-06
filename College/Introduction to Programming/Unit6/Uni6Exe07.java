import java.util.*;
public class Uni6Exe07 {
    public Uni6Exe07(){
        Scanner input = new Scanner(System.in);
        int N = 21;

        do{
            System.out.println("Digite um número inteiro menor ou igual a 20: ");
            N = input.nextInt();
        }while (N < 1 || N > 20);

        
        int array[] = new int[N];

        ler(array, input);

        ordenar(array);

        imprime(array);

        
        
        input.close(); 
    }

    private void ler(int array[], Scanner input){
        int valor = 0;
        boolean B = false;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um número: ");
            valor = input.nextInt();
            for (int j = 0; j < array.length; j++) {
                if(valor == array[j]){
                    B = true;
                }
            }
            
            if(B){
                System.out.println("Valor já existe no array...");
                i = i - 1;
                B = false;
            }
            else{
                array[i] = valor;
            }
        }
    }

    
    private void imprime(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print("["+ array[i] + "]");
        }
    }

    private void ordenar(int array[]){
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }           
    }
    
    public static void main(String[] args) {
        new Uni6Exe07();
    }
}
