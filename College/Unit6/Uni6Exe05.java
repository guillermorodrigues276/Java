import java.util.Scanner;

public class Uni6Exe05 {

    public Uni6Exe05(){
        String[] respostasMenino = new String[5];
        String[] respostasMenina = new String[5];

        String[] perguntas = new String[5];

        perguntas[0] = "Gosta de musica sertaneja?";
        perguntas[1] = "Gosta de futebol?";
        perguntas[2] = "Gosta de seriados?";
        perguntas[3] = "Gosta de redes sociais?";
        perguntas[4] = "Gosta de Oktoberfest?";

        lerRespostas(respostasMenino, respostasMenina, perguntas);
        calc(respostasMenino, respostasMenina);
    }

    private void lerRespostas(String respostasMenino[], String respostasMenina[], String perguntas[]){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println(perguntas[i]);
            System.out.println("Digite as respostas do menino: ");
            respostasMenino[i] = input.next();

            System.out.println("Digite as respostas da menina: ");
            respostasMenina[i] = input.next();
        }
        input.close();
    }

    private void calc(String respostasMenino[], String respostasMenina[]){

        int afinidade = 0;

        for(int i = 0; i < 5; i++){
            if(respostasMenino[i].toLowerCase().equals("sim") && respostasMenina[i].toLowerCase().equals("sim")){
                afinidade += 3;
            }
            if(respostasMenino[i].toLowerCase().equals("sim") && respostasMenina[i].toLowerCase().equals("ind")){
                afinidade += 1;
            }
            if(respostasMenino[i].toLowerCase().equals("ind") && respostasMenina[i].toLowerCase().equals("sim")){
                afinidade += 1;
            }
            if(respostasMenino[i].toLowerCase().equals("sim") && respostasMenina[i].toLowerCase().equals("nao")){
                afinidade -= 2;
            }
            if(respostasMenino[i].toLowerCase().equals("nao") && respostasMenina[i].toLowerCase().equals("sim")){
                afinidade -= 2;
            }
            if(respostasMenino[i].toLowerCase().equals("nao") && respostasMenina[i].toLowerCase().equals("ind")){
                afinidade -= 2;
            }
            if(respostasMenino[i].toLowerCase().equals("ind") && respostasMenina[i].toLowerCase().equals("nao")){
                afinidade -= 2;
            }
            System.out.println();
        }
        System.out.println("A afinidade é -> " + afinidade);

        if(afinidade == 15){
            System.out.println("Casem!");
        }
        if(afinidade <= 14 && afinidade >= 10){
            System.out.println("Vocês têm muita coisa em comum!");
        }
        if(afinidade >= 5 && afinidade <= 9){
            System.out.println("Talvez não dê certo");
        }
        if(afinidade >= 0 && afinidade <= 4){
            System.out.println("Vale um encontro.");
        }
        if(afinidade <= -1 && afinidade >= -9){
            System.out.println("Melhor não perder tempo");
        }
        if(afinidade == -10){
            System.out.println("Vocês se odeiam");
        }
    }
    public static void main(String[] args) {
        new Uni6Exe05();
    }
}
