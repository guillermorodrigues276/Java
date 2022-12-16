public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        Conta conta2 = new Conta(1337, 12973);
        Conta conta3 = new Conta(1123, 87923);

        // Conta está inconsistente
        // conta.setAgencia(-50);
        // conta.setNumero(-330);

        System.out.println("Total de contas: " + Conta.getTotal());
        System.out.println(conta.getAgencia());
    }
}
