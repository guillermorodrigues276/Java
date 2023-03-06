import java.util.Scanner;

public class Uni6Exe01 {

    private Uni6Exe01(){
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];

        lerValores(input, array);
        escreverInverso(array);

        input.close();
    } 

    private void lerValores(Scanner input, int array[]){
        for (int i = 0; i < array.length; i++){
            System.out.println("Informe o elemento "+(i+1)+" posicao array["+i+"]");
            array[i] = input.nextInt();
        }
    }  

    private void escreverInverso(int array[]){
        for(int i = array.length -1; i >= 0; i--){
            System.out.println("Elemento da posicao["+i+"]:"+array[i]);
        }
    }

    public static void main(String[] args) {
        new  Uni6Exe01();
    } 
}

