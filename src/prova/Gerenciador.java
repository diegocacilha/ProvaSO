package prova;

public class Gerenciador {
    Unidade uniCorrente;
    
    public Gerenciador(int tamanho){
        this.uniCorrente = new Unidade(tamanho);
        this.uniCorrente.inicio = 0;
    }
    public void alocar(int tamanho) throws Exception{
        this.uniCorrente.proximaLivre(tamanho);
        this.uniCorrente.setVisitadoFalse();
        
        
    }
    
    public void desalocar(int inicio){
        if(this.uniCorrente.inicio == inicio){
            this.uniCorrente.estaLivre = true;
        }
    }
    
}

