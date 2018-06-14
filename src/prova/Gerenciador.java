package prova;

public class Gerenciador {
    Unidade uniCorrente;
    
    public Gerenciador(int tamanho){
        this.uniCorrente = new Unidade(tamanho);
        this.uniCorrente.inicio = 0;
        this.uniCorrente.fim = tamanho -1;
    }
    public void alocar(int tamanho) throws Exception{
        Unidade objCorrente = this.uniCorrente.proximaLivre(tamanho);
        Unidade novaUnidade;
        if(tamanho <= objCorrente.tamanho){
            novaUnidade = new Unidade(tamanho);
        }else{
            throw new Exception("Tamanho maior do que o possível");
        }
        novaUnidade.estaLivre = false;
        
        if(objCorrente.proximo != null){
            novaUnidade.proximo = objCorrente.proximo;
            novaUnidade.proximo.anterior = novaUnidade;
        } 
        objCorrente.proximo = novaUnidade;
        novaUnidade.anterior = objCorrente;
        
        objCorrente.subtair(tamanho);
        novaUnidade.inicio = objCorrente.fim+1;
        novaUnidade.fim = novaUnidade.inicio + novaUnidade.tamanho -1;
        
        if(this.uniCorrente.tamanho == 0)
            this.uniCorrente = this.uniCorrente.proximo;
        
    }
    
    public void desalocar(int tamanho){
        Unidade temp = this.uniCorrente;
        do{
            if(temp.tamanho != tamanho)
                temp = temp.proximo;
            
        }while(temp.tamanho != tamanho);
        
        temp.estaLivre = true;
        if(temp.anterior.estaLivre) {
            temp.anterior.tamanho += temp.tamanho;
            temp.anterior.fim += temp.tamanho;
            temp.anterior.proximo = temp.proximo;
            temp.proximo.anterior = temp.anterior;
        }
        if(temp.proximo.estaLivre){
            temp.proximo.tamanho += temp.tamanho;
            temp.proximo.fim += temp.tamanho;
            temp.proximo.anterior = temp.anterior;
            temp.anterior.proximo = temp.proximo;
        }
    }
    
}

