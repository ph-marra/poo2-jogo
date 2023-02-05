package jogo;

public class Machado extends Arma{
    
    public Machado(){
        super.setDano(12);
    }
    
    @Override
    public String toString(){
        return "Machado (Dano = " + super.getDano() + ")";
    }
}
