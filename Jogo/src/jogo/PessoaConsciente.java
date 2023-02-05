package jogo;

public class PessoaConsciente extends Personagem{
    public PessoaConsciente(){
        super();
        super.setAtaque(new AtaqueMedio());
        super.setVelocidade(new VeloMedio());
        super.setPulo(new PuloMedio());
        
        super.setProtecao(new MascaraN95());
        
        Versao fab = new FabricaClassica();
        super.adicionaArma(fab.criarArma("bomba"));
    }
    
    @Override
    public String toString(){
        String d = "\n################################################\n";
        return d + "\nPessoaConsciente:\n" + super.toString() + d;
    }
}