package prova;

public class Memoria {
    private Unidade livre;
    
    public Memoria(int tamanho){
		this.unidadeAlocacao = new Unidade(tamanho);
        this.unidadeAlocacao.setProximo(unidadeAlocacao);//inicialmente a lista será vazia, então o próximo e anterior apontam pra ela mesma
        this.unidadeAlocacao.setAnterior(unidadeAlocacao);
    }
    /**
     * A lógica básica para fazer a lista encadeada é mais ou menos essa. 
     * Só temos que subtrair o tamanho da nova unidade da unidadeAlocacao
     * @param tamanho Tamanho da unidade que será alocada
     */
    public void alocar(int tamanho){
        Unidade temp = new Unidade(tamanho);
        temp.setLivre(false);
        if(this.unidadeAlocacao.temAnterior()) this.unidadeAlocacao.setAnterior(temp);
        temp.setProximo(this.unidadeAlocacao.getProximo());
        temp.setAnterior(this.unidadeAlocacao);
        this.unidadeAlocacao.setProximo(temp);
    }
    
}
