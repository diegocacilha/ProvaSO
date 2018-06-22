package prova;

public class Unidade {

    boolean estaLivre = true;
    int tamanho, inicio;
    Unidade proximo, anterior;

    public Unidade(int tamanho) {
        this.tamanho = tamanho;
        this.inicio = 0;
    }
    @Override
    public String toString(){
        String str;
        str = " Livre: " + this.estaLivre;
        str += " Tamanho: " + this.tamanho;
        str += " Início: " + this.inicio;
//        str += " Anterior: " + this.anterior == null;
//        str += " Próximo: " + this.proximo == null;
        return str;
    }
    /**
     * Executa o toString recursivamente de toda a lista duplamente encadeada
     */
    public void show(){
        System.out.println(this.toString());
        
        if(this.proximo != null){
            this.proximo.show();
        }
    }
    /**
     * Tenta localizar a unidade que inicia no valor informado.
     * 
     * @param inicio Início a ser localizado
     * @return Unidade
     * @throws Exception Posição não encontrada
     */
    private Unidade getPosicao(int inicio) throws Exception{
        if(this.inicio == inicio){
            return this;
        }else if(this.proximo != null){
            return this.proximo.getPosicao(inicio);
        }
        throw new Exception("Posição não encontrada");
    }
    /**
     * Retorna verdade caso tenha anterior e falso se não tiver anterior.
     * @return boolean
     */
    private boolean possuiAnterior(){
        return this.anterior != null;
    }
    /**
     * Retorna verdade caso tenha próximo e falso se não tiver próximo.
     * @return boolean
     */
    private boolean possuiProximo(){
        return this.proximo != null;
    }

    public void desalocar(int inicio) throws Exception{
        Unidade temp = this.getPosicao(inicio);
        
        temp.estaLivre = true;
        if(temp.possuiAnterior() && temp.anterior.estaLivre){
            temp.anterior.tamanho += temp.tamanho;
            temp.anterior.proximo = temp.possuiProximo() ? temp.proximo : null;
        }
        if(temp.possuiProximo() && temp.proximo.estaLivre){
            temp.tamanho += temp.proximo.tamanho;
            temp.proximo = temp.proximo.possuiProximo() ? null : temp.proximo.proximo;
        }
    }

    /**
     * Adiciona uma Unidade no Próximo
     * @param uni Unidade a ser alocada
     * @throws Exception Não for livre e tamanho de this for menor ao desejado
     */
    public void addUnidade(Unidade uni) throws Exception {
        if (this.estaLivre) {
            /*
            se o tamanho da minha unidade livre for igual ao que eu quero alocar, 
            então não precisa fazer nada com o próximo e nem com o anterior.
            Apenas seta-la como ocupada.
            */
            if (this.tamanho == uni.tamanho) {
                this.estaLivre = false;
            } 
            else if(this.tamanho >= uni.tamanho){
                this.tamanho -= uni.tamanho;
                uni.inicio = this.inicio + this.tamanho;
                uni.estaLivre = false;
                
                uni.proximo = this.proximo;
                uni.anterior = this;
                if(uni.possuiProximo()){
                    uni.proximo.anterior = uni;
                }
                this.proximo = uni;
            }
            else{
                throw new Exception("Unidade com apenas " + this.tamanho + " de espaço livre.");
            }
        } else {
            throw new Exception("Está unidade não está livre");
        }
    }

    /**
     * Retorna a primeira unidade livre
     * 
     * @param tamanho Tamanho a ser alocado
     * @return Unidade
     * @throws Exception Tamanho livre não 
     */
    public Unidade getProximoLivre(int tamanho) throws Exception {
        if (this.estaLivre && this.tamanho >= tamanho) {
            return this;
        } else if(this.proximo != null){
            return this.proximo.getProximoLivre(tamanho);
        } else {
            throw new Exception("Não há espaço disponível");
        }
    }
    /**
     * Chama em recursão todos os anteriores. Quando o anterior for nulo, retorna o this.
     * @return Unidade
     * @throws Exception Lança caso anterior seja diferente de nulo e igual
     */
    public Unidade getPrimeiroDaLista() throws Exception{
        if(this.anterior != null){
            return this.anterior.getPrimeiroDaLista();
        }else if(this.anterior == null){
            return this;
        }else{
            throw new Exception("Loucura total!");//só vai entrar aqui se algo der muito errado.
        }
    }
}