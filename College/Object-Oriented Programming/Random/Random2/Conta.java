package Random2;

public class Conta {
    private int numeroConta;
    private double saldo;
    private String titular;

    
    public Conta(int numeroConta, String titular) {
            this.numeroConta = numeroConta;
            this.titular = titular;
            this.saldo = 0.0;
    }
    
    public void depositar(double saldo) {
        if(saldo <= 0){
            throw new IllegalArgumentException("Não foi possivel depositar.");
        }else{
            this.saldo = this.saldo + saldo;
            System.out.println("Depósito de R$" + this.saldo + " feito com sucesso!");
        }
    }

    public void sacar(double saldo) {
        if(saldo <= 0){
            throw new IllegalArgumentException("Não foi possivel sacar.");
        }else{
            this.saldo = this.saldo - saldo;
            System.out.println("Saque de R$" + this.saldo + " bem sucedido!");
        }
    }

    public void mostrarDados() {
        System.out.println("-----------------------------");
        System.out.println("Titular: " + getTitular());
        System.out.println("ID da Conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("-----------------------------");

    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double retornarSaldo(){
        return getSaldo();
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
}
