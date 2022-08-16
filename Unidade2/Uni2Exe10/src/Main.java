import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int entradaSegundos = input.nextInt();
        int horas = entradaSegundos/3600;
        entradaSegundos -= horas * 3600;
        int minutos = entradaSegundos/60;
        entradaSegundos -= minutos * 60;
        int segundos = entradaSegundos;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        input.close();
        
        
    }
}
