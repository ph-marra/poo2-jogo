package jogo;

public class RaioX extends Arma{
    
    public RaioX(){
        super.setDano(25);
    }
    
    @Override
    public String toString(){
        return "RaioX (Dano = " + super.getDano() + ")";
    }
}
