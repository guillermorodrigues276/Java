import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double distancia, tempoGasto, velocidade, quantidadeCombustivel;

        // LEITURAS

        System.out.println("Qual a distância?");
        distancia = input.nextDouble();

        System.out.println("Qual o tempo gasto?");
        tempoGasto = input.nextDouble();

        // CALCULO VELOCIADE

        velocidade = distancia/tempoGasto;

        // QUANTIDADE DE COMBUSTIVEL

        quantidadeCombustivel = distancia/12;

        // FIM

        System.out.println("A velocidade média é: " + velocidade);
        System.out.println("A quantidade de combustivel é: " + quantidadeCombustivel);

        input.close();



        

    }
}
