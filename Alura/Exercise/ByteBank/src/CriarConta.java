public class CriarConta {
    public static void main(String[] args) {

        //"OBJETO CONTA RECEBE "Conta nome = new Conta();"
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
        
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("Primeira conta tem " + primeiraConta.saldo);
        System.out.println("Segunda conta tem " + segundaConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("Mesma conta");
        }else{
            System.out.println("Conta diferente");
        }

        // A REFERENCIA DO OBJETO (CONTA) VAI TER ENDEREÇO DIFERENTE, POIS INICIAMOS DOIS NEW, SENDO ASSIM DOIS OBJETOS CRIADOS
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
