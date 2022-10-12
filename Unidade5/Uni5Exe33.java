import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //! VARIAVEIS
        int voto, votoCandidato1, votoCandidato2, votoCandidato3, votoCandidato4, voto5Nulo, voto6Branco;
        double total, percentualCandidato1, percentualCandidato2, percentualCandidato3, percentualCandidato4, percentualNulo, percentualBranco, percentualBrancoNulo;

        //! DECLARAÇÃO VARIAVEIS
        votoCandidato1 = 0;
        votoCandidato2 = 0;
        votoCandidato3 = 0;
        votoCandidato4 = 0;
        voto5Nulo = 0;
        voto6Branco = 0;
        voto = 0;
        percentualCandidato1 = 0.0;
        percentualCandidato2 = 0.0;
        percentualCandidato3 = 0.0;
        percentualCandidato4 = 0.0;
        percentualNulo = 0.0;
        percentualBranco = 0.0;
        percentualBrancoNulo = 0.0;

        //! LAÇO REPETIÇÃO (FAÇA-ENQUANTO)
        do{
            System.out.println();
            System.out.println("Opção 1 - Candidato 1");
            System.out.println("Opção 2 - Candidato 2");
            System.out.println("Opção 3 - Candidato 3");
            System.out.println("Opção 4 - Candidato 4");
            System.out.println("Opção 5 - Voto Nulo");
            System.out.println("Opção 6 - Voto em Branco");
            System.out.println("Opção 0 - Encerrar Votação");
            System.out.println();

            //! VARIAVEL LER VOTO
            voto = input.nextInt();

            //! OPÇÃO DE VOTO
            switch(voto){
                case 1:
                    votoCandidato1++;
                break;
                case 2:
                    votoCandidato2++;
                break;
                case 3: 
                    votoCandidato3++;
                break;
                case 4:
                    votoCandidato4++;
                break;
                case 5:
                    voto5Nulo++;
                break;
                case 6:
                    voto6Branco++;
                break;

                default:
                    System.out.println("Opção Incorreta");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            }
        }while(voto != 0); //! ENQUANTO VOTO FOR DIFERENTE DE 0 CONTINUAR REPETINDO

        //! CALCULO DO TOTAL DE VOTOS
        total = votoCandidato1 + votoCandidato2 + votoCandidato3 + votoCandidato4 + voto5Nulo + voto6Branco;

        //! PORCENTAGEM DE CADA VOTO
        percentualCandidato1 = (votoCandidato1 * 100) / (double) total;
        percentualCandidato2 = (votoCandidato2 * 100) / (double) total;
        percentualCandidato3 = (votoCandidato3 * 100) / (double) total;
        percentualCandidato4 = (votoCandidato4 * 100) / (double) total;
        percentualNulo = (voto5Nulo * 100) / (double) total;
        percentualBranco = (voto6Branco * 100) / (double) total;
        percentualBrancoNulo = (percentualNulo + percentualBranco);

        //! ESCRITA DO NUMERO DE VOTOS E SUA PORCENTAGEM
        System.out.println("Votos Candidato 1 -> " + votoCandidato1 + " - " + df.format(percentualCandidato1) + "%");
        System.out.println("Votos Candidato 2 -> " + votoCandidato2 + " - " + df.format(percentualCandidato2) + "%");
        System.out.println("Votos Candidato 3 -> " + votoCandidato3 + " - " + df.format(percentualCandidato3) + "%");
        System.out.println("Votos Candidato 4 -> " + votoCandidato4 + " - " + df.format(percentualCandidato4) + "%");
        System.out.println("Votos Nulos       -> " + voto5Nulo + " - " + df.format(percentualNulo) + "%");
        System.out.println("Votos em Branco   -> " + voto6Branco + " - " + df.format(percentualBranco) + "%");
        System.out.println("Percentual Votos Nulos e em Branco ->" + df.format(percentualBrancoNulo) + "%");

        input.close();
    }
}
