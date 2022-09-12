import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horaChegada, minChegada, horaPartida, minPartida, minChegadaPartida, minPartidaChegada, minutos, horas, minutosRestantes;
        double preco;

        System.out.println("Entre com o horário de chegada, Horas em seguida minutos: ");
        horaChegada = input.nextInt();
        minChegada = input.nextInt();

        System.out.println("Entre com o horário de partida, Horas em seguida minutos: ");
        horaPartida = input.nextInt();
        minPartida = input.nextInt();

        minChegadaPartida = (horaChegada * 60) + minChegada;
        minPartidaChegada = (horaPartida * 60) + minPartida;

        minutos = minPartidaChegada - minChegadaPartida;

        if (minutos < 30) {
            minutos = 30;
        }

        horas = minutos / 60;
        minutosRestantes = minutos % 60;

        if (minutosRestantes > 0) {
            horas++;
        }

        if (horas > 24) {
            horas = 24;
        }

        preco = 0;

        if (horas <= 2) {
            preco = horas * 5;
        } else if (horas <= 4) {
            preco = (horas - 2) * 7.5 + 10;
        } else {
            preco = 10 + (horas - 4) * 10;
        }

        System.out.println("O preço a ser pago é: " + preco);
        input.close();
    }
}