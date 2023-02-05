package jogo;

public class ArcoFlecha extends Arma{
    
    public ArcoFlecha(){
        super.setDano(10);
    }
    
    @Override
    public String toString(){
        return "ArcoFlecha (Dano = " + super.getDano() + ")";
    }
}
