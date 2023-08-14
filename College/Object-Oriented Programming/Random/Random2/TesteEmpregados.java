package Random2;

public class TesteEmpregados {
    public static void main(String[] args) {
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();

        int variavel  = 0;

        e1.codigoEmpregado = 1232;
        e1.nome = "Paulo Silva";
        e1.cargo = "Gerente Financeiro";
        e1.salario = 15.400;
        e1.totalEmpregados(variavel++);

        e2.codigoEmpregado = 4567;
        e2.nome = "Ana Paula";
        e2.cargo = "Analista de Sistemas Senior";
        e2.salario = 10.700;
        e2.totalEmpregados(variavel++); 
    }
        
    

    private static void imptimeEmpregados() {
    }
}
