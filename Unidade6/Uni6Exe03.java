import java.util.Scanner;

public class Uni6Exe03 {

    public Uni6Exe03(){

        double[] array = lerArray();

        double[] ajustarArray = ajusteArray(array);
        System.out.println(ajustarArray);

        valorAtualizado(array);
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

    private double[] ajusteArray(double[] array){

        double[] newArray = new double[12];
        double[] restoArray = new double[12];

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                restoArray[i] =  array[i] * 0.05;
                newArray[i] = restoArray[i] + array[i];
                array[i] = newArray[i];
            }else{
                restoArray[i] =  array[i] * 0.02;
                newArray[i] = restoArray[i] + array[i];
                array[i] = newArray[i];
            }
        }

        return array;
    }

    private void valorAtualizado(double[] newArray){
        for(int i = 0; i < newArray.length; i++){
            System.out.println("[" + (i + 1) + "]" + newArray[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe03();
    }
}