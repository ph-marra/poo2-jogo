package jogo;

abstract class Protecao {
    
    private Protecao sucessor;
    private int valorProtecao;
    
    public int processaAtaque(int dano){
        int resto = dano - valorProtecao;
        
        if(resto > 0 && getSucessor() != null)
            return getSucessor().processaAtaque(resto);
        else if(resto <= 0) return 0;
        else return resto;        
    }
    
    public void adicionaProtecao(Protecao protecao){
        if(sucessor != null) adicionaProtecao(protecao);
        else sucessor = protecao;
    }

    public Protecao getSucessor() {
        return sucessor;
    }

    public void setSucessor(Protecao sucessor) {
        this.sucessor = sucessor;
    }

    public int getValorProtecao() {
        return valorProtecao;
    }

    public void setValorProtecao(int valorProtecao) {
        this.valorProtecao = valorProtecao;
    }
}
