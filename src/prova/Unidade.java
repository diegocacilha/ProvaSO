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

    public Unidade(int tamanho, boolean estaLivre) {
        this.tamanho = tamanho;
        this.estaLivre = estaLivre;
    }


    public void desalocar(int inicio) throws Exception{
        if (this.inicio == inicio) {
            this.estaLivre = true;
            if (this.proximo != null && this.proximo.estaLivre) {
                this.tamanho += this.proximo.tamanho;
                if(this.proximo.proximo != null){
                    this.proximo = this.proximo.proximo;
                }
            }
            if (this.anterior != null && this.anterior.estaLivre) {
                this.tamanho += this.anterior.tamanho;
                this.inicio = this.anterior.inicio;
                if(this.anterior.anterior != null){
                    this.anterior = this.anterior.anterior;
                }
            }

        }else if(this.proximo != null){
            this.proximo.desalocar(inicio);
        }else{
            throw new Exception("Unidade desejada não foi encontrada");
        }
    }
    private void addUnidade(Unidade uni) throws Exception {
        if (this.estaLivre) {
            if (this.tamanho == uni.tamanho) {
                this.estaLivre = false;
            } else {
                this.tamanho -= uni.tamanho;
                uni.inicio = this.tamanho;
                uni.estaLivre = false;
                
                uni.anterior = this;
                if(this.proximo == null){
                    this.proximo = uni;
                }else{
                    uni.proximo = this.proximo;
                    this.proximo = uni;
                    uni.proximo.anterior = uni; 
                }
            }
        } else {
            throw new Exception("Está unidade não está livre");
        }
    }

    /**
     * Pesquisa e retorna o próximo livre com tamanho menor ou igual ao espaço
     * desejado
     * teste 
     * @param tamanho Tamanho a ser alocado
     * @throws Exception Tamanho livre não 
     */
    public void addUnidade(int tamanho) throws Exception {
        if (this.estaLivre && this.tamanho >= tamanho) {
            this.addUnidade(new Unidade(tamanho));
        } else if (anterior != null && !anterior.visitado) {
            anterior.visitado = true;
            anterior.addUnidade(tamanho);
        } else if (proximo != null && !proximo.visitado) {
            proximo.visitado = true;
            proximo.addUnidade(tamanho);
        } else {
            throw new Exception("Impossível encontrar um espaço livre com o tamanho de " + tamanho);
        }
    }

    //seta todos os itens da lista como não visitado
    //Se o anterior de this é igual a nulo, então chegou-se no início da lista
    //Se o próximo de this é igual a nulo, então chegou-se no fim da lista
    public void setVisitadoFalse() {
        if (this.anterior != null && this.visitado) {
            this.anterior.setVisitadoFalse();//vai chegar no primeiro item da lista da esquerda p/ a direita 
        } else {
            this.visitado = false;
        }
        if (this.proximo != null) {
            this.proximo.setVisitadoFalse();
        }
    }
}
