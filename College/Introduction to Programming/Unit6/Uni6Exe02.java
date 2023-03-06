import java.util.Scanner;

public class Uni6Exe02 {

    
    public Uni6Exe02() {
        
        double[] array = lerArray();

        double media = calcularMedia(array);
        System.out.println("Média: " + media);

        imprimeValorMaioresQueMedia(array, media);

    }

    private double[] lerArray(){

        Scanner input = new Scanner(System.in);
        
        double[] numeros = new double[12];

        
        for(int i = 0; i < numeros.length; i++){
            
            System.out.println("Informe os números: " + "[" + (i + 1) + "]");
            
            numeros[i] = input.nextDouble();
        }
        input.close();

        return numeros;
    }

    private double calcularMedia(double[] array){
        double soma = 0;
        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }
        double media = soma / 12;
        return media;
    }

    private void imprimeValorMaioresQueMedia(double[] numeros, double media){
        for(int i = 0; i <= 12; i++){
            if(numeros[i] > media){
                System.out.println(numeros[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        new Uni6Exe02();
    }
}