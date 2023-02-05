package jogo;

public class Personagem03 extends Personagem {
    
    Personagem03(){
        super();
        super.setPulo(new PuloBaixo());
        super.setVelocidade(new VeloRapido());
        super.setAtaque(new AtaqueForte());
        
        Protecao protecao = new ProtecaoCouro();
        protecao.setSucessor(new MascaraN95());
        super.setProtecao(protecao);
    }
    
    @Override
    public String toString(){
        String d = "\n################################################\n";
        return d + "\nPersonagem03:\n" + super.toString() + d;
    }
}
