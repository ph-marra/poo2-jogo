package jogo;

public class Trofeu extends Arma {

    public Trofeu(){
        super.setDano(100);
    }
    
    @Override
    public String toString(){
        return "Trofeu (Dano = " + super.getDano() + ")";
    }
    
}
