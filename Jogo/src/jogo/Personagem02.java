package jogo;

public class Personagem02 extends Personagem {
    
    Personagem02(){
        super();
        super.setPulo(new PuloAlto());
        super.setVelocidade(new VeloRapido());
        super.setAtaque(new AtaqueMedio());
        super.adicionaPoder(new PocaoMagica());
        
        Protecao protecao = new ProtecaoCouro();
        super.setProtecao(protecao);
    }
    
    @Override
    public String toString(){
        String d = "\n################################################\n";
        return d + "\nPersonagem02:\n" + super.toString() + d;
    }
}
