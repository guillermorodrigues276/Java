package Arvores;

    public class Arvore<T> {

        private noArvore<T> raiz;

        public Arvore(){
            this.raiz = null;
        }

        public noArvore<T> getRaiz(){
            return raiz;
        }

        public void setRaiz(noArvore<T> raiz){
            this.raiz = raiz;
        }

        public noArvore<T> pertence(T elemento){
            if(this.vazia()){
                return null;
            }
            return this.raiz.pertence(elemento);
        }

        public boolean vazia(){
            if(raiz == null){
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            if(this.vazia()){
                return null;
            }
            return this.raiz.imprimePre();
        }
}