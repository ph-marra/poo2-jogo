package jogo;

public class SingletonFabricaPersonagem {
    private static FabricaPersonagem instancia = null;
    
    public SingletonFabricaPersonagem(){
        super();
    }
    
    public static synchronized FabricaPersonagem getInstancia(){
        if(instancia == null) instancia = new FabricaPersonagem();
        
        return instancia;
    }
}
