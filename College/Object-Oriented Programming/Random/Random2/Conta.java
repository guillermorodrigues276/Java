package Random2;

public class Conta {
    private String numeroConta;
    private double saldo;

    public void depositar(double saldo){
        if(saldo <= 0){
            throw new IllegalArgumentException("Não foi possivel depositar.");
        }else{
            this.saldo = this.saldo + saldo;
        }
    }

    public void sacar(double saldo){
        if(saldo <= 0){
            throw new IllegalArgumentException("Não foi possivel sacar.");
        }else{
            this.saldo = this.saldo - saldo;
        }
    }

    public double retornarSaldo(){
        return getSaldo();
    }


    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

}
