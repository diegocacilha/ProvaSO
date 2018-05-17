
package prova;

public class MemoriaLogica extends MemoriaFisica{
    private Unidade unidadeAlocacao;
    
    public MemoriaLogica(int tamanho){
        super(tamanho);
//        this.unidadeAlocacao = new Unidade(tamanho);
//        
//        this.unidadeAlocacao.setProximo(unidadeAlocacao);//inicialmente a lista será vazia, então o próximo e anterior apontam pra ela mesma
//        this.unidadeAlocacao.setAnterior(unidadeAlocacao);
    }
    /**
     * A lógica básica para fazer a lista encadeada é mais ou menos essa. 
     * Só temos que subtrair o tamanho da nova unidade da unidadeAlocacao
     * @param tamanho Tamanho da unidade que será alocada
     */
    public void alocar(int tamanho){
        Unidade temp = new Unidade(tamanho);
        temp.setLivre(false);
        
        
        temp.setAnterior(this.unidadeAlocacao);
        temp.setProximo(this.unidadeAlocacao.getAnterior());
        this.unidadeAlocacao.setProximo(temp);
        
        if(!this.unidadeAlocacao.antIsNull()) this.unidadeAlocacao.setAnterior(temp);
        temp.setProximo(this.unidadeAlocacao.getProximo());
        temp.setAnterior(this.unidadeAlocacao);
        this.unidadeAlocacao.setProximo(temp);
    }
    
}
