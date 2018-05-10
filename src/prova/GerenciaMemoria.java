package prova;

import java.awt.Menu;

public class GerenciaMemoria {
    private Memoria mem;
    public byte b = 1;
    
    public GerenciaMemoria(int mem){
        System.out.println(b);
        try {
            this.mem = new Memoria(mem);
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
