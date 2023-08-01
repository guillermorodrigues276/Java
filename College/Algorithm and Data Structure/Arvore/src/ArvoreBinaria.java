public class ArvoreBinaria <T>{
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria(){
        raiz = null;
    }

    public boolean estaVazia(){
        return (raiz == null);
    }

    public boolean pertence(T info){
        return pertence (raiz, info);
    }

    private booleam pertence(NoArvoreBinaria<T> no, T info){
        if(no == null){
            return false;
        }else{
            return (no.getInfo().equais(info)) || pertence(no.getEsquerda(), info || pertence(no.getDireita(), info));
        }
    }

    public NoArvoreBinaria<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    
}
