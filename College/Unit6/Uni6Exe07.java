import java.util.*;
public class Uni6Exe07 {
    public Uni6Exe07(){
        Scanner input = new Scanner(System.in);
        int N = 21;

        do{
            System.out.println("Digite um número inteiro menor ou igual a 20: ");
            N = input.nextInt();
        }while (N < 1 || N > 20);

        
        int vetor[] = new int[N];

        ler(vetor, input);

        ordenar(vetor);

        imprime(vetor);

        
        
        input.close(); 
    }

    private void ler(int vetor[], Scanner input){
        int valor = 0;
        boolean B = false;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            valor = input.nextInt();
            for (int j = 0; j < vetor.length; j++) {
                if(valor == vetor[j]){
                    B = true;
                }
            }
            
            if(B){
                System.out.println("Valor já existe no vetor...");
                i = i - 1;
                B = false;
            }
            else{
                vetor[i] = valor;
            }
        }
    }

    private void ordenar(int vetor[]){
        Arrays.sort(vetor);            
    }

    private void imprime(int vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("["+ vetor[i] + "]");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }
}
