package jogo;

public class Aranha extends Personagem{
    public Aranha(){
        super();
        super.setAtaque(new AtaqueMedio());
        super.setVelocidade(new VeloRapido());
        super.setPulo(new PuloAlto());
        
        super.getAtaque().adicionaPoder(new Lentidao());
    }
    
    @Override
    public String toString(){
        String d = "\n################################################\n";
        return d + "\nAranha:\n" + super.toString() + d;
    }
}