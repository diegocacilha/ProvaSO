package prova;

public class Unidade {
    boolean estaLivre = true;
    int tamanho, inicio, fim; 
    Unidade proximo, anterior;
    
    public Unidade(int tamanho){
        this.tamanho = tamanho;
    }
}
