import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int qntParadas;
        double limiteTanque, odometroParada, litrosGastos, kmPorLitro, kmPercorrido, litrosUltilizados, kmMedio;

        System.out.println("Digite a quantidade de paradas: ");
        qntParadas = input.nextInt();
        System.out.println("Digite o limite do tanque de gasolina");
        limiteTanque = input.nextDouble();

        kmPercorrido = 0.0;
        litrosUltilizados = 0.0;

        for (int i = 1; i <= qntParadas; i++) {
            System.out.println("Qual número estava no odometro em km na parada: " + i);
            odometroParada = input.nextDouble();
            System.out.println("Quantos litros de gasolina foram gastos até a parada: " + i);
            litrosGastos = input.nextDouble();
            kmPorLitro = odometroParada / (limiteTanque - litrosGastos);

            System.out.println("A quilometragem por litro da parada " + i + " é de: " + kmPorLitro);

            kmPercorrido += odometroParada;
            litrosUltilizados += litrosGastos;
        }

        kmMedio = kmPercorrido / litrosUltilizados;

        System.out.println("A quilometragem média da viagem foi de: " + kmMedio);

        input.close();

    }
}
