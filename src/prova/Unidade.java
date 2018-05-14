package prova;

public class Unidade {
    private boolean livre = true;
    private int tamanho;
    private Unidade anterior = null;
    private Unidade proximo = null;
    
    public Unidade(int tamanho){
        this.tamanho = tamanho;
    }
    
    public void subtrairTamanho(int tamanho){
        this.tamanho = this.tamanho - tamanho;
    }
}
