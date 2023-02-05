package jogo;

import java.util.Random;

public class FabricaPersonagem implements FabricaAbstrataPersonagem{
    public static Random r = null;
    
    public FabricaPersonagem(){
        if(r == null) r = new Random();
    }
    
    @Override
    public Personagem criarPersonagem(String p){
        String lp = p.toLowerCase();
        
        switch(p){
            case "mago":
                return this.instanciarMago();
            case "aldeao":
                return this.instanciarAldeao();
            case "aranha":
                return this.instanciarAranha();
            case "pessoaconsciente":
                return this.instanciarPessoaConsciente();
            case "paladino":
                return this.instanciarPaladino();
            case "generico":
                return this.instanciarGenerico();
            default:
                return null;
        }
    }
    
    @Override
    public Personagem criarPersonagem(String p, String[] protecoes){
        Personagem personagem = criarPersonagem(p);
        String lp;
        
        String rotulos[] = {"mascaran95", "escudo", "protecaocouro", "armadura"};
        
        for(String protecao : protecoes){
            lp = protecao.toLowerCase();
            
            switch(lp){
                case "mascaran95":
                    personagem.adicionaProtecao(new MascaraN95());
                case "escudo":
                    personagem.adicionaProtecao(new Escudo());
                case "protecaocouro":
                    personagem.adicionaProtecao(new ProtecaoCouro());
                case "armadura":
                    personagem.adicionaProtecao(new MascaraN95());
            }
        }
        
        return personagem;
    }
    
    public Personagem instanciarAleatorio(){
        double n = r.nextDouble(1);
        Personagem p;
        
        
        if(n < 0.2) return instanciarMago();
        else if(n < 0.4) return instanciarPaladino();  
        else if(n < 0.6) return instanciarAldeao();
        else if(n < 0.8) return instanciarAranha();
        else return instanciarPessoaConsciente();
            
    }
    
    private Personagem instanciarGenerico(){
        return new Generico();
    }

    private Personagem instanciarMago() {
        return new Mago();
    }

    private Personagem instanciarPaladino() {
        return new Paladino();
    }

    private Personagem instanciarAldeao() {
        return new Aldeao();
    }

    private Personagem instanciarAranha() {
        return new Aranha();
    }

    private Personagem instanciarPessoaConsciente() {
        return new PessoaConsciente();
    }
}
