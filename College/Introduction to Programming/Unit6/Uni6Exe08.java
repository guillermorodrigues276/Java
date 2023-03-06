import java.util.Scanner;

public class Uni6Exe08 {

    private Uni6Exe08(){
        Scanner input = new Scanner(System.in);

        int tamanhoArray;

        do{
            System.out.println("Informe o tamanho do array [ 1 - 20 ]");
            tamanhoArray = input.nextInt();
        }while(tamanhoArray < 1 || tamanhoArray > 20);

        double[] array = new double[tamanhoArray];

        ler(input, array);
        imprimir(array);

        input.close();
    }

    private void ler(Scanner input, double array[]){

        for(int i = 0; i < array.length; i++){
            System.out.println("Insira um valor: [" + i + "]");
            array[i] = input.nextInt();
        }
    }

    private void imprimir(double array[]){
        boolean bool = false;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if ((array[i] == array[j]) && (i < j)) {
                    count += 1;
                    bool = true;
                }
            }
            if (bool) {
                System.out.print(array[i] + "   ");
                System.out.println("   qtd: " + count);
                bool = false;
            }
        }
    }
    public static void main(String[] args) {
        new Uni6Exe08();
    }
}
