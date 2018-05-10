package prova;

public class Memoria {
    final private int tamanho;
    
    public Memoria(int tamanho) throws Exception{
        if((tamanho % 8) != 0) throw new Exception("O tamanho da memória deve ser multiplo de 8");
        
        this.tamanho = tamanho;
    }
    
    public void alocar(){
        
    }
    
}
