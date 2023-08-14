package Random1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoa object[] = new Pessoa[3];

        for(int i = 0; i < object.length; i++){
            object[i] = new Pessoa();
            System.out.println("Digite o nome da " + (i + 1) + " pessoa: ");
            object[i].nome = input.nextLine();
            System.out.println("Digite a altura da " + (i + 1) + " pessoa: ");
            object[i].altura = input.nextDouble();
            System.out.println("Digite o peso da " + (i + 1) + " pessoa: ");
            object[i].peso = input.nextDouble();
            input.nextLine();
        }

        System.out.println("--- DADOS ---");

        for(int i = 0; i < object.length; i++){
            System.out.println();
            System.out.println("Nome: " + object[i].nome);
            System.out.println("Altura: " + object[i].altura);
            System.out.println("Peso: " + object[i].peso);
            System.out.println("IMC: " + object[i].calcularImc());
        }


        input.close();
    }
}
