package a;

public class noArvore<T> {
    
    private T info;
    private noArvore<T> filho;
    private noArvore<T> irmao;

    public noArvore(T info){
        super();
        this.info = info;
        this.filho = null;
        this.irmao = null;
    }

    public T getInfo(){
        return info;
    }
    public void setInfo(){
        this.info = info;
    }

    public String imprimePre(){
        String str = " < " + this.info.toString();
        if(this.filho != null){
            str += this.filho.imprimePre();
        }
        str += " > ";
        if(this.irmao != null){
            str += this.irmao.imprimePre();
        }
        return str;
    }

    public void inserirFilho(noArvore<T> sa){
        sa.irmao = this.filho;
        this.filho = sa;
    }

    public noArvore<T> pertence(T info){
        if(this.info.equals(info)){
            return this;
        }
        noArvore<T> no = null;
        if(this.filho != null){
            no = this.filho.pertence(info);
        }
        if(no == null && this.irmao != null){
            no = this.irmao.pertence(info);
        }
        return no;
    }
}
