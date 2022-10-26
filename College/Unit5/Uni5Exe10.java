public class Uni5Exe10 {
    public static void main(String[] args) {

        int soma = 0;
        int potencia = 0;
        String termoString1, termoString2;
        int contador = 0;

        for (int termo1 = 0; termo1 <= 10000; termo1++) {
            for (int termo2 = 0; termo2 <= 10000; termo2++) {
                soma = termo1 + termo2;
                potencia = soma * soma;
                termoString1 = potencia + "";
                termoString2 = termo1 + "" + termo2;
                if (termoString1.equals(termoString2)) {
                    contador++;
                    System.out.println(
                            "[" + contador + "] " + termo1 + " + " + termo2 + " = " + soma + " -> " + potencia);
                    if (contador >= 10) {
                        break;
                    }
                }
            }
            if (contador >= 10) {
                break;
            }
        }
        System.out.println("----");
    }

}
