import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numeroInserido, centenas, dezenas, unidade, atual;

        // NUMERO INSERIDO

        numeroInserido = input.nextInt();
        atual = numeroInserido;

        // VARIAVEIS
        
        centenas = atual / 100;
        atual -= centenas * 100;

        dezenas = atual / 10;
        atual -= dezenas * 10;

        unidade = atual / 1;
        atual -= unidade *1;

        // SAIDAS

        System.out.println(numeroInserido);
        System.out.println(centenas + " centena(s)");
        System.out.println(dezenas + " dezena(s)");
        System.out.println(unidade + " unidade(s)");

        input.close();





    }
}
