import java.util.Scanner;

public class JogoDaVelha{

    // BUILDER METHOD
    private JogoDaVelha(){
        char jogarNovamente;

        Scanner input = new Scanner(System.in);

        char[][] mapa = new char[3][3];

        do{
            jogarPartida(input, mapa);
            System.out.println();  
            System.out.println("═════════════════════════════════════════════════");
            System.out.println("Deseja jogar novamente (s/n)?");

            jogarNovamente = input.next().charAt(0);

        }while(jogarNovamente == 's');
        System.out.println("═══ FIM ═══");

        input.close();
    }

    // METHOD THAT SHOWS THE MATCH
    private void jogarPartida(Scanner teclado, char [][] mapa){
        limpaMapa(mapa);
        boolean turno = false;

        if(sortear(0,2) == 0){
            turno = true;
        }

        boolean empatar = true;
        int jogada = 0;

        desenha(jogada, mapa);

        while(jogada < 9){
            jogada++;
            if(turno){
                if(rodadaMaquina(mapa)){
                    empatar = false;
                    break;
                }
                turno = false;
            }else{
                if(rodadaJogador(mapa, teclado)){
                    empatar = false;
                    break;
                }
                turno = true;
            }
            desenha(jogada, mapa);
        }
        desenha(jogada, mapa);

        if(empatar){
            System.out.println("═══EMPATE═══");
        }
    }
    // METHOD TO CLEAN THE BOARD
    private void limpaMapa(char[][] mapa){
        for(int linha = 0; linha < mapa.length; linha++){
            for(int coluna = 0; coluna < mapa.length; coluna++){
                mapa[linha][coluna] = ' ';
            }
        }
    }
    // METHOD TO DRAW THE BOARD
    private void desenha(int turno, char[][] mapa){
        System.out.println("\n╔═══════════════════════════════════════════════╗"); // PARTE SUPERIOR
		for(int i = 0; i < 3; i++) {
			System.out.print("║");
			for(int j = 0; j < 3; j++) {
				System.out.print("\t" + mapa[i][j] + "\t");
				if(j != 2) 
					System.out.print("│");
			}
			System.out.println("║");
			if(i != 2) 
				System.out.println("║ ──────────────┼───────────────┼────────────── ║");				
		}
		System.out.println("╚═══════════════════════════════════════════════╝\n");
    }
    // PLAYER PLAY ROUND METHOD
    private boolean rodadaJogador(char mapa[][], Scanner input){
        char simboloJogador = 'X';
        int linha, coluna;

        while(true){
            System.out.println("Jogador ..");
            System.out.println("  Linha:  ");
            linha = input.nextInt();
            System.out.println("  Coluna:  ");
            coluna = input.nextInt();

            if(linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2){
                if(jogar(linha, coluna, simboloJogador, mapa)){
                    break;
                }
                System.out.println("Jogada não permitida!");
            }
        }
        if(ganhou(simboloJogador, mapa)){
            System.out.println(".:Jogador foi o Vencedor:.");
            return true;
        }
        return false;
    }
    // MACHINE PLAY ROUND METHOD
    private boolean rodadaMaquina(char mapa[][]){
        char letraMaquina = 'O';

        while(true){
            int linha, coluna;

            linha = sortear(0, 3);
            coluna = sortear(0, 3);

            if(jogar(linha, coluna, letraMaquina, mapa)){
                System.out.println("Maquina[" + linha + "," + coluna + "]");
                if(ganhou(letraMaquina, mapa)){
                    System.out.println(".:Maquina foi o Vencedor:.");
                    return true;
                }
                return false;
            }
        }
    }
    // CHECKS IF THERE IS AN EMPTY SPACE TO MAKE THE MOVE
    private boolean jogar(int linha, int coluna, char jogador, char[][] mapa){
        if(mapa[linha][coluna] == ' '){
            mapa[linha][coluna] = jogador;
            return true;
        }
        return false;
    }
    // CHECKS EVERY MOVE IF A PLAYER HAS WON
    private boolean ganhou(char jogador, char[][] mapa){
        for(int linha = 0; linha < 3; linha++){
            if(mapa[linha][0] == jogador && mapa[linha][1] == jogador && mapa[linha][2] == jogador){
                return true;
            }
        }
        for(int coluna = 0; coluna < 3; coluna++){
            if(mapa[0][coluna] == jogador && mapa[1][coluna] == jogador && mapa[2][coluna] == jogador){
                return true;
            }
        }
        if(mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador){
            return true;
        }
        if(mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador){
            return true;
        }
        return false;
    }
    // METHOD DRAW THE MACHINE MOVE
    private int sortear(int inicio, int fim) {
        return (int) ((Math.random()*fim)-inicio); 
    }
    // MAIN METHOD CALLING QUE CONTRUCTOR
    public static void main(String[] args) {
        new JogoDaVelha();
    }
}