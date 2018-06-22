package prova;

public class Main {

    public static void main(String[] args) throws Exception{
        Gerenciador gerencia = new Gerenciador(20);
        
        gerencia.alocar(1);
        System.out.println("=====================");
        gerencia.alocar(10);
        System.out.println("=====================");
        gerencia.alocar(5);
        System.out.println("=====================");
        gerencia.alocar(4);
        System.out.println("=====================");
        gerencia.desalocar(4);
        System.out.println("=====================");
        gerencia.desalocar(9);
   
    }

}
