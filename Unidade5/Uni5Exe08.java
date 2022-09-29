/*
        ! Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:
        ?  escreva o menor valor negativo;
        ?  escreva a média dos números positivos.
         */

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        double valorMenor, valor, mediaPositivo;

        System.out.println("Escreva a quantidade de numeros que serão inseridos: ");
        n = input.nextInt();

        valorMenor = Double.MIN_VALUE;
        mediaPositivo = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Valor: ");
            valor = input.nextDouble();
            if (valor < valorMenor) {
                valorMenor = valor;
            } else {
            }
            if (valor > 0) {
                mediaPositivo += valor / n;
            } else {
            }
        }
        System.out.println("Menor: " + valorMenor);
        System.out.println("Media: " + mediaPositivo);

        input.close();
    }
}
