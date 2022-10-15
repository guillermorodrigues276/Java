import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dia, mes, ano;

        System.out.println("Escreva o dia: ");

        dia = input.nextInt();

        System.out.println("Escreva o mês: ");

        mes = input.nextInt();

        System.out.println("Escreva o ano: ");

        ano = input.nextInt();

        // 4 6 9 11

        if ((dia > 0 && dia < 32) && (mes > 0 && mes < 13) && (ano > 0)) {
            if ((mes == 4 && dia > 30) || (mes == 6 && dia > 30) || (mes == 9 && dia > 30) || (mes == 11 && dia > 30)) {
                System.out.println();
                System.out.println("Data inválida.");
            } else if (mes == 2) {
                if (ano % 4 == 0 && (dia > 0 && dia < 30)) {
                    System.out.println();
                    System.out.println("Data válida, ano bissexto.");
                } else if (dia > 0 && dia < 29) {
                    System.out.println();
                    System.out.println("Data válida");
                } else {
                    System.out.println();
                    System.out.println("Data inválida");
                }
            } else {
                System.out.println();
                System.out.println("Data válida");
            }
        } else {
            System.out.println();
            System.out.println("Data invalida");
        }
        input.close();
    }
}
