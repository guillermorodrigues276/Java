package Project;

public class PilhaVetor<T> implements Pilha<T> {

	private T[] info;
	private int limite;
	private int tamanho;
	
	public PilhaVetor(int limite) {
		info = (T[]) new Object[limite];
		this.limite = limite;
		this.tamanho = 0;
	}
	
	public void push(T info) {
		if(tamanho == limite) {
			throw new PilhaCheiaException();
		}else {
			this.info[tamanho] = info;
			tamanho++;
		}
	}
	
	public T peek() {
			if(estaVazia()) {
				throw new PilhaVaziaException();
			}
			return info[tamanho - 1];
	}
	
	public T pop() {
		T valor = peek();
		info[tamanho - 1] = null;
		tamanho--;
		
		return valor;
	}
	
	public boolean estaVazia() {
		if(tamanho == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void Liberar() {
		//1 maneira
		info = (T[]) new Object[limite];
		tamanho = 0;
		
		//2 maneira
		while(!estaVazia()) {
			pop();
		}
		
		//3 maneira
		try {
			while(true) {
				pop();
			}
		} catch (PilhaVaziaException e) {
			
		}
	}
	
	public String toString() {
		String resultado = "";
		
		for(int i=tamanho; i>=0; i--) {
			resultado += info[i].toString();
			if(i > 0) {
				resultado = resultado + ",";
			}
		}
		return resultado;
	}
	
	public void concatenar(PilhaVetor<T> p) {
		for(int i=0; i<p.tamanho; i++) {
			this.push(p.info[i]);
		}
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'liberar'");
	}
}

