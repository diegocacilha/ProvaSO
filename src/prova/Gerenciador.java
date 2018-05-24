package prova;

public class Gerenciador {

    private Unidade unidadeAlocacao;

    public Gerenciador(int tamanho) {
        this.unidadeAlocacao = new Unidade(tamanho);
        this.unidadeAlocacao.setInicio(0);
    }

    private void impossivelAlocarProximo() throws Exception{
        throw new Exception("Impossível alocar próximo");
    }
    private void setVerificado(){
        while(this.unidadeAlocacao.verificado){
            this.unidadeAlocacao.verificado = false;
            this.unidadeAlocacao = this.unidadeAlocacao.getProximo();
        }
    }
    public void alocarProximoLivre(int tamanho) {
        Unidade temp;
        do{
            if(this.unidadeAlocacao.estaLivre())
                temp = this.unidadeAlocacao;
            else
                this.unidadeAlocacao.verificado = true;
                this.unidadeAlocacao = this.unidadeAlocacao.getProximo();
        }while(!this.unidadeAlocacao.estaLivre() && !this.unidadeAlocacao.verificado);
        
        this.setVerificado();
        
        //Unidade temp = new Unidade(tamanho);
        /*
        temp.setInicio(this.unidadeAlocacao.getTamanho());
        if (this.unidadeAlocacao.getProximo() == null) {
            if (this.unidadeAlocacao.getLivre() && tamanho <= this.unidadeAlocacao.getTamanho()) {
                this.unidadeAlocacao.setTamanho(this.unidadeAlocacao.getTamanho() - tamanho);
                this.unidadeAlocacao.setProximo(temp);
            }else{
                this.impossivelAlocarProximo();
            }
        } else {
            if (this.unidadeAlocacao.getLivre() && tamanho <= this.unidadeAlocacao.getTamanho()) {
                this.unidadeAlocacao.setTamanho(this.unidadeAlocacao.getTamanho() - tamanho);
                temp = new Unidade(tamanho);
                temp.setInicio(this.unidadeAlocacao.getTamanho());
                temp.setProximo(this.unidadeAlocacao.getProximo());
                this.unidadeAlocacao.setProximo(temp);
            }else{
                this.impossivelAlocarProximo();
            }

        }
        */
    }
}
