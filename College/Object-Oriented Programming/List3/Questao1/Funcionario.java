package List3.Questao1;

public class Funcionario {
    private String nome;
    private double salario;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIrpf(double valorSalario){
        double valorImposto = 0;
        double diferenca = 0;

        if(valorSalario <= 1903.98){
            System.out.println("O funcionario é isento.");
        }
        else if(valorSalario >= 1903.99 && valorSalario <= 2826.65){
            diferenca = valorSalario - 1903.98;
            valorImposto = (diferenca * 0.075);

            System.out.println("Diferença " + diferenca);
            System.out.println("O salario é de: " + valorSalario);
            System.out.println("O Valor do imposto é: " + valorImposto);
            
            return valorImposto;
        }
        else if(valorSalario >= 2826.66 && valorSalario <= 3751.05){
            diferenca = valorSalario - 2826.65;
            valorImposto = (diferenca * 0.15);

            System.out.println( "Diferença " + diferenca);
            System.out.println("O salario é de: " + valorSalario);
            System.out.println("O Valor do imposto é: " + valorImposto);
            
            return valorImposto;
        }
        else if(valorSalario >= 3751.06 && valorSalario <= 4664.68){
            diferenca = valorSalario - 3751.05;
            valorImposto = (diferenca * 0.225);

            System.out.println("Diferença " + diferenca);
            System.out.println("O salario é de: " + valorSalario);
            System.out.println("O Valor do imposto é: " + valorImposto);
            
            return valorImposto;
        }
        else if(valorSalario >= 4664.69){
            diferenca = valorSalario - 4664.68;
            valorImposto = (diferenca * 0.275);

            System.out.println("Diferença " + diferenca);
            System.out.println("O salario é de: " + valorSalario);
            System.out.println("O Valor do imposto é: " + valorImposto);
        
            return valorImposto;
        }
        
        return valorSalario;
    }
}
