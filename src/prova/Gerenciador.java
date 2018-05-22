package prova;

public class Gerenciador {

    private Unidade unidadeAlocacao;

//    public Memoria(int tamanho){
//        this.unidadeAlocacao = new Unidade(tamanho);
//    }
    /**
     *
     * @param tamanho Tamanho da memória
     */
    public Gerenciador(int tamanho) {
        this.unidadeAlocacao = new Unidade(tamanho);
    }

    public void alocarProximoLivre(int tamanho) throws Exception{
        this.unidadeAlocacao.setProximo(tamanho);
    }
    
    
    public void showNoh(){
        while(this.unidadeAlocacao.getProximo() != null){
            this.unidadeAlocacao.get
        }
        
    }

}
