public class TesteReferencia {
    public static void main(String[] args) {
        // APENAS UM NEW, OU SEJA, CRIAÇÃO DE APENAS UM OBJETO
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        // PRIMEIRA CONTA É UMA REFERENCIA UMA -> PARA O OBJETO CONTA
        // SEGUNDA CONTA É UMA REFERENCIA UMA -> PARA O OBJETO CONTA

        System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
        
        // PRIMEIRA CONTA = CONTA

        // -CONTA-
        // SALDO: 300
        // AGENCIA: --
        // NUMERO: --
        // TITULAR: ???
        
        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);
        
        // SEGUNDA CONTA -> PRIMEIRA CONTA
        // PRIMEIRA CONTA -> CONTA
        // SEGUNDA CONTA -> CONTA

        segundaConta.saldo += 100;

        // VAI AUMENTAR DAS "DUAS" CONTAS POIS SÃO DUAS REFERENCIAS APONTANDO PRA UM OBJETO
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);
        System.out.println("saldo da primeira conta: " + primeiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("Mesma conta");
        }

        // A REFERENCIA DO OBJETO (CONTA) VAI TER O MESMO ENDEREÇO
        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
