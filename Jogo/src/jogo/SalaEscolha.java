package jogo;

import java.util.Random;
import java.util.Scanner;

public class SalaEscolha extends SalaAbstrata{
    
    public SalaEscolha(Labirinto cam1, Labirinto cam2, Personagem ini){
        setCam1(cam1);
        setCam2(cam2);
        setIni(ini);
    }
    
    public Labirinto selecionarCaminho(){
        int escolha = 0;
        Scanner s = new Scanner(System.in);
        
        while(escolha <= 0 || escolha >= 3){
            System.out.print("Escolha um caminho:\n\n[1] - Esquedo!\n[2] - Direito!\n\nEscolha: ");
            escolha = s.nextInt();
        }
        
        if(escolha == 1) return getCam1();
        else return getCam2();
    }
    
    public void lutar(Personagem p){
        Random r = new Random();
        int dado = r.nextInt(10) + 1;
        
        int escolha = 0;
        Scanner s = new Scanner(System.in);
        
        while(escolha <= 0 || escolha >= 11){
            System.out.print("Escolha um numero de 1 a 10: ");
            escolha = s.nextInt();
        }
        
        Personagem ini = getIni();
        
        if(dado == escolha){
            ini.setEstado(new EstadoMorto(ini));
        }else{
            int dano_ini = ini.getAtaque().getDano();
            ini.getAtaque().setDano(dano_ini / dado);
            p.ehAtacado(ini);
            ini.getAtaque().setDano(dano_ini);
        }
    }
    
    public Labirinto getCam1(){
        return super.getCam1();
    }
    
    public void setCam1(Labirinto cam1) {
        super.setCam1(cam1);
    }
    
    public Labirinto getCam2(){
        return super.getCam2();
    }
    
    public void setCam2(Labirinto cam2) {
        super.setCam2(cam2);
    }
    
    public Personagem getIni(){
        return super.getIni();
    }
    
    public void setIni(Personagem ini) {
        super.setIni(ini);
    }
    
    @Override
    public String toString(){
        return "Sala Escolha com Inimigo = \n" + super.getIni().toString();
    }
}
