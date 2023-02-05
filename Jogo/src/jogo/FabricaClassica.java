package jogo;

public class FabricaClassica extends Versao{
    @Override
    public Arma criarArma(String a){
        a = a.toLowerCase();
        
        switch(a){
            case "arcoflecha":
                return new ArcoFlecha();
            case "espada":
                return new Espada();
            case "machado":
                return new Machado();
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
            case "carroflinstone":
                return new CarroFlinstone();
            case "cavalo":
                return new Cavalo();
            case "carruagem":
                return new Carruagem();
            default:
                return null;
        }
    }
}
