/*
!Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, e assim por diante. Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia (a máquina opera 16 horas por dia).
 */

public class Uni5Exe11 {
    public static void main(String[] args) {

        int minuto, hora, biscoito, exponencial;
        hora = 0;
        biscoito = 3;
        minuto = 0;

        for (int i = 60; i < 961; i += 60) {
            for (int b = 1; i < 43046721; b += biscoito * biscoito) {
                biscoito = b;
                System.out.println(biscoito);
            }
            minuto = i;
            hora = minuto / 60;
            System.out.println(hora);
        }

    }
}
