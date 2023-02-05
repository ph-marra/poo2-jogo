package jogo;

public class Generico extends Personagem{
    
    public Generico(){
        super();
        super.setPulo(new PuloMedio());
        super.setVelocidade(new VeloMedio());
        super.setAtaque(new AtaqueMedio());
    }
    
    @Override
    public String toString(){
        String d = "\n################################################\n";
        return d + "\nGenerico:\n" + super.toString() + d;
    }
}
