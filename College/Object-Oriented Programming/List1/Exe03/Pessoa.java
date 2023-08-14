package Exe03;

public class Pessoa {

    double altura;
    double peso;
    
    public double calcularImc(){

        if(this.altura <= 0){
            throw new IllegalArgumentException ("A altura é menor que 0");
        }

        return this.peso / (this.altura * this.altura);
    }
}
