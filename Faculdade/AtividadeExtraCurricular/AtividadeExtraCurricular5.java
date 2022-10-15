// Altere o programa anterior para, ao invés de receber apenas o nome de uma fruta para compra,
// receber uma lista de frutas. Compare a lista de compras com a lista da promoção e calcule o
// desconto cumulativo de 5% para cada fruta correspondente. Ao final, informe qual será o
// desconto total (por exemplo, 3 itens correspondentes, resulta num desconto de 15%). Exemplo:
// A lista de frutas em promoção é: [banana, maçã, abacaxi, melão, mamão].
// Qual a sua lista de compras para hoje?
// mamão
// uva
// abacate
// melancia
// Você tem direito a um desconto de 5%. O mamão está em promoção 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AtividadeExtraCurricular5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // !VARIAVEL*/
        String fruta;
        int quantidadeDeFrutas, desconto;

        // !INICALIZAÇÃO VARIAVEL*/
        quantidadeDeFrutas = 0;
        fruta = "";
        desconto = 0;

        // !PERGUNTAS*/
        System.out.println("Quantas frutas serão compradas?");
        System.out.println("Digite 0 se não quiser nenhuma: ");
        quantidadeDeFrutas = input.nextInt();

        // !ARRAY*/
        // !LISTA*/
        String[] listaArray = {
                "banana",
                "maca",
                "abacaxi",
                "melao",
                "mamao"
        };

        // !ARRAY GUARDANDO AS FRUTAS QUE SAO VERDADEIRAS */
        List<String> testList = new ArrayList<String>();

        // !QUANTIDADE DE FRUTAS QUE SERAO COMPRADAS */
        for (int lista = 0; lista < quantidadeDeFrutas; lista++) {
            System.out.println("Escreva o nome das frutas: ");
            fruta = input.next();

            // ! SE QUANTIDADE DE FRUTAS FOR == 0 ACABA A SENTENÇA */
            if (quantidadeDeFrutas == 0) {
                break;
            }

            // ! SE FRUTA == LISTA DE DENTRO DO PRIMEIRO ARRAY */
            boolean contem = Arrays.stream(listaArray).anyMatch(fruta::equals);

            // ! SE FOR TRUE, ADICIONA O DESCONTO DE 5%, ADICIONANDO A VARIAVEL (FRUTA) AO
            // SEGUNDO ARRAY DE (FRUTAS VERDADEIRAS) */
            if (contem == true) {
                desconto += 5;
                testList.add(fruta);
                System.out.println("DESCONTO 5");
            }

        }
        // ! IMPRIME O QUE O EXERCICIO PEDIA */
        System.out.println("Você tem direito a um desconto de " + desconto + "% " + testList);

        input.close();
    }
}
