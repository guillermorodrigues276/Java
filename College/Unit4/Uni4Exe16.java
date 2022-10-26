import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idadeH1, idadeH2, idadeM1, idadeM2, produtosIdade, somaIdadeHvelhoMulherNova;
        int idadeHVelho, idadeHNovo, idadeMVelha, idadeMNova;

        System.out.println("Digite a idade do primeiro homem.");
        idadeH1 = input.nextInt();

        System.out.println("Digite a idade do segundo homem.");
        idadeH2 = input.nextInt();

        System.out.println("Digite a idade da primeira mulher");
        idadeM1 = input.nextInt();

        System.out.println("Digite a idade da segunda mulher");
        idadeM2 = input.nextInt();

        if (idadeH1 > idadeH2) {
            idadeHVelho = idadeH1;
            idadeHNovo = idadeH2;
        } else {
            idadeHVelho = idadeH2;
            idadeHNovo = idadeH1;
        }
        if (idadeM1 > idadeM2) {
            idadeMVelha = idadeM1;
            idadeMNova = idadeM2;
        } else {
            idadeMVelha = idadeM2;
            idadeMNova = idadeM1;
        }
        somaIdadeHvelhoMulherNova = idadeHVelho + idadeMNova;
        produtosIdade = idadeHNovo * idadeMVelha;

        System.out.println();
        System.out
                .println("A soma da idade do homem mais velho com a mulher mais nova é: " + somaIdadeHvelhoMulherNova);

        System.out.println();
        System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + produtosIdade);

        input.close();
    }
}
