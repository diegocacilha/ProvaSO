package prova;

public class Unidade {
    private boolean livre = true;
    public boolean verificado = false;
    private int tamanho;
    private int inicio;
    private Unidade proximo = null;
    private Unidade anterior = null;

    public Unidade(int tamanho){
        this.tamanho = tamanho;
//        this.inicio = inicio;
    }
    public Unidade(int tamanho, Unidade ant, Unidade prox){
        this.tamanho = tamanho;
        this.proximo = prox;
        this.anterior = ant;
    }
    
    public void setProximo(Unidade proximo) throws Exception{
        if(this.proximo == null || this.proximo.estaLivre())
            this.proximo = proximo;
        else
            throw new Exception("Não foi possível adicionar um próximo");
    }
    public void setAnterior(Unidade anterior) throws Exception{
        if(this.anterior == null || this.anterior.estaLivre())
            this.anterior = anterior;
        else
            throw new Exception("Não foi possível adicionar um anterior");
    }
    
    public int getInicio(){
        return this.inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    

    public boolean estaLivre(){
        return this.livre;
    }
    
   
    public Unidade getProximo(){
        return this.proximo;
    }
    
    public void setLivre(boolean b){
        this.livre = b;
    }
}
