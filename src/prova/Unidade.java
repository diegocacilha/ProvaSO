package prova;

public class Unidade extends MemoriaFisica{
    private boolean livre = true;
    private Unidade anterior = null;
    private Unidade proximo = null;
    
    public Unidade(int tamanho){
        super(tamanho);
    }

    public boolean inUse(){
        return this.livre;
    }
    
    
    public boolean antIsNull(){
        return this.anterior == null;
    }
    public boolean proxIsNull(){
        return this.proximo == null;
    }
    public Unidade getProximo(){
        return this.proximo;
    }
    public Unidade getAnterior(){
        return this.anterior;
    }
    public void setLivre(boolean b){
        this.livre = b;
    }
    public void setProximo(Unidade uni){
        this.proximo = uni;
    }
    public void setAnterior(Unidade uni){
        this.anterior = uni;
    }
}
