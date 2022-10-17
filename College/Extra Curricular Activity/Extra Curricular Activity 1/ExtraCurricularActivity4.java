/*
Um supermercado anuncia diariamente uma lista com 5 frutas em
promoção. Escreva um programa que recebe o nome de uma fruta que
você deseja comprar e informa se a fruta pertence à lista de promoções.
Exemplo:
A lista de frutas em promoção é: [banana, maçã, abacaxi, melão,
mamão].
Qual fruta você deseja comprar hoje?
banana
Ótima escolha! Essa fruta está em promoção hoje.

 */

import java.util.Scanner;

public class ExtraCurricularActivity4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String fruta1, fruta2, fruta3, fruta4, fruta5, frutaPromocao;

        frutaPromocao = "";

        fruta1 = "banana";
        fruta2 = "maca";
        fruta3 = "abacaxi";
        fruta4 = "melao";
        fruta5 = "mamao";

        System.out.println("Qual fruta você deseja comprar hoje?");
        frutaPromocao = input.next();

        if (frutaPromocao.equals(fruta1)) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else if (frutaPromocao.equals(fruta2)) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else if (frutaPromocao.equals(fruta3)) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else if (frutaPromocao.equals(fruta4)) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else if (frutaPromocao.equals(fruta5)) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else {
            System.out.println("Que pena, essa fruta não esta na promoção.");
        }

        input.close();
    }
}
