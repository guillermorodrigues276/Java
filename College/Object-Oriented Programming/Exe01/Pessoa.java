package Exe01;

public class Pessoa {

    double altura;
    double peso;
    
    public double calcularImc(){
        return this.peso / (this.altura * altura);
    }
}
