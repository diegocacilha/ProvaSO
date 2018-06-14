package prova;

public class Unidade {

    boolean estaLivre = true;
    int tamanho, inicio, fim;
    Unidade proximo, anterior;

    public Unidade(int tamanho) {
        this.tamanho = tamanho;
    }

    public Unidade proximaLivre(int tamanho) throws Exception {
        if(this.estaLivre){
            if (this.tamanho >= tamanho || this.proximo == null) {
                return this;
            } else {
                return this.proximo.proximaLivre(tamanho);
            }
        }else{
            throw new Exception("Não há unidade livre");
        }
    }

    public void subtair(int subtraendo) {
        this.fim = this.tamanho -1;
        
        this.tamanho = this.tamanho - subtraendo;
        if (this.tamanho == 0) {
            if(this.anterior != null)
                this.anterior.proximo = this.proximo;
            if(this.proximo != null)
                this.proximo.anterior = this.anterior;
        }
    }
}
