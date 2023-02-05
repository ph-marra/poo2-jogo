package jogo;

abstract class Estado {
    
    private Personagem p;
    private int minimo;
    private int maximo;
    
    Estado(Personagem p){
        this.p = p;
    }
    
    protected abstract void mudaEstado();

    public Personagem getP() {
        return p;
    }

    public void setP(Personagem p) {
        this.p = p;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }
    
    
    @Override
    public String toString(){
        return "Minimo = " + minimo + " e Maximo = " + maximo;
    }
}
