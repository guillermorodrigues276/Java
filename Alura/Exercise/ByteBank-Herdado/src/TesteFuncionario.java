public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Nico");
        funcionario.setCpf("000.000.000-00");
        funcionario.setSalario(2600.00);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());
    }
}
