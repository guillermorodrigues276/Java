package Exe03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoa object1 = new Pessoa();
        Pessoa object2 = new Pessoa();
        Pessoa object3 = new Pessoa();

        System.out.println("Informe o peso a altura da primeira pessoa: ");
        object1.peso = input.nextDouble();
        object1.altura = input.nextDouble();

        System.out.println("Informe o peso e altura da segunda pessoa: ");
        object2.peso = input.nextDouble();
        object2.altura = input.nextDouble();

        System.out.println("Informe o peso e a altura da terceira pessoa: ");
        object3.peso = input.nextDouble();
        object3.altura = input.nextDouble();

        System.out.println(object1.calcularImc());
        System.out.println(object2.calcularImc());
        System.out.println(object3.calcularImc());


        input.close();
    }
}
