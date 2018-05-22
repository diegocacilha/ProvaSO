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
        this.unidadeAlocacao = new Unidade(tamanho, 0);
    }

    private void impossivelAlocarProximo() throws Exception{
        throw new Exception("Impossível alocar próximo");
    }
    public void alocarProximoLivre(int tamanho) throws Exception {
        if (this.unidadeAlocacao.getProximo() == null) {
            if (this.unidadeAlocacao.getLivre() && tamanho <= this.unidadeAlocacao.getTamanho()) {
                this.unidadeAlocacao.setTamanho(this.unidadeAlocacao.getTamanho() - tamanho);
                Unidade temp = new Unidade(tamanho, this.unidadeAlocacao.getTamanho());
                this.unidadeAlocacao.setProximo(temp);
            }else{
                this.impossivelAlocarProximo();
            }
        } else {
            if (this.unidadeAlocacao.getLivre() && tamanho <= this.unidadeAlocacao.getTamanho()) {
                this.unidadeAlocacao.setTamanho(this.unidadeAlocacao.getTamanho() - tamanho);
                Unidade temp = new Unidade(tamanho, this.unidadeAlocacao.getTamanho());
                temp.setProximo(this.unidadeAlocacao.getProximo());
                this.unidadeAlocacao.setProximo(temp);
            }else{
                this.impossivelAlocarProximo();
            }

        }
//        Unidade temp = new Unidade(tamanho, tamanho)
    }
}
