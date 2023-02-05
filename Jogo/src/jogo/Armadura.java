package jogo;

public class Armadura extends Protecao{
    
    Armadura(){
        super.setValorProtecao(15);
    }
    
    @Override
    public String toString(){
        String str = "Armadura (" + super.getValorProtecao() + ") ";
        
        if(super.getSucessor() != null)
            str = str.concat(super.getSucessor().toString());
        
        return str;
    }
}
