package Exe04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pessoa object1 = new Pessoa();
        Pessoa object2 = new Pessoa();
        Pessoa object3 = new Pessoa();

        System.out.println("Informe o nome: ");
        object1.nome = input.next();
        System.out.println("Informe o peso: ");
        object1.peso = input.nextDouble();
        System.out.println("informe a altura: ");
        object1.altura = input.nextDouble();


        System.out.println("Informe o nome: ");
        object2.nome = input.next();
        System.out.println("Informe o peso: ");
        object2.peso = input.nextDouble();
        System.out.println("informe a altura: ");
        object2.altura = input.nextDouble();


        System.out.println("Informe o nome: ");
        object3.nome = input.next();
        System.out.println("Informe o peso: ");
        object3.peso = input.nextDouble();
        System.out.println("informe a altura: ");
        object3.altura = input.nextDouble();

        System.out.println("Pessoa 3");
        System.out.println(object3.nome);
        System.out.println(object3.peso);
        System.out.println(object3.altura);
        System.out.println(object3.calcularImc());

        System.out.println();

        System.out.println("Pessoa 2");
        System.out.println(object2.nome);
        System.out.println(object2.peso);
        System.out.println(object2.altura);
        System.out.println(object2.calcularImc());

        System.out.println();

        System.out.println("Pessoa 1");
        System.out.println(object1.nome);
        System.out.println(object1.peso);
        System.out.println(object1.altura);
        System.out.println(object1.calcularImc());
            
        input.close();
    }
}
