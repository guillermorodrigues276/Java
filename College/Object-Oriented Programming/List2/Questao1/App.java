package List2.Questao1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoa object[] = new Pessoa[3];

        for(int i = 0; i < object.length; i++){
            object[i] = new Pessoa();
            System.out.println("Digite o nome da " + (i + 1) + " pessoa: ");
            object[i].setNome(input.nextLine());
            System.out.println("Digite a altura da " + (i + 1) + " pessoa: ");
            object[i].setAltura(input.nextDouble());
            System.out.println("Digite o peso da " + (i + 1) + " pessoa: ");
            object[i].setPeso(input.nextDouble());

            input.nextLine();
        }

        System.out.println("--- DADOS ---");

        for(int i = 0; i < object.length; i++){
            System.out.println();
            System.out.println("Nome: " + object[i].getNome());
            System.out.println("Altura: " + object[i].getAltura());
            System.out.println("Peso: " + object[i].getPeso());
            System.out.println("IMC: " + object[i].calcularImc());
        }
        input.close();
    }
}
