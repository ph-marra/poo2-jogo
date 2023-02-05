package jogo;

public class EstadoMorto extends Estado {
    
    EstadoMorto(Personagem p){
        super(p);
        super.setMaximo(0);
        super.setMinimo(0);
    }
    
    @Override
    protected void mudaEstado(){
    }
    
    @Override
    public String toString(){
        return "Morto (Maximo = " + super.getMaximo() + ")";
    }
}
