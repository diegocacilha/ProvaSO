package prova;

public class Main {

    public static void main(String[] args) throws Exception{
        Gerenciador gerencia = new Gerenciador(400);
        
        gerencia.alocar(200);
        gerencia.alocar(200);
        
        
        System.out.println("Aqui");
        
    }

}
