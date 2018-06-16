package prova;

public class Main {

    public static void main(String[] args) throws Exception{
        Gerenciador gerencia = new Gerenciador(400);
        
        gerencia.alocar(100);
        gerencia.alocar(150);
        gerencia.alocar(70);
        gerencia.alocar(10);
        gerencia.desalocar(70);
        
        
        
        System.out.println("Aqui");
        
    }

}
