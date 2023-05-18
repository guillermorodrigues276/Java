package Arvores;

public class Arvore<T> {  // contribui��o do Martin
    
    private NoArvore<T> raiz;
    
    public Arvore() {
    	raiz = null;
    }
    
    public NoArvore<T> getRaiz() {
        return raiz;
    }
    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }
    public NoArvore<T> pertence(T info) {
        if (this.vazia()) {
            return null;
        }
        return this.raiz.pertence(info);
    }
    public boolean vazia() {
        if (raiz == null) {
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
    	if (this.vazia()) {
            return null;
        }
        return this.raiz.imprimePre();
    }
}