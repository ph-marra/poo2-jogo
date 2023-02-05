package jogo;

public abstract class Arma {
    private int dano;
    
    public int getDano(){
        return dano;
    }

    public void setDano(int d) {
        this.dano = d;
    }
}
