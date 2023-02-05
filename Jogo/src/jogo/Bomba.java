package jogo;

public class Bomba extends Arma{
    
    public Bomba(){
        super.setDano(35);
    }
    
    @Override
    public String toString(){
        return "Bomba (Dano = " + super.getDano() + ")";
    }
}
