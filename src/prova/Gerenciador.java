package prova;

public class Gerenciador {
    Unidade uniCorrente;
    
    public Gerenciador(int tamanho){
        this.uniCorrente = new Unidade(tamanho);
        this.uniCorrente.inicio = 0;
    }
    private Unidade retornaProximoLivre(int tamanho){
        Unidade temp = null;
        do{
            if(uniCorrente.estaLivre && uniCorrente.tamanho >= tamanho)
                temp = uniCorrente;
            else
                uniCorrente = uniCorrente.proximo;
        }while(!temp.estaLivre);
        
        return temp;
    }
    public void firtFit(int tamanho){
        Unidade objCorrente = this.retornaProximoLivre(tamanho);
        
        Unidade novaUnidade = new Unidade(tamanho);
        novaUnidade.estaLivre = false;
        if(objCorrente.proximo != null) 
            novaUnidade.proximo = objCorrente.proximo;
        objCorrente.proximo = novaUnidade;
        objCorrente.tamanho = objCorrente.tamanho - tamanho;
        novaUnidade.inicio = objCorrente.tamanho;
        
    }
    
}

