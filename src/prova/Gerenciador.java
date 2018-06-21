package prova;

public class Gerenciador {
    Unidade unidadeReferencia;
    
    public Gerenciador(int tamanho){
        this.unidadeReferencia = new Unidade(tamanho);
        this.unidadeReferencia.inicio = 0;
    }
    public void alocar(int tamanho) throws Exception{
        this.unidadeReferencia.addUnidade(tamanho);
        this.unidadeReferencia.setVisitadoFalse();
        
        
    }
    
    public void desalocar(int inicio) throws Exception{
        this.unidadeReferencia.desalocar(inicio);//o desalocar() não altera a unidade referência
        //nesse caso fiz esse if para alterar a unidade referência quando o nó próximo a ela tbm for livre
        if(this.unidadeReferencia.proximo != null && this.unidadeReferencia.proximo.estaLivre && this.unidadeReferencia.estaLivre){
            this.unidadeReferencia = this.unidadeReferencia.proximo;
        }
        
    }
    
}

