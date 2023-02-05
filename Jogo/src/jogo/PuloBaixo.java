package jogo;

public class PuloBaixo implements Pulo {

    @Override
    public void pular() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String toString(){
        return "Pulo: Baixo";
    }
}
