public class TesteMetodo {
    public static void main(String[] args) {
        Conta contaDosiLq = new Conta();

        // ATRIBUIÇÃO NORMAL

        contaDosiLq.saldo = 100;

        // ATRIBUIÇÃO COM MÉTODO
        // DENTRO DO PARENTESES COLOCAMOS UM VALOR QUE É INSERIDO NO MÉTODO QUE ESTA NO MÉTODO DEPOSITAR NO ARQUIVO TESTE REFERENCIA
        
        contaDosiLq.depositar(50);

        System.out.println("Saldo: " + contaDosiLq.saldo);
        double valorParaSaque = 20;
        boolean conseguiuSacar = contaDosiLq.sacar(valorParaSaque);
        
        if(conseguiuSacar == true){
            System.out.println("Foi sacado R$" + valorParaSaque);
        }else{
            System.out.println("Impossivel realizar o saque.");
        }
        System.out.println("O saldo atual é: " + contaDosiLq.saldo);
        System.out.println(conseguiuSacar);

        // NOVO OBJETO CONTA, QUE TEM R$1000 DE SALDO
        Conta contaDoWombo = new Conta();
        contaDoWombo.depositar(1000);

        // VALOR TRANSFERIR R$300 -> ContaDoSilq
        // SE ENTRAR NO IF, QUER DIZER QUE A TRANSFERENCIA FOI REALIZADA, SE NÃO INFORMA MENSAGEM DE ERRO
        
        boolean sucessoTransferencia = contaDoWombo.trasferir(300, contaDosiLq);

        if(sucessoTransferencia){
            System.out.println("Transferência realizada com sucesso.");
            System.out.println("Saldo Wombo é: " + contaDoWombo.saldo);
        }else{
            System.out.println("Não foi possivel realizar a tranferência");
        }

        System.out.println("Saldo siLq: " + contaDosiLq.saldo);
    }
}
