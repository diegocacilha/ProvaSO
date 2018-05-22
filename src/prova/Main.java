package prova;

public class Main {

    public static void main(String[] args) {
        Gerenciador mem = new Gerenciador(1024);

        try {
            mem.alocarProximoLivre(400);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            mem.alocarProximoLivre(524);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            mem.alocarProximoLivre(100);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("");
    }

}
