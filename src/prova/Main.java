package prova;

public class Main {

    public static void main(String[] args) throws Exception{
        Gerenciador gerencia = new Gerenciador(400);
        
        gerencia.firstFit(200);
        gerencia.firstFit(100);
        gerencia.firstFit(55);
        gerencia.firstFit(35);
        gerencia.desalocar(35);
        gerencia.firstFit(35);
        gerencia.desalocar(100);
        gerencia.firstFit(100);
        System.out.println("Aqui");
        
    }

}
