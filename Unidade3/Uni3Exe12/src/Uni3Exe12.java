import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String nome;
        float numeroHorasTrabalhadas, salarioComDependente, salarioLiquido1, salarioLiquido2, decontoINSS, descontoIDR, calculoSalario, calculoSFamila, numeroDependentes, valorHora, valorDependente;

        nome = input.next();
        numeroHorasTrabalhadas = input.nextFloat();
        numeroDependentes = input.nextFloat();
        valorHora = 10f;
        valorDependente = 60f;

        calculoSalario = (numeroHorasTrabalhadas*valorHora);
        calculoSFamila = numeroDependentes*valorDependente;

        salarioComDependente = calculoSalario+calculoSFamila;


        decontoINSS = calculoSalario/0.085f;
        descontoIDR = calculoSalario/0.05f;

        salarioLiquido1 = salarioComDependente+-decontoINSS+-descontoIDR;

        salarioLiquido2 = calculoSalario-salarioLiquido1;



        System.out.println("NOME:"+ nome);
        System.out.println("SALARIO BRUTO: "+calculoSalario);
        System.out.println("SALARIO LOQUIDO: " + salarioLiquido2);




        
        input.close();
    }
}
