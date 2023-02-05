package jogo;

public class FabricaProtecao {
    
    public Protecao instanciarCompleta(){
        
        Protecao p = new ProtecaoCouro();
        p.setSucessor(new Armadura());
        p.setSucessor(new Escudo());
        p.setSucessor(new MascaraN95());
        
        
        return p;
    }
    
    public Protecao instanciarArmadura(){
        Protecao p = new Armadura();
        p.setSucessor(new ProtecaoCouro());
        
        return p;
    }
    
    public Protecao instanciarCovid(){
        Protecao p = new Escudo();
        p.setSucessor(new MascaraN95());
        
        return p;
    }
}
