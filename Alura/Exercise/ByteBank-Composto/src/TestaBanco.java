public class TestaBanco {
    public static void main(String[] args) {
        Cliente siLq = new Cliente();

        siLq.nome = "siLq";
        siLq.cpf = "000.000.000-00";
        siLq.profissao = "Estudante";

        Conta contaDosiLq = new Conta();
        contaDosiLq.depositar(100);

        //ASSOCIA O CLIENTE SILQ A CONTA DO SILQ
        contaDosiLq.titular = siLq;
        System.out.println(contaDosiLq.titular.nome);
        System.out.println(contaDosiLq.titular);
        System.out.println(siLq);

    }
}
