import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe10 {

    private Uni6Exe10(){
        Scanner input = new Scanner(System.in);

        int tamanhoArray, opcao;

        // ARRAY NÃO PODE SER MENOR QUE 1 E MAIOR QUE 50
        
        do{
            System.out.println("Informe o tamanho do ARRAY [1-50]");
            tamanhoArray = input.nextInt();
        }while(tamanhoArray < 1 || tamanhoArray > 50);
        
        int[][] array = new int[tamanhoArray][9];
        
        System.out.println("Escolha uma opção");
        System.out.println("=================");
        System.out.println("1 -> Incluir valor");
        System.out.println("2 -> Pesquisar valor");
        System.out.println("3 -> Alterar valor");
        System.out.println("4 -> Excluir valor");
        System.out.println("5 -> Mostrar valores");
        System.out.println("6 -> Ordenar valores");
        System.out.println("7 -> Inverter valores");
        System.out.println("8 -> Sair do sistema");

        while(true){
            System.out.println("Qual opção você deseja?");
            int opt = input.nextInt();
            System.out.println();

            switch(opt){
                case 1:
                    incluirValor(array, input);
                break;
                case 2:
                    pesquisaValor(array, input);
                break;
                case 3:

                break;
                case 4:

                break;
                case 5:

                break;
                case 6:
                    ordenarValor(array);
                break;

                case 7:

                break;

                case 8:
                    break;
                
            }
        }
    }

    private void incluirValor(int array[][], Scanner input){
        int valor = 0;
        boolean B = false;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um número: ");
            valor = input.nextInt();
            for (int j = 0; j < array.length; j++) {
                if(valor == array[j][0]){
                    B = true;
                }
            }
            
            if(B){
                System.out.println("Valor já existe no array...");
                i = i - 1;
                B = false;
            }
            else{
                array[i][0] = valor;
            }
        }
    }

    private void pesquisaValor(int array[][], Scanner input){
        
    }

    private void alterarValor(){

    }

    private void excluirValor(){

    }

    private void mostrarValor(){

    }

    private void ordenarValor(int array[][]){
        Arrays.sort(array);  
    }

    private void inverterValor(){

    }

    private void sairSistema(){

    }
    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
