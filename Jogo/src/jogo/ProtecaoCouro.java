package jogo;

public class ProtecaoCouro extends Protecao{
    
    ProtecaoCouro(){
        super.setValorProtecao(5);
    }
    
    @Override
    public String toString(){
        String str = "ProtecaoCouro (" + super.getValorProtecao() + ") ";
        
        if(super.getSucessor() != null)
            str = str.concat(super.getSucessor().toString());
        
        return str;
    }
}
