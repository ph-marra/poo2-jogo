package jogo;

public abstract class PoderOfensivo extends Ataque {

    PoderOfensivo(int d){
        super(d);
    }

    @Override
    public void atacar(Personagem p){
        super.atacar(p);
    }
    
    public abstract void efeito(Personagem p);
}
