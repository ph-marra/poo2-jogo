package jogo;

public class Abismo extends Local{

    @Override
    public Labirinto jogar(Personagem p) {
        p.setEnergia(0);
        p.requisicaoEstado();
        
        return this;
    }
 
    @Override
    public String toString(){
        return "Abismo";
    }
}
