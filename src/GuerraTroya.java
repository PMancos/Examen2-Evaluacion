/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CIPSA
 */
public class GuerraTroya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caballo c1=new Caballo(20);
        
        Griego g1=new Griego("Aquiles", 1, 2);
        Griego g2=new Griego("Agamenon", 1, 2);
        Griego g3=new Griego("Ajax", 1, 2);
        
        c1.montarseEnCaballo(g1);
        c1.montarseEnCaballo(g2);
        
        c1.mostrarCaballo();
        
        Griego g4=new Griego();
        
        c1.montarseEnCaballo(g4);
        
        c1.mostrarCaballo();
        
        c1.mostrarGuerreroPosicion(c1.buscarNombre("Agamenon"));
        
        c1.mostrarGuerreroPosicion(c1.buscarNombre("Odiseo"));

        Troyano t1=new Troyano("Paris", 10, 10);
  
        c1.montarseEnCaballo(t1);
 
        c1.mostrarCaballo();
        
        
    }
    
}
