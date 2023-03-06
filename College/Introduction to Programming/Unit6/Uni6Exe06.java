import java.util.Scanner;

public class Uni6Exe06 {

    private Uni6Exe06(){

        Scanner input = new Scanner(System.in);

        int tamanhoarray = 0;

        System.out.println("Indique a quantidade de espaço que o vetor terá: ");
        tamanhoarray = input.nextInt();

        double[] array1 = new double[tamanhoarray];
        double[] array2 = new double[tamanhoarray];

        lerValorVetor(array1, array2, tamanhoarray, input);
        

        input.close();
    }

    private void lerValorVetor(double array1[],double array2[], int tamanhoarray, Scanner input){

        for(int i = 0; i < array1.length; i++){
            System.out.println("Posição"+"["+(i+1)+"]");
            double valor = input.nextDouble();
            array1[i] = valor;
        }
        for(int i = 0; i < array2.length; i++){
            System.out.println("Posição"+"["+(i+1)+"]");
            double valor = input.nextDouble();
            array2[i] = valor;
        }
        for(double d : array1){
            for(double e : array2){
                retornarMesmoValor(d,e);
            }
        }
    }

    private void retornarMesmoValor(double valor1, double valor2){
        if(valor1 == valor2){
            System.out.println("Este valor existe em ambas as listas: " + valor2);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe06();
    }
}
