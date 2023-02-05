package jogo;

public class Lentidao extends PoderOfensivo {

    Lentidao(){
        super(3);
    }
    
    @Override
    public void efeito(Personagem p) {
        p.setVelocidade(new VeloDevagar());
    }

    @Override
    public void atacar(Personagem p) {
        super.atacar(p);
        efeito(p);
    }

    public String toStringType(){
        return "Lentidao com Dano = " + super.getDano();
    }
}
