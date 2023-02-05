package jogo;

public class Granada extends Arma{
    
    public Granada(){
        super.setDano(20);
    }
    
    @Override
    public String toString(){
        return "Granada (Dano = " + super.getDano() + ")";
    }
}
