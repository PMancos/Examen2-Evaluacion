/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CIPSA
 */
public class Troyano extends Guerrero{

    public Troyano(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }
    
    public Troyano(){
        super.nombre="TroyanoX";
        super.edad=18;
        super.fuerza=5;
    }
    
    @Override
    public boolean retirarse(){
        
        System.out.println("Troyano"+super.nombre+
                "\nEdad: "+super.edad+"  Fuerza: "+super.fuerza+
                "\nEsta herido -> Los Guerreros Troyanos nunca se retiran !!!");
        
        return false;
    }
    
}
