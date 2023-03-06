package listaArrayestatica;

public class listaArrayEstatica {
	
	private int[] listaArray;
	private int posicao;

	// Cria uma listaArray Vazia .
	// | | | | | | |

	public listaArrayEstatica() {
		listaArray = new int[10];
		posicao = 0;
	}
	
	
	// Adiciona um valor na listaArray.
	public void inserir(int valor) {
		if (posicao == listaArray.length) { // ele excede o limite, chamando o método redimensionar.
			redimensionar();
		}
		listaArray[posicao] = valor; //ele vai adicionar um valor na posição X que a lista estiver.
		posicao++; // passa para a proxima posição.
	}
	

	// realiza um pseudo redimensionamento
	private void redimensionar() {
		int[] novo = new int[listaArray.length + 10]; // cria uma nova listaArray que recebe o posicao da listaArray antiga + 10.

		for (int i = 0; i < listaArray.length; i++) {
			novo[i] = listaArray[i]; // repopula o novo array com os valores antigos.
		}
		
		listaArray = novo; // depois de repopular o novo array redimensionado ele volta com o nome de antes.
	}	
	
	
	// percorre a listaArray mostrando o conteudo nela presente
	public void exibir() {
		for (int i = 0; i < posicao; i++) {
			System.out.println(listaArray[i]);
		}
	}
	
	// Procura na listaArray um determinado valor
	// (valor) dado a ser pesquisado
	// (return i) retorna a posição do valor na listaArray
	// caso não seja encontrado retorna -1 ou seja, se aparecer -1 é porque não foi achado

	public int buscar(int valor) {
		for (int i = 0; i < posicao; i++) {
			if (listaArray[i] == valor) {
				return i;
			}
		}
		
		return -1;
	}
	
	// Retina um dado da listaArray
	// (valor) dado a ser removido
	public void retirar(int valor) {  //*ENTENDER*/
		int posicao = buscar(valor); 
		
		if (posicao > -1) {
			for (int i = posicao +1; i < posicao; i++) {
				listaArray[i-1] = listaArray[i]; 
			}
			
			posicao--;
		}
	}
	
	
	// Limpa a lista toda
	public void liberar() {
		listaArray = new int[10];
		posicao = 0;
	}
	
	
	/**
	 * Retorna o dado armazenado numa determinada posição
	 * da listaArray.
	 * @param posicao Posição do dado
	 * @return Dado localizado
	 */
	public int obterElemento(int posicao) {  //*ENTENDER*/
		if (posicao >= 0 && (posicao < posicao)) {
			return listaArray[posicao];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	
	/**
	 * Avalia se a listaArray está vazia ou contem dados armazenados.
	 * @return true se a listaArray estiver vazia, senão false.
	 */
	public boolean estaVazia() {
		return posicao==0;
	}
	
	
	/**
	 * Retorna o posicao atual da listaArray, isto é,
	 * a quantidade de dados já armazenados na estrutura de dados
	 * @return Quantidade de dados armazenados
	 */
	public int getposicao() {
		return posicao;
	}
	
	
	/**
	 * Retorna string contendo os dados armazenados na listaArray
	 */
	@Override
	public String toString() {
		String resultado = "";
		
		for (int i = 0; i < posicao; i++) {
			if (i > 0) {
				resultado += ",";
			}
			resultado += listaArray[i]; 
		}
		
		return resultado;
	}


}
