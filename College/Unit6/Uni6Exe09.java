import java.util.Scanner;

public class Uni6Exe09 {

    private Uni6Exe09(){
        Scanner input = new Scanner(System.in);

        //! 0 = GENERO
        //! 1 = NOTA
        //! 2 = IDADE

        // ARRAY COM DIMENSÃO DE UMA COLUNA DE 30  POR 3 LINHAS

        int array[][] = new int [30][3];
        ler(input, array);

        int mediaGeral = media(array);
        int mediaHomens = mediaHomens(array);
        int notaJovem = jovem(array);
        int qtdNotas = old(array, mediaGeral, input);

        System.out.println("Media das notas: " + mediaGeral);
        System.out.println("Media dos homens: " + mediaHomens);
        System.out.println("Nota da mulher mais jovem: " + notaJovem);
        System.out.println("Quantiadde de mulheres com mais de 50 anos: " + qtdNotas);
        
        input.close();
    }

    private int old(int array[][], int mediaGeral, Scanner input){
        int soma = 0;

        for(int i = 0; i < array.length; i++){
            // SE COLUNA POSIÇÃO 1 LINHA 0 (GENERO) FOR IGUAL A 1 É FEMININO
            if(array[i][0] == 1){
                // LINHA 2 (IDADE)
                if(array[i][2] > 50){
                    if(array[i][1] > mediaGeral){
                        soma += 1;
                    }
                } 
            }
        }
        return soma;
    }

    private void ler(Scanner input, int array[][]){
        for (int i = 0; i < array.length; i++){
            System.out.println("Informe o gênero: ");
            array[i][0] = input.nextInt();
            
            System.out.println("Informe a nota: ");
            array[i][1] = input.nextInt();
            
            System.out.println("Informe a idade: ");
            array[i][2] = input.nextInt();
        }
    }

    private int media(int array[][]){
        int soma = 0;
        for(int i = 0; i < array.length; i++){
            soma += array[i][1];
        }
        return soma / array.length;
    }

    private int mediaHomens(int array[][]){
        int soma = 0;
        int qtdHomens = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i][0] == 2){ // 2 HOMEM
                qtdHomens += 1;
                soma += array[i][1];
            }
        }
        return soma/qtdHomens;
    }

    private int jovem(int array[][]){
        int maisJovem = Integer.MAX_VALUE;
        int nota = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i][0] == 1){ // MULHER
                if(array[i][2] < maisJovem){
                    maisJovem = array[i][2];
                    nota = array[i][1];
                }
            }
        }
        return nota;
    }

    public static void main(String[] args) {
        new Uni6Exe09();
    }
}
