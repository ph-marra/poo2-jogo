package jogo;

public class MascaraN95 extends Protecao {

    public MascaraN95() {
        super.setValorProtecao(30);
    }
    
    @Override
    public String toString(){
        String str = "MascaraN95 (" + super.getValorProtecao() + ") ";
        
        if(super.getSucessor() != null)
            str = str.concat(super.getSucessor().toString());
        
        return str;
    }
}
