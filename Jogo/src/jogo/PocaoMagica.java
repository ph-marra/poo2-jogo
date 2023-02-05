package jogo;

public class PocaoMagica extends PoderOfensivo{
    
    PocaoMagica(){
        super(10);
    }
    
    @Override
    public void efeito(Personagem p) {
        p.setAtaque(new AtaqueFraco());
    }

    @Override
    public void atacar(Personagem p) {
        super.atacar(p);
        efeito(p);
    }
    
    public String toStringType(){
        return "PocaoMágica com Dano = " + super.getDano();
    }
}
