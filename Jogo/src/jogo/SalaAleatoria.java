package jogo;

import java.util.Random;
import java.util.Scanner;

public class SalaAleatoria extends SalaAbstrata{
    
    public SalaAleatoria(Labirinto cam1, Labirinto cam2, Personagem ini){
        setCam1(cam1);
        setCam2(cam2);
        setIni(ini);
    }
    
    public Labirinto selecionarCaminho(){
        Random r = new Random();
        
        double n = r.nextDouble(1);
        
        if(n < 0.5) return getCam1();
        else return getCam2();
    }
    
    public void lutar(Personagem p){
        Random r = new Random();
        int dado = r.nextInt(10) + 1;
        
        Personagem ini = getIni();
        
        int dano_ini = ini.getAtaque().getDano();
        ini.getAtaque().setDano(dano_ini / dado);
        p.ehAtacado(ini);
        ini.getAtaque().setDano(dano_ini);
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
        return "Sala Aleatoria com Inimigo = \n" + super.getIni().toString();
    }
}
