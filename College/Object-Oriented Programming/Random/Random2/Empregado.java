package Random2;

import java.util.Scanner;

public class Empregado {
    public int codigoEmpregado, totalEmpregados;
    public String nome, cargo;
    public double salario;

    public Empregado(){
        Scanner input = new Scanner(System.in);

        // System.out.println("Informe o código do empregado: ");
        // this.codigoEmpregado = input.nextInt();

        // System.out.println("Informe nome e em seguida o cargo: ");
        // this.nome = input.nextLine();
        // this.cargo = input.nextLine();

        // System.out.println("Informe o salário: ");
        // this.salario = input.nextDouble();
    }

    public void imprimeEmpregados(){
        System.out.println("--- DADOS ---");
        System.out.println();
        System.out.println("Código: " + codigoEmpregado);
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    public int totalEmpregados(int numero){

        this.totalEmpregados = numero;

        return totalEmpregados;
    }

}
