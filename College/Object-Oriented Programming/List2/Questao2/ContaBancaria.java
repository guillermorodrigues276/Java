package List2.Questao2;

public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor <= 0 ){
            throw new IllegalArgumentException("Valor inválido.");
        }else{
            this.saldo = this.saldo + valor;
        }
    }

    public void sacar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O valor deve ser maior que 0.");
        }else{
            this.saldo = this.saldo - valor;
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor){
        if(valor <= this.saldo){
            sacar(valor);
            contaDestino.depositar(valor);
        }else if(valor > this.saldo){
            throw new IllegalArgumentException("Transferencia falhou, sem saldo.");
        }
    }
}
