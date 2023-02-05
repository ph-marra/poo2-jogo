package jogo;

public class SingletonFabricaProtecao {
    private static FabricaProtecao instancia = null;
    
    public SingletonFabricaProtecao(){
        super();
    }
    
    public static synchronized FabricaProtecao getInstancia(){
        if(instancia == null) instancia = new FabricaProtecao();
        
        return instancia;
    }
}
