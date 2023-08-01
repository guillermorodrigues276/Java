public class NoArvoreBinaria {
    
    

    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir){
        this.info = info;
        this.esquerda = esq;
        this.direita = dir;
    }

    public void setInfo(T info){
        this.info = info;
    }
}
