package jogo;

public class VeloMedio implements Velocidade{

    @Override
    public void correr() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String toString(){
        return "Correr (velocidade) = Medio";
    }
}
