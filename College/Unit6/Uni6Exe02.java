import java.util.Scanner;

public class Uni6Exe02 {

    //? Construtor
    public Uni6Exe02() {
        
        //? TIPO ARRAY - NOME ARRAY - NOME DO METODO
        double[] array = lerArray();

        //? VARIAVEL MEDIA - METODO MEDIA (ARMAZENAR EM ARRAY)
        double media = calcularMedia(array);
        System.out.println("Média: " + media);

        //? METODO VALOR MAIOR QUE MEDIA (NOME VARIAVEL ARRAY && VARIAVEL MEDIA)
        imprimeValorMaioresQueMedia(array, media);

    }

    //? METODO TIPO DOUBLE[] - NOME DO METODO (lerARRAY)
    private double[] lerArray(){

        //? INICIALIZA A CLASSE SCANNER
        Scanner input = new Scanner(System.in);
        //? CRIA O ARRAY
        double[] numeros = new double[12];

        //? PARA (i) = 0 && i < TAMANHO ARRAY - ADICIONAR
        for(int i = 0; i < numeros.length; i++){
            //? MENSAGEM PARA INFORMAR OS NUMEROS  AO INVÉS DE APARECER 0-12 APARECE 1-12
            System.out.println("Informe os números: " + "[" + (i + 1) + "]");
            //? LER O ARRAY (NUMEROS) AO DECORRER DA CONTAGEM DO INDICE
            numeros[i] = input.nextDouble();
        }
        input.close();

        //? RETORNA O ARRAY NUMEROS LÁ NO MÉTODO CONTRUTOR
        return numeros;
    }

    //? MÉTODO (CALCULAR MEDIA) INDICANDO (ARRAY DOUBLE[])
    private double calcularMedia(double[] array){
        //? VARIAVEL SOMA
        double soma = 0;
        //? PARA I = 0 && I < TAMANHO ARRAY ADICIONAR
        for(int i = 0; i < array.length; i++){
            //? SOMA ADICIONA O NUMERO ANTERIOR MAIS O PROXIMO DO ARRAY SEGUINDO A ORDEM DO INDICE
            soma += array[i];
        }
        //? FORA DO (FOR) A VARIAVEL MEDIA
        double media = soma / 12;

        //? RETORNA MEDIA
        return media;
    }

    //? METODO imprimeValorMaioresQueMedia - TRAZENDO O (ARRAY DOUBLE[] NUMEROS) E A VARIAVEL MEDIA
    private void imprimeValorMaioresQueMedia(double[] numeros, double media){
        //? PARA I = 0 && I < 12(TAMANHO ARRAY) ADICIONAR
        for(int i = 0; i <= 12; i++){
            //? SE NUMERO[INDICE] > MEDIA
            if(numeros[i] > media){
                //? ESCREVER OS NUMEROS MAIORES QUE A MERIA INSERIDOS NO ARRAY SEGUINDO A ORDEM DO INDICE
                System.out.println(numeros[i]);
            }
        }
    }
    //? METODO PADRÃO INICIANDO O METODO CONTRUTOR
    public static void main(String[] args) {
        new Uni6Exe02();
    }
}