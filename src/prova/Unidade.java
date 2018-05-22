package prova;

public class Unidade {
    private boolean livre = true;
    private int tamanho;
    private int inicio;
    private Unidade proximo = null;

    public Unidade(int tamanho, int inicio){
        this.tamanho = tamanho;
        this.inicio = inicio;
    }
    
    public void setProximo(Unidade proximo) throws Exception{
        if(this.proximo == null || this.proximo.getLivre())
            this.proximo = proximo;
        else
            throw new Exception("Não foi possível adicionar um próximo");
    }
    
    public int getInicio(){
        return this.inicio;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    

    public boolean getLivre(){
        return this.livre;
    }
    
   
    public Unidade getProximo(){
        return this.proximo;
    }
    
    public void setLivre(boolean b){
        this.livre = b;
    }
}
