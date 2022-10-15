import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            double limiteDePesoDiario = input.nextDouble();
            double pesoDoPeixe = input.nextDouble();
            pesoDoPeixe = pesoDoPeixe / 100;

            if (pesoDoPeixe > limiteDePesoDiario) {
                System.out.println("Peso Excedido");
            }
            System.out.println("Deseja continuar");
            String result = input.next();
            if (result.equals("N")) {
                continuar = false;
            }
        }
        input.close();
    }
}