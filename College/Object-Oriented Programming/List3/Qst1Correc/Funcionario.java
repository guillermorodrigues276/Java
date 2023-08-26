/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List3.Qst1Correc;

/**
 * Representa um funcionário
 * 
 * @author Robson Walter de Souza
 */
public class Funcionario {
    private String nome;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    /**
     * Método que realiza o calculo do imposto de renda a pagar do
     * funcionário, levando em consideração o salario do funcionário
     * e a tabela a seguir:
     * 
     * <table border="1">
     * <tr>
     * <th>Faixa</th>
     * <th>Faixa de Salário</th>
     * <th>Alíquota</th>
     * </tr>
     * 
     * <tr>
     * <td>1ª Faixa</td>
     * <td>Até R$ 1.903,98</td>
     * <td>Isento</td>
     * </tr>
     * <tr>
     * <td>2ª Faixa</td>
     * <td>De R$ 1.903,99 à R$ 2.826,65</td>
     * <td>7,5%</td>
     * </tr>
     * <tr>
     * <td>3ª Faixa</td>
     * <td>De R$ 2.826,66 à R$ 3.751,05</td>
     * <td>15,0%</td>
     * </tr>
     * <tr>
     * <td>4ª Faixa</td>
     * <td>De R$ 3.751,06 à R$ 4.664,68</td>
     * <td>22,5%</td>
     * </tr>
     * <tr>
     * <td>5ª Faixa</td>
     * <td>A partir de R$ 4.664,69</td>
     * <td>27,5%</td>
     * </tr>
     * </table>
     * 
     * @return Valor do imposto de renda do funcionário
     */
    public double calcularIrpf() {
        double imposto = 0, diferenca = 0;

        if (getSalario() > 1903.98) {

            if (getSalario() <= 2826.65) {// 2ª faixa
                diferenca = getSalario() - 1903.98;
                imposto = diferenca * (7.5 / 100);
            } else if (getSalario() <= 3751.05) {// 3ª faixa
                // 2ª faixa
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5 / 100);
                // 3ª faixa
                diferenca = getSalario() - 2826.65;
                imposto += (diferenca * (15.0 / 100));
            } else if (getSalario() <= 4664.68) { // 4ª Faixa
                // 2ª faixa
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5 / 100);
                // 3ª faixa
                diferenca = 3751.05 - 2826.65;
                imposto += (diferenca * (15.0 / 100));
                // 4ª faixa
                diferenca = getSalario() - 3751.05;
                imposto += (diferenca * (22.5 / 100));

            } else {
                // 2ª faixa
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5 / 100);
                // 3ª faixa
                diferenca = 3751.05 - 2826.65;
                imposto += (diferenca * (15.0 / 100));
                // 4ª faixa
                diferenca = 4664.68 - 3751.05;
                imposto += (diferenca * (22.5 / 100));

                // 5ª5 faixa
                diferenca = getSalario() - 4664.68;
                imposto += (diferenca * (27.5 / 100));
            }

        }

        return imposto;
    }
}
