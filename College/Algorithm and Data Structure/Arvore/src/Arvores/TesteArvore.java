package Arvores;

public class TesteArvore {
    public static void main(String[] args) {
        noArvore<Integer> n9 = new noArvore<Integer>(9);
        noArvore<Integer> n10 = new noArvore<Integer>(10);
        noArvore<Integer> n4 = new noArvore<Integer>(4);

        n4.inserirFilho(n10);
        n4.inserirFilho(n9);

        noArvore<Integer> n8 = new noArvore<Integer>(8);
        noArvore<Integer> n3 = new noArvore<Integer>(3);

        n3.inserirFilho(n8);

        noArvore<Integer> n5 = new noArvore<Integer>(5);
        noArvore<Integer> n6 = new noArvore<Integer>(6);
        noArvore<Integer> n7 = new noArvore<Integer>(7);

        noArvore<Integer> n2 = new noArvore<Integer>(2);
        n2.inserirFilho(n7);
        n2.inserirFilho(n6);
        n2.inserirFilho(n5);
        

        noArvore<Integer> n1 = new noArvore<Integer>(1);
        n1.inserirFilho(n4);
        n1.inserirFilho(n3);
        n1.inserirFilho(n2);

        Arvore<Integer> a = new Arvore<>();
        a.setRaiz(n1);

        System.out.println(a.toString());
        
    }
}
