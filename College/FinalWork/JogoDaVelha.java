import java.util.Scanner;

public class JogoDaVelha{

    private JogoDaVelha(){
        char jogarNovamente;

        Scanner input = new Scanner(System.in);

        char[][] mapa = new char[3][3];

        do{

        }
    }

    
    private void jogarPartida(Scanner teclado, char [][] mapa){
        limpaMapa(mapa);
        boolean mudanca = false;

        if(sortear(0,2) == 0){
            mudanca = true;
        }

        boolean empatar = true;
        int jogada = 0;

        desenha(jogada, mapa);

        while(jogada < 9){
            jogada++;
            if(mudanca){
                if(rodadaMaquina(mapa)){
                    empatar = false;
                    break;
                }
                mudanca = false;
            }else{
                if(rodadaJogador(mapa, teclado)){
                    empatar = false;
                    break;
                }
                mudanca = true;
            }
            desenha(jogada, mapa);
        }
        desenha(jogada, mapa);

        if(empatar){
            System.out.println("═══EMPATE═══");
        }
    }

    private void limpaMapa(char[][] mapa){
        for(int linha = 0; linha < mapa.length; linha++){
            for(int coluna = 0; coluna < mapa.length; coluna++){
                mapa[linha][coluna] = ' ';
            }
        }
    }

    private void desenha(int mudanca, char[][] mapa){
        System.out.println("\n╔═══════════════════════════════════════════════╗"); // PARTE SUPERIOR
		for(int i = 0; i < 3; i++) {
			System.out.print("║"); // PARA O TAMANHO DO MAPA ADICIONA AS DIVISORIAS
			for(int j = 0; j < 3; j++) {
				System.out.print("\t" + mapa[i][j] + "\t");
				if(j != 2) 
					System.out.print("│"); // ADICIONA NOS NUMEROS IMPARES, POIS SE FOSSE NO NUMERO PAR NÃO FICARIA CERTO O DESENHO DO MAPA
			}
			System.out.println("║");
			if(i != 2) 
				System.out.println("║ ──────────────┼───────────────┼────────────── ║");				
		}
		System.out.println("╚═══════════════════════════════════════════════╝\n");
    }
    // TODO: RODADA DO JOGADOR
    private boolean rodadaJogador(char mapa[][], Scanner input){

    }
    // TODO: RODADA DA MAQUINA
    private boolean rodadaMaquina(char mapa[][]){

    }
    // TODO: AVERIGUAR SE O ESPAÇO TA VAZIO PARA REALIZAR A JOGADA
    private boolean jogar(int linha, int coluna, char jogador, char[][] mapa){

    }
    //TODO: VER SE O JOGADOR GANHOU
    private boolean ganhou(char jogador, char[][] mapa){

    }

    private int sortear(int inicio, int fim) {
        return (int) ((Math.random()*fim)-inicio); 
    }

    public static void main(String[] args) {
        new JogoDaVelha();
    }
}