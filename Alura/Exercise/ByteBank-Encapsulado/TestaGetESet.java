public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        // conta.numero = 1337; // invocar .numero não funciona (PRIVATE)
        // conta.setNumero(1337);   // nem o setter pois ja está setado no contrutor
        System.out.println("Conta: " + conta.getNumero());

        Cliente siLq = new Cliente();
        // conta.titular = siLq;

        // Set no nome do CLIENTE
        siLq.setNome("siLq");
        // Set no titular que recebe o objeto Cliente
        conta.setTitular(siLq);

        // Escrita do titular com Getters
        System.out.println(conta.getTitular().getNome());

        // percorre Conta -> Titular -> Cliente -> Profissaão
        conta.getTitular().setProfissao("Programador");

    }
}
