package jogo;

public class Aldeao extends Personagem{
    public Aldeao(){
        super();
        super.setAtaque(new AtaqueFraco());
        super.setPulo(new PuloMedio());
        super.setVelocidade(new VeloMedio());
        
        Protecao prot = new ProtecaoCouro();
        
        super.setProtecao(prot);
        
        Versao fab = new FabricaClassica();
        super.adicionaArma(fab.criarArma("machado"));
        super.setVeiculo(fab.criarVeiculo("carroflinstone"));
    }
    
    @Override
    public String toString(){
        String d = "\n################################################\n";
        return d + "\nAldeao:\n" + super.toString() + d;
    }
}

