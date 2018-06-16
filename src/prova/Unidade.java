package prova;

public class Unidade {

    boolean visitado = false;
    boolean estaLivre = true;
    int tamanho, inicio;
    Unidade proximo, anterior;

    public Unidade(int tamanho) {
        this.tamanho = tamanho;
        this.inicio = 0;
    }
    public Unidade(int tamanho, boolean estaLivre){
        this.tamanho = tamanho;
        this.estaLivre = estaLivre;
    }
    
    public void addUnidade(Unidade uni) throws Exception{
        if(this.estaLivre){
            if(this.tamanho == uni.tamanho){
                this.estaLivre = false;
            }else{
                this.tamanho -= uni.tamanho;
                uni.inicio = this.tamanho;
                uni.estaLivre = false;
                
                uni.proximo = this.proximo;
                this.proximo = uni;
                uni.anterior = this;
            }
        }else{
            throw new Exception("Está unidade não está livre");
        }
    }
    /**
     * Pesquisa e retorna o próximo livre com tamanho menor ou igual ao espaço desejado
     * @param tamanho Tamanho a ser alocado
     * @return Unidade
     * @throws Exception Caso não encontre uma unidade livre e/ou com tamanho menor ou igual ao desejado
     */
    public void proximaLivre(int tamanho) throws Exception {
        if(this.estaLivre && this.tamanho >= tamanho ){
            this.addUnidade(new Unidade(tamanho));
        }else if(anterior != null && !visitado){
            this.visitado = true;
            anterior.proximaLivre(tamanho);
        }else if(proximo != null && !visitado){
            this.visitado = true;
            proximo.proximaLivre(tamanho);
        }else{
            throw new Exception("Impossível encontrar um espaço livre com o tamanho de " + tamanho);
        }
    }
    //seta todos os itens da lista como não visitado
    //Se o anterior de this é igual a nulo, então chegou-se no início da lista
    //Se o próximo de this é igual a nulo, então chegou-se no fim da lista
    public void setVisitadoFalse(){
        if(this.anterior != null && this.visitado){
            this.anterior.setVisitadoFalse();//vai chegar no primeiro item da lista da esquerda p/ a direita 
        }else{
            this.visitado = false;
        }
        if(this.proximo != null)
            this.proximo.setVisitadoFalse();
    }
}
