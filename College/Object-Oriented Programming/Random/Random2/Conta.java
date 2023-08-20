package Random2;

import java.util.ArrayList;

public class Conta {
    private int numeroConta;
    private double saldo;
    private String titular;

    
    public Conta(int numeroConta, String titular) {
            this.numeroConta = numeroConta;
            this.titular = titular;
            this.saldo = 0.0;
    }
    
    public void depositar(double saldo){
        if(saldo <= 0){
            throw new IllegalArgumentException("Não foi possivel depositar.");
        }else{
            this.saldo = this.saldo + saldo;
            System.out.println("Depósito feito com sucesso!");
        }
    }

    public void sacar(double saldo){
        if(saldo <= 0){
            throw new IllegalArgumentException("Não foi possivel sacar.");
        }else{
            this.saldo = this.saldo - saldo;
            System.out.println("Saque bem sucedido!");
        }
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