/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CIPSA
 */
public class Guerrero {

    String nombre;
    int edad;
    int fuerza;
    boolean herido;
    boolean muerto;

    public Guerrero(String nombre, int edad, int fuerza) {
        this.nombre = nombre;

        if (comprobarEdad(edad)) {
            this.edad = edad;
        } else {
            this.edad = 25;
        }

        if (comprobarFuerza(fuerza)) {
            this.fuerza = fuerza;
        } else {
            this.fuerza = 5;
        }

        this.herido = false;
        this.muerto = false;
    }

    public Guerrero() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isHerido() {
        return herido;
    }

    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public boolean retirarse() {
        return false;
    }

    public static boolean comprobarEdad(int edad) {
        boolean e = false;

        if (edad >= 15 && edad <= 60) {
            e = true;
        }

        return e;
    }

    public static boolean comprobarFuerza(int fuerza) {
        boolean f = false;

        if (fuerza >= 1 && fuerza <= 10) {
            f = true;
        }

        return f;
    }

    @Override
    public String toString() {
        String respuestah, respuestam;
        
//        if(herido)
//            respuestah="Si";
//        else
//            respuestah="No";
//        
//        if(muerto)
//            respuestam="Si";
//        else
//            respuestam="No";
        
        return "Guerrero: "+ getNombre() + "\nEdad: " + getEdad() + "  Fuerza: " + getFuerza() + 
               "\nHerido: " + isHerido() + " Muerto: " + isMuerto() +"\n";
    }
    
    

}
