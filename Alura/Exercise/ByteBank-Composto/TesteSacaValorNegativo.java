public class TesteSacaValorNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(100);
        System.out.println(conta.sacar(200));
        System.out.println(conta.getSaldo());

        // INFORMA ERRO POIS O SALDO ESTA PRIVADO, ENCAPSULADO EM OUTRO MÉTODO, FAZENDO COM QUE NÃO POSSA SER ACESSADO.

        conta.saldo += 1000;
        System.out.println(conta.saldo);
    }
}
