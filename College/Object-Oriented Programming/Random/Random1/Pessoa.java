package Random1;
public class Pessoa {
    
    double altura;
    double peso;
    String nome;

    public double calcularImc(){
        return this.peso / (this.altura * this.altura);
    }
}
