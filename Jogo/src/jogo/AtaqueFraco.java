package jogo;

public class AtaqueFraco extends Ataque {

    AtaqueFraco(){
        super(10);
    }    
    
    public String toStringType(){
        return "Ataque: Fraco\n\nDano = " + super.getDano();
    }
    
}
