package jogo;

public class Paladino extends Personagem{
    public Paladino(){
        super();
        super.setAtaque(new AtaqueForte());
        super.setVelocidade(new VeloDevagar());
        super.setPulo(new PuloBaixo());
        
        super.getAtaque().adicionaPoder(new SuperAtaque());
        
        Protecao prot = new ProtecaoCouro();
        prot.setSucessor(new Armadura());
        prot.setSucessor(new Escudo());
        
        super.setProtecao(prot);
        
        Versao fab = new FabricaClassica();
        super.adicionaArma(fab.criarArma("espada"));
        super.setVeiculo(fab.criarVeiculo("cavalo"));
    }
    
    @Override
    public String toString(){
        String d = "\n################################################\n";
        return d + "\nPaladino:\n" + super.toString() + d;
    }
}