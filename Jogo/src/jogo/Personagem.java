package jogo;

abstract class Personagem {
    private Pulo pulo;
    private Velocidade velocidade;
    private Ataque ataque;
    private int energia;
    private Estado estado;
    private Protecao protecao;
    private Arma arma;
    private Veiculo veiculo;
    private Labirinto local;

    Personagem(){
        this.estado = new EstadoNormal(this);
        this.energia = 70;
    }
    
    public void pular(){
        pulo.pular();
    }
    
    public void correr(){
        velocidade.correr();
    }
    
    private void atacar(Personagem p){
        ataque.atacar(p);
    }
    
    public void ehAtacado(Personagem atacante){
        int dano = atacante.getAtaque().getDano();
        int resto = protecao == null ? dano : protecao.processaAtaque(dano);

        atacante.getAtaque().setDano(resto);
        atacante.atacar(this);
        atacante.getAtaque().setDano(dano);
    }
    
    public boolean estaMorto(){
        return energia == 0;
    }
    
    public void requisicaoEstado(){
        estado.mudaEstado();
    }
    
    void adicionaPoder(PoderOfensivo poder) {
        ataque.adicionaPoder(poder);
    }
    
    void adicionaProtecao(Protecao protecao){
        protecao.adicionaProtecao(protecao);
    }
    
    void adicionaArma(Arma arma){
        if(ataque != null && arma != null){
            this.arma = arma;
            this.ataque.setDano(this.ataque.getDano() + arma.getDano());
        }
    }
    
    public Pulo getPulo() {
        return pulo;
    }

    public void setPulo(Pulo pulo) {
        this.pulo = pulo;
    }

    public Velocidade getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Velocidade velocidade) {
        this.velocidade = velocidade;
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if(energia < 0) this.energia = 0;
        else if(energia > 100) this.energia = 100;
        else this.energia = energia;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public Protecao getProtecao() {
        return protecao;
    }

    public void setProtecao(Protecao protecao) {
        this.protecao = protecao;
    }
    
    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public Labirinto getLocal(){
        return local;
    }
    
    public void setLocal(Labirinto local) {
        this.local = local;
    }
    
    @Override
    public String toString(){
        String d = "\n-----------------------------------\n";
        if(this.estaMorto()) return d + estado.toString() + d;
        else return d + velocidade.toString() + d + ataque.toString() 
                + "\nDano Total = " + ataque.calculaDanoTotal() + d +
                pulo.toString() + d + "Energia: " + energia + "%" + d +
                "Estado: " + estado + "\nProtecao: " +
                (protecao != null ? protecao.toString() : "Nenhuma") + d +
                "Veiculo: " + veiculo + "\nArma: " + arma + d;
    }
}
