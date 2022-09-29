import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        float horasTrabMes, numeroDependentes, valorSalario, salarioDependentes, salarioBruto, descontoINSS,
                descontoIDR, descontosIntegrados, salarioLiquido;

        // NOME
        System.out.println("Qual o nome do funcionario?");
        nome = input.next();

        // HORAS TRABALHADAS
        System.out.println("Quantas hora mensais foram trabalhadas?");
        horasTrabMes = input.nextFloat();

        // DEPENDENTES
        System.out.println("Quantos dependentes?");
        numeroDependentes = input.nextFloat();

        // VALOR SALARIO
        valorSalario = horasTrabMes * 10;

        // SALARIO DEPENDENTES
        salarioDependentes = numeroDependentes * 60;

        // SALARIO BRUTO
        salarioBruto = valorSalario + salarioDependentes;

        // DESCONTOS
        descontoINSS = salarioBruto * 0.085f;
        descontoIDR = salarioBruto * 0.05f;
        descontosIntegrados = descontoIDR + descontoINSS;

        // SALARIO LIQUIDO
        salarioLiquido = salarioBruto - descontosIntegrados;

        // FIM
        System.out.println("NOME " + nome);
        System.out.println("SALARIO BRUTO: " + salarioBruto);
        System.out.println("SALARIO LIQUIDO " + salarioLiquido);

        input.close();

    }
}
