import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args){

     Scanner input = new Scanner(System.in);
     
     double nota1 = input.nextDouble();
     double nota2 = input.nextDouble();
     double nota3 = input.nextDouble();
     double MEDIA;
     
     MEDIA = (nota1*5+nota2*3+nota3*2)/3;
     System.out.printf("A média é " + MEDIA);

        input.close();

    }
}
