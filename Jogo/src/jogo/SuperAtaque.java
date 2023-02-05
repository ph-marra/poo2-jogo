package jogo;

public class SuperAtaque extends PoderOfensivo{
    
    SuperAtaque(){
        super(20);
    }
    
    @Override
    public void efeito(Personagem p) {
    }

    @Override
    public void atacar(Personagem p) {
        super.atacar(p);
        efeito(p);
    }
    
    public String toStringType(){
        return "SuperAtaque com Dano = " + super.getDano();
    }
}
