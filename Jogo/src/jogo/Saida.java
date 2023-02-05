package jogo;

public class Saida extends Local{

    @Override
    public Labirinto jogar(Personagem p) {
        p.setArma(new Trofeu());
        return this;
    }
    
    @Override
    public String toString(){
        return "Saida";
    }
}
