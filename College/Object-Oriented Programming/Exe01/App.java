package Exe01;

public class App {
    public static void main(String[] args) {
        Pessoa object1 = new Pessoa();

        object1.altura = 1.75;
        object1.peso = 78;

        System.out.println(object1.calcularImc());
    }
}
