package jogo;

public class FabricaModerna extends Versao{
    @Override
    public Arma criarArma(String a){
        a = a.toLowerCase();
        
        switch(a){
            case "granada":
                return new Granada();
            case "raiox":
                return new RaioX();
            case "bomba":
                return new Bomba();
            case "trofeu":
                return new Trofeu();
            default:
                return null;
        }
    }
    
    @Override
    public Veiculo criarVeiculo(String v){
        v = v.toLowerCase();
        
        switch(v){
            case "blindado":
                return new Blindado();
            case "propulsor":
                return new Propulsor();
            case "jetSki":
                return new JetSki();
            default:
                return null;
        }
    }
}
