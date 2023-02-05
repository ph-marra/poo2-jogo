package jogo;

public class Espada extends Arma{

    public Espada(){
        super.setDano(15);
    }
    
    @Override
    public String toString(){
        return "Espada (Dano = " + super.getDano() + ")";
    }
}
