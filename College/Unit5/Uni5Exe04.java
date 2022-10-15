public class Uni5Exe04 {
    public static void main(String[] args) {

        double somaNumerador, somaDenominador, multiplicador, S;

        somaNumerador = 3;
        somaDenominador = 2;
        multiplicador = 2;

        System.out.println("2");
        for (int n = 0; n < 20; n++) {
            somaNumerador += 2;
            multiplicador += 2;
            somaDenominador = multiplicador + somaDenominador;
        }
        S = somaNumerador / somaDenominador;
        System.out.println(S);
    }
}
