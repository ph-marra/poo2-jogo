package jogo;

public class AtaqueMedio extends Ataque {

    AtaqueMedio(){
        super(20);
    }
    
    public String toStringType(){
        return "Ataque: Medio\n\nDano = " + super.getDano();
    }
    
}
