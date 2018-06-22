package prova;

public class Gerenciador {
    Unidade unidadeReferencia;
    
    public Gerenciador(int tamanho){
        this.unidadeReferencia = new Unidade(tamanho);
        this.unidadeReferencia.inicio = 0;
    }/**
     * Aloca uma unidade com o tamanho desejado caso possível.
     * @param tamanho Tamanho desejado a ser alocado
     */
    public void alocar(int tamanho){
        try {
            /*
                Fiz isso aqui pra colocar o primeiro nó na variável unidadeReferencia.
                Pois o desalocar sempre deve iniciar no primeiro item da lista
            */
            this.unidadeReferencia = this.unidadeReferencia.getPrimeiroDaLista();
            /*
            Pega a próxima unidade livre
            */
            Unidade temp = this.unidadeReferencia.getProximoLivre(tamanho);
            //adiciona uma nova unidade a unidade livre. 
            //Caso não encontre uma undade livre, entra no catch e nem vai para essa linha a seguir.
            temp.addUnidade(new Unidade(tamanho));
            
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
    /**
     * Desaloca a unidade desejada informando o início dela.
     * @param inicio 
     */
    public void desalocar(int inicio) {
        try {
            /*
                Fiz isso aqui pra colocar o primeiro nó na variável unidadeReferencia.
                Pois o desalocar sempre deve iniciar no primeiro item da lista
            */
            this.unidadeReferencia = this.unidadeReferencia.getPrimeiroDaLista();
            this.unidadeReferencia.desalocar(inicio);
        } catch (Exception e) {
            System.out.println("Erro ao desalocar: " + e);
        }
    }
    
}

