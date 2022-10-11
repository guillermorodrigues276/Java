import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos produtos você quer cadastrar");
        int nmbVezes = input.nextInt();
        String[] nomes = new String[nmbVezes];
        Double[] precoCompra = new Double[nmbVezes];
        Double[] precoVenda = new Double[nmbVezes];
        Double[] porcetagem = new Double[nmbVezes];
        String result = "";
        for (int i = 0; i < nmbVezes; i++) {
            System.out.print("Escreva nome produto (" + i + ") ->");
            nomes[i] = input.next();
            System.out.println();
            System.out.print("Escreva PC produto (" + i + ") ->");
            precoCompra[i] = input.nextDouble();
            System.out.println();
            System.out.print("Escreva PV produto (" + i + ") ->");
            precoVenda[i] = input.nextDouble();
            porcetagem[i] = (precoVenda[i] - precoCompra[i]) / precoCompra[i] * 100;
        }
        result += "lucro é menor do que 10%";
        result += "\n";
        result += "\n";
        for (int i = 0; i < nmbVezes; i++) {
            if (porcetagem[i] < 10) {
                result += " " + nomes[i] + " - Preco Bruto = " + (precoVenda[i] - precoCompra[i]) + "\n";
            }

        }
        result += "lucro é maior do que 10% e menor do que 20%";
        result += "\n";
        result += "\n";
        for (int i = 0; i < nmbVezes; i++) {

            if (porcetagem[i] > 10 && porcetagem[i] < 20) {
                result += " " + nomes[i] + " - Preco Bruto = " + (precoVenda[i] - precoCompra[i]) + "\n";
            }

        }
        result += "lucro é maior do que 20%";
        result += "\n";
        result += "\n";
        for (int i = 0; i < nmbVezes; i++) {
            if (porcetagem[i] > 20) {
                result += " " + nomes[i] + " - Preco Bruto = " + (precoVenda[i] - precoCompra[i]) + "\n";
            }

        }
        System.out.println(result);
        input.close();
    }
}