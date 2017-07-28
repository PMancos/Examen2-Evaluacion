/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CIPSA
 */
public class Griego extends Guerrero{

    public Griego(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }

    public Griego() {
        super.nombre="GriegoX";
        super.edad=20;
        super.fuerza=8;
    }

    @Override
    public boolean retirarse() {
        if(super.isHerido() & !super.isMuerto()){
            System.out.println("Griego: "+super.nombre+
                    "\nEdad: "+super.edad+"  Fuerza: "+super.fuerza+
                    "\nEsta herido -> RETIRADA");
            return true;
            
        }
        return false;
    }
    
    
    
    
}
