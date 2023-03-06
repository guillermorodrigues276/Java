import java.util.Scanner;

public class Uni6Exe04{

    public Uni6Exe04(){
        int[] arrayNumeros1 = new int[10];
        int[] arrayNumeros2 = new int[10];
        int[] somaDoisArray = new int[10];

        lerArray(arrayNumeros1, arrayNumeros2);
        somaArray(arrayNumeros1, arrayNumeros2, somaDoisArray);
        retornoArray(arrayNumeros1, arrayNumeros2, somaDoisArray);

    }
    
    private void lerArray(int[] arrayNumeros1, int[] arrayNumeros2){
        Scanner input = new Scanner(System.in);
    
        for(int i = 0; i < arrayNumeros1.length; i++){
            System.out.println("Informe os números: " + "[" + (i + 1) + "]");
            arrayNumeros1[i] = input.nextInt();
        }
        for(int i = 0; i < arrayNumeros2.length; i++){
            System.out.println("Informe os números: " + "[" + (i + 1) + "]");
            arrayNumeros2[i] = input.nextInt();
        }
        input.close();
    }

    private void somaArray(int[] arrayNumeros1, int[] arrayNumeros2,int[] somaDoisArray){   
        for(int i = 0; i < somaDoisArray.length; i++){
            somaDoisArray[i] = (arrayNumeros1[i] + arrayNumeros2[i]);
        }
    }

    private void retornoArray(int[] arrayNumeros1, int[] arrayNumeros2,int[] somaDoisArray){
        for(int i = 0; i < somaDoisArray.length; i++){
            System.out.print("|" + arrayNumeros1[i] + "|");
        }
        System.out.println();
        for(int i = 0; i < somaDoisArray.length; i++){
            System.out.print("|" + arrayNumeros2[i] + "|");
        }
        System.out.println();
        for(int i = 0; i < somaDoisArray.length; i++){
            System.out.print("|" + somaDoisArray[i] + "|");
        }
    }
    
    public static void main(String[] args) {
        new Uni6Exe04();
    }
}