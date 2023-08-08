package Exe02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoa object2 = new Pessoa();

        System.out.println("Informe a altura: ");
        object2.altura = input.nextDouble();

        System.out.println("Informe o peso: ");
        object2.peso = input.nextDouble();

        System.out.println(object2.calcularImc());

        input.close();
    }
}
