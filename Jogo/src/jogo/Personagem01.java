package jogo;

public class Personagem01 extends Personagem {
    
    Personagem01(){
        super();
        super.setPulo(new PuloMedio());
        super.setVelocidade(new VeloMedio());
        
        super.setAtaque(new AtaqueForte());
        super.adicionaPoder(new Lentidao());
        
        Protecao protecao = new Armadura();
        protecao.setSucessor(new ProtecaoCouro());
        super.setProtecao(protecao);
    }
    
    @Override
    public String toString(){
        String d = "\n################################################\n";
        return d + "\nPersonagem01:\n" + super.toString() + d;
    }
}
