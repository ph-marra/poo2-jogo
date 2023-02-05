package jogo;

public class Mago extends Personagem{
    public Mago(){
        super();
        super.setAtaque(new AtaqueMedio());
        super.setVelocidade(new VeloRapido());
        super.setPulo(new PuloAlto());
        
        super.getAtaque().adicionaPoder(new PocaoMagica());
        
        super.setVeiculo(new Propulsor());
    }
    
    @Override
    public String toString(){
        String d = "\n################################################\n";
        return d + "\nMago:\n" + super.toString() + d;
    }
}
