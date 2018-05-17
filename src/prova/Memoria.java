package prova;

public class Memoria {
    private Unidade livre;
    
    public Memoria(int tamanho){
        this.livre = new Unidade(tamanho);
    }
    
    public void alocar(int tamanho){
        //this.livre = this.livre - tamanho; 
    }
    
}
