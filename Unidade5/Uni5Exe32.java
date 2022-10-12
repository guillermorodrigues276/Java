import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int dia, dias;

        System.out.println("Em qual dia da semana começa o mês?");
        dia = input.nextInt();
        System.out.println("Quantos dias tem o mês?");
        dias = input.nextInt();
        System.out.println("|D|S|T|Q|Q|S|S|");
        System.out.println("-------------");
        for(int i = 1; i < dia; i++){
            System.out.print("  ");
        }
        for(int i = 1; i <= dias; i++){
            System.out.print("|" + i);
            if(dia == 7){
                dia = 1;
                System.out.println();
            }else{
                dia++;
            }
        }
        input.close();
    }
}
