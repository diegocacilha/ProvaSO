package prova;

public class Main {

    public static void main(String[] args) throws Exception{
        Gerenciador gerencia = new Gerenciador(20);
        
        gerencia.alocar(1);
        gerencia.alocar(10);
        gerencia.alocar(5);
        gerencia.alocar(2);
        gerencia.alocar(2);
        gerencia.desalocar(19);
        gerencia.alocar(1);
        
        
        
        System.out.println("Aqui");
        
    }

}
