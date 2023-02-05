package jogo;

public class EstadoForte extends Estado {
    
    EstadoForte(Personagem p){
        super(p);
        super.setMaximo(100);
        super.setMinimo(71);
    }
    
    @Override
    protected void mudaEstado(){
        Personagem p = super.getP();
        
        // vai para o EstadoNormal
        if(p.getEnergia() < super.getMinimo()){
            p.setAtaque(new AtaqueMedio());
            p.setVelocidade(new VeloMedio());
            p.setEstado(new EstadoNormal(p));
            p.getEstado().mudaEstado();
        }
    }
    
    @Override
    public String toString(){
        return "Forte (" + super.toString() + ")";
    }
}
