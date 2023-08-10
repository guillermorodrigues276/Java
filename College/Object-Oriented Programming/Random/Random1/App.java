package Random.Random1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoa object[];
        object = new Pessoa[2];

        for(int i = 1; i < 3; i++){
            System.out.println("Digite o nome da " + (i) + " pessoa: ");
            object[i].nome = input.nextLine();
            System.out.println("Digite a altura da " + (i) + " pessoa: ");
            object[i].altura = input.nextDouble();
            System.out.println("Digite o peso da " + (i) + " pessoa: ");
            object[i].peso = input.nextDouble();
        }

        for(int i = 1; i < 3; i++){
            System.out.println("--- DADOS ---");
            System.out.println();
            System.out.println("Nome: " + object[i].nome);
            System.out.println("Altura: " + object[i].altura);
            System.out.println("Peso: " + object[i].peso);
            System.out.println("IMC: " + object[i].calcularImc());
        }


        input.close();
    }
}
