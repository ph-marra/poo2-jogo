package jogo;

import java.util.ArrayList;
import java.util.Random;

public class FabricaLabirinto {
    
    public Labirinto criaLabirintoAleatorio(){       
        Random r = new Random();
        double n1 = r.nextDouble(1);
        double n2 = r.nextDouble(1);
        boolean cam1ehLocal = n1 < 0.5 ? true : false;
        boolean cam2ehLocal = n2 < 0.5 ? true : false;
        
        Labirinto cam1, cam2;
        FabricaPersonagem fab = SingletonFabricaPersonagem.getInstancia();
        
        // sala possui dois caminhos locais
        if(cam1ehLocal && cam2ehLocal){
            cam1 = criaLocalAleatorio();
            cam2 = criaLocalAleatorio();

        // caso contrario, !cam1ehLocal || !cam2ehLocal  
        }else if(!cam1ehLocal){
            cam1 = criaLabirintoAleatorio();
            cam2 = criaLocalAleatorio();
        }else{
            cam1 = criaLocalAleatorio();
            cam2 = criaLabirintoAleatorio();
        }
        
        return new SalaAleatoria(cam1, cam2, fab.instanciarAleatorio());
    }
    
    public Labirinto criaLabirintoEscolha(){       
        Random r = new Random();
        double n1 = r.nextDouble(1);
        double n2 = r.nextDouble(1);
        boolean cam1ehLocal = n1 < 0.5 ? true : false;
        boolean cam2ehLocal = n2 < 0.5 ? true : false;
        
        Labirinto cam1, cam2;
        FabricaPersonagem fab = SingletonFabricaPersonagem.getInstancia();
        
        // sala possui dois caminhos locais
        if(cam1ehLocal && cam2ehLocal){
            cam1 = criaLocalAleatorio();
            cam2 = criaLocalAleatorio();

        // caso contrario, !cam1ehLocal || !cam2ehLocal  
        }else if(!cam1ehLocal){
            cam1 = criaLabirintoAleatorio();
            cam2 = criaLocalAleatorio();
        }else{
            cam1 = criaLocalAleatorio();
            cam2 = criaLabirintoAleatorio();
        }
        
        return new SalaEscolha(cam1, cam2, fab.instanciarAleatorio());
    }
    
    private Labirinto criaLocalAleatorio(){
        Random r = new Random();
        double n = r.nextDouble(1);
        
        if(n < 0.5) return new Saida();
        else return new Abismo();
    }
}
