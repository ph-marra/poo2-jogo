package jogo;

public class EstadoPerigo extends Estado {
    
    EstadoPerigo(Personagem p){
        super(p);
        super.setMaximo(29);
        super.setMinimo(1);
    }

    @Override
    protected void mudaEstado(){
        Personagem p = super.getP();
        
        // vai para o EstadoMorto
        if(p.getEnergia() < super.getMinimo()){
            p.setEnergia(0);
            p.setEstado(new EstadoMorto(p));
        }
        // vai para o EstadoNormal
        else if(p.getEnergia() > super.getMaximo()){
            p.setAtaque(new AtaqueMedio());
            p.setVelocidade(new VeloMedio());
            p.setEstado(new EstadoNormal(p));
        }
    }
    
    @Override
    public String toString(){
        return "Perigo (" + super.toString() + ")";
    }
}
