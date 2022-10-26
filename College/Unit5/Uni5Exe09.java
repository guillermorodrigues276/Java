import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String alunoNome, alunoIdade18;
        int alunoIdade, alunoQtdMaior20, alunoQtd;

        alunoIdade18 = "Aluno c 18 anos: ";
        System.out.println();
        alunoQtdMaior20 = 0;

        System.out.println("Informe a qtd. alunos: ");
        alunoQtd = input.nextInt();

        for (int alunoAtual = 1; alunoAtual <= alunoQtd; alunoAtual++) {
            System.out.println("Informe o nome: ");
            alunoNome = input.next();
            System.out.println("Informe a idade: ");
            alunoIdade = input.nextInt();

            if (alunoIdade == 18) {
                alunoIdade18 = alunoIdade18 + alunoNome;
                System.out.println();
            }
            if (alunoIdade > 20) {
                alunoQtdMaior20++;
            }
        }
        System.out.println(alunoIdade18);
        System.out.println("Qtd. alunos maior que 20 anos: " + alunoQtdMaior20);

        input.close();
    }
}
