public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDoCenourinha = new Conta();
        System.out.println(contaDoCenourinha.getSaldo());

        contaDoCenourinha.titular = new Cliente();

        System.out.println(contaDoCenourinha.titular); //null
        contaDoCenourinha.titular.nome = "Cenourinha";
        System.out.println(contaDoCenourinha.titular.nome);
        
    }    
}
