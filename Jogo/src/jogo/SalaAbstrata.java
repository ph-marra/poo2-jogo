package jogo;

public abstract class SalaAbstrata implements Labirinto{
    private Labirinto cam1, cam2;
    private Personagem ini;
    
    @Override
    public final Labirinto jogar(Personagem p){
          Labirinto escolhido = selecionarCaminho();
          lutar(p);
          if(!p.estaMorto())
              return escolhido.jogar(p);
          else
              return this;
          
    }
    
    public abstract Labirinto selecionarCaminho();
    
    public abstract void lutar(Personagem p);
    
    public Labirinto getCam1(){
        return cam1;
    }
    
    public void setCam1(Labirinto cam1) {
        this.cam1 = cam1;
    }
    
    public Labirinto getCam2(){
        return cam2;
    }
    
    public void setCam2(Labirinto cam2) {
        this.cam2 = cam2;
    }
    
    public Personagem getIni(){
        return ini;
    }
    
    public void setIni(Personagem ini) {
        this.ini = ini;
    }
    
    @Override
    public String toString(){
        return "Sala com Inimigo = \n" + ini.toString();
    }
}
