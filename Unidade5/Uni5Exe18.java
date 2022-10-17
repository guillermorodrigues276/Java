import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalCasas;

        //a9iwhdnaiwd

        int[] totalCasasCanal = new int[4];
        int[] totalCanais = new int[4];
        totalCanais[0] = 4;
        totalCanais[1] = 5;
        totalCanais[2] = 7;
        totalCanais[3] = 12;

        double porcentagem;

        int i = 0;
        while (i <= 3) {
            totalCasasCanal[i] = input.nextInt();
            i++;
        }
        totalCasas = totalCasasCanal[0] + totalCasasCanal[1] + totalCasasCanal[2] + totalCasasCanal[3];
        i = 0;
        System.out.println("Total casas =" + totalCasas);

        while (i <= 3) {
            porcentagem = (100 / totalCasas);

            double valor = porcentagem * totalCasasCanal[i];
            System.out.println("Porcentagem casas canal" + totalCanais[i] + "=" + valor);
            i++;
        }

        input.close();
    }
}
