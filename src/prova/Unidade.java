package prova;

public class Unidade {
    private boolean livre = true;
    private int tamanho;
//    private int fim;
    private Unidade proximo = null;

    public Unidade(int tamanho){
        this.tamanho = tamanho;
    }
    
    public void setProximo(int tamanho) throws Exception{
        if(this.getLivre() && tamanho <= this.tamanho) {
            this.proximo = new Unidade(tamanho);
            this.proximo.setLivre(false);
            this.tamanho = this.tamanho - tamanho;
        }else{
            throw new Exception("Tamanho disponível: "+ this.tamanho + " Tamanho pretendido: "+ tamanho);
        }
    }
    
    public int getInicio(){
        return this.tamanho - this.tamanho -1;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    

    public boolean getLivre(){
        return this.livre;
    }
    
   
    public Unidade getProximo(){
        return this.proximo;
    }
    
    public void setLivre(boolean b){
        this.livre = b;
    }
//    public Unidade proximoLivre() throws Exception{
//        if(this.proximo.getLivre()){
//            return this;
//        }else if(this.proximo != null){
//            return this.proximo.proximoLivre();
//        }else{
//            throw new Exception("Impossível adicionar próximo");
//        }
//    }
}
