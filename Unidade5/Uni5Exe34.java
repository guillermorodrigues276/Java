import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double numeroDiaria, diaria, taxa, diariaComTaxa;
        int opcao, numeroDeConta;
        String nome;

        diaria = 50.00;
        opcao = 0;
        numeroDeConta = 0;

        while(opcao != 3){
            System.out.println("Opção 1 -> Encerrar a conta de um hóspede");
            System.out.println("Opção 2 -> Verificar número de contas encerradas");
            System.out.println("Opção 3 -> Sair");
            System.out.println();
            System.out.println("----------------------------");

            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Informe seu nome: ");
                    nome = input.next();
                    System.out.println();
                    System.out.println("Informe a quantidade de diárias utilizadas: ");
                    numeroDiaria = input.nextInt();
                    System.out.println();
                    if(numeroDiaria < 15){
                        taxa = 7.50;
                        diariaComTaxa = (numeroDiaria * diaria) + (numeroDiaria * taxa);
                        System.out.println("Nome: " + nome);
                        System.out.println("Numero de Diárias: " + numeroDiaria);
                        System.out.println("Taxa por diária: " + (numeroDiaria * taxa));
                        System.out.println("Preço Diária: " + diaria);
                        System.out.println("Total: " + diariaComTaxa);
                        System.out.println();
                        numeroDeConta++;
                    }else if(numeroDiaria == 15){
                        taxa = 6.50;
                        diariaComTaxa = (numeroDiaria * diaria) + (numeroDiaria * taxa);
                        System.out.println("Nome: " + nome);
                        System.out.println("Numero de Diárias: " + numeroDiaria);
                        System.out.println("Taxa por diária: " + (numeroDiaria * taxa));
                        System.out.println("Preço Diária: " + diaria);
                        System.out.println("Total: " + diariaComTaxa);
                        System.out.println();
                        numeroDeConta++;
                    }else{
                        taxa = 5.00;
                        diariaComTaxa = (numeroDiaria * diaria) + (numeroDiaria * taxa);
                        System.out.println("Nome: " + nome);
                        System.out.println("Numero de Diárias: " + numeroDiaria);
                        System.out.println("Taxa por diária: " + (numeroDiaria * taxa));
                        System.out.println("Preço Diária: " + diaria);
                        System.out.println("Total: " + diariaComTaxa);
                        System.out.println();
                        numeroDeConta++;
                    }
                    break;
                    case 2:
                        System.out.println();
                        System.out.println("Número de contas encerradas: " + numeroDeConta);
                        System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Finalizando");
                    System.out.println();
                break;
            }
        }
        input.close();
        }
    }

