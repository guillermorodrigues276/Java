package List3.Questao1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;

        Funcionario f1 = new Funcionario();

        System.out.println("Informe o nome do funcionario.");
        f1.setNome(input.next());

        System.out.println("Informe o salario do funcionario.");
        f1.setSalario(input.nextDouble());

        f1.calcularIrpf(f1.getSalario());
    }
}
