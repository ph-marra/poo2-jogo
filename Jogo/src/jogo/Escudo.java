package jogo;

public class Escudo extends Protecao{
   
   Escudo(){
       super.setValorProtecao(10);
   }
   
    @Override
    public String toString(){
        String str = "Escudo (" + super.getValorProtecao() + ") ";
        
        if(super.getSucessor() != null)
            str = str.concat(super.getSucessor().toString());
        
        return str;
    }
}
