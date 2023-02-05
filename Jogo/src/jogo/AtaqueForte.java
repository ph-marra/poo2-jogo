package jogo;

public class AtaqueForte extends Ataque {

    AtaqueForte(){
        super(30);
    }
    
    public String toStringType(){
        return "Ataque: Forte\n\nDano = " + super.getDano();
    }
    
}
