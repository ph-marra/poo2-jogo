package jogo;

public class EstadoNormal extends Estado {
    
    EstadoNormal(Personagem p){
        super(p);
        super.setMaximo(70);
        super.setMinimo(30);
    }
    
    @Override
    protected void mudaEstado(){
        Personagem p = super.getP();
        
        // vai para o EstadoForte
        if(p.getEnergia() > super.getMaximo()){
            p.setAtaque(new AtaqueForte());
            p.setVelocidade(new VeloRapido());
            p.setEstado(new EstadoForte(p));
        }
        // vai para o EstadoPerigo
        else if(p.getEnergia() < 30){
            p.setAtaque(new AtaqueFraco());
            p.setVelocidade(new VeloDevagar());
            p.setEstado(new EstadoPerigo(p));
            p.getEstado().mudaEstado();
        }
    }
    
    @Override
    public String toString(){
        return "Normal (" + super.toString() + ")";
    }
}
