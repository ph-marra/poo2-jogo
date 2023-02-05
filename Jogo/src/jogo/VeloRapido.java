package jogo;

public class VeloRapido implements Velocidade {

    @Override
    public void correr() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String toString(){
        return "Correr (velocidade) = Rapido";
    }
}
