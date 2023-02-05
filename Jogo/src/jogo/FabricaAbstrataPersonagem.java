package jogo;

import java.util.Random;

public interface FabricaAbstrataPersonagem {
    public static void jogar(){
        String d = "################################################\n";
        
        Personagem p = (new FabricaPersonagem()).instanciarAleatorio();
        
        System.out.println("Jogador escolhido aleatoriamente =");
        System.out.println(p);
        
        System.out.println("Comeco do Labirinto:\n\n" + d);
        
        Labirinto l = (new FabricaLabirinto()).criaLabirintoAleatorio();
        p.setLocal(l);
        
        Random r = new Random();
        
        System.out.println(p.getLocal());
        
        while(!(p.getLocal() instanceof Local)){
            p.ehAtacado(((SalaAbstrata)p.getLocal()).getIni());
            if(p.estaMorto()) {
                System.out.println("Personagem MORTO!");
                break;
            }else{
                System.out.println("Energia do Personagem = " + p.getEnergia());
            }
            
            if(r.nextDouble(1) < 0.5){
                if(p.getLocal() instanceof SalaAbstrata)
                    p.setLocal(((SalaAbstrata)p.getLocal()).getCam1());
            }
            else{
                if(p.getLocal() instanceof SalaAbstrata)
                    p.setLocal(((SalaAbstrata)p.getLocal()).getCam2());
            }
            
            System.out.println(p.getLocal());
        }
        
        p.getLocal().jogar(p);
    }
    
    public abstract Personagem criarPersonagem(String p);
    
    public abstract Personagem criarPersonagem(String p, String[] protecoes);
}
