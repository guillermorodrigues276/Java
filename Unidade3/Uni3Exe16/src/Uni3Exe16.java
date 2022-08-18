import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int centena, dezena, unidade, pagamentoCompra, atual;
        

        // VARIAVEIS

        centena = 100;
        dezena = 10;
        unidade = 1;

        // VALOR PAGO

        System.out.println("Valor do pagamento?");
        pagamentoCompra = input.nextInt();
        atual = pagamentoCompra;

        // RADICIAÇÃO

        centena = atual / 100;
        atual -= centena * 100;

        dezena = atual / 10;
        atual -= dezena * 10;

        unidade = atual / 1;
        atual -= unidade *1;

        // SAIDAS

        System.out.println(pagamentoCompra);
        System.out.println(centena + " centena(s)");
        System.out.println(dezena + " dezena(s)");
        System.out.println(unidade + " unidade(s)");


    
        input.close();
    }
}
