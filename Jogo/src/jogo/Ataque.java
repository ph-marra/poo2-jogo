package jogo;

abstract class Ataque {

    private int dano;
    private Ataque poderes;
    
    Ataque(int d){
        this.dano = d;
    }
    
    public void atacar(Personagem p) {
        p.setEnergia(p.getEnergia() - dano);
        p.requisicaoEstado();
        
        if(poderes != null) poderes.atacar(p);
    }
    
    public void adicionaPoder(PoderOfensivo poder){
        if(poderes != null) adicionaPoder((PoderOfensivo)poderes);
        else poderes = poder;
    }
    
    public int calculaDanoTotal(){
        if(poderes == null) return dano;
        else return dano + poderes.calculaDanoTotal();
    }
    
    public int getDano(){
        return dano;
    }

    public void setDano(int d) {
        this.dano = d;
    }

    public Ataque getPoderes() {
        return poderes;
    }

    public void setPoderes(Ataque poderes) {
        this.poderes = poderes;
    }
    
    public abstract String toStringType();
    
    @Override
    public String toString(){
        if(poderes == null) return this.toStringType();
        else return this.toStringType() + "\n" + poderes.toString();
    }
}
