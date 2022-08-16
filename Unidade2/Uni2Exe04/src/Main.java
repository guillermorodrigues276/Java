import java.util.Scanner;

public class Main {
    public static void main(String[] args){

     Scanner teclado = new Scanner(System.in);
     
     double nota1 = teclado.nextDouble();
     double nota2 = teclado.nextDouble();
     double MEDIA;
     
     MEDIA = (nota1*3.5+nota2*7.5)/11;
     System.out.printf("MEDIA = %.5/n",MEDIA);

       



        teclado.close();

    }
}
