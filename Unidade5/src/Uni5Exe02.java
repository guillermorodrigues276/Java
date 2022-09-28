public class Uni5Exe02 {
    public static void main(String[] args) {

        int numeroPar, numeroImpar;
        numeroImpar = 0;
        numeroPar = 0;
        for (int numero = 1; numero < 100; numero++) {
            if (numero % 2 == 0) {
                numeroPar += numero;
            } else {
                numeroImpar += numero;
            }
        }
        System.out.println("Soma par: " + numeroPar);
        System.out.println("Soma impar: " + numeroImpar);
    }
}
