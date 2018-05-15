package prova;

public class Unidade {
    private boolean livre = true;
    private int tamanho;
    private Unidade anterior = null;
    private Unidade proximo = null;
    
    public Unidade(int tamanho){
        this.tamanho = tamanho;
    }
    
    public boolean getLivre(){
        return this.livre;
    }
    
    public boolean temAnterior(){
        return !this.anterior.equals(null);
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
