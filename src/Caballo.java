/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CIPSA
 */
public class Caballo {

    private int capacidad;
    private int ocupacion;
    Guerrero[] ocupantes;

    public Caballo(int capacidad) {
        ocupantes=new Guerrero[capacidad];
    }

    public int buscarNombre(String nombre) {
        boolean encontrado = false;
        int posicion = -1;
        int contador = 0;

        while (!encontrado && contador<ocupacion) {
            if (nombre.equalsIgnoreCase(ocupantes[contador].getNombre())) {
                posicion = contador;
                encontrado = true;
                
            } else {
                
                contador++;
            }
        
        }
        if(!encontrado)
                System.out.println("No hay ningun guerrero con el nombre "+nombre+"\n");
        return posicion;
    }

    public void mostrarGuerreroPosicion(int pos) {
        if (pos>0 && pos <= ocupacion ) {
            System.out.println(ocupantes[pos].toString());
        } else {
            System.out.println("Esta operacion no es posible\n");
        }
    }

    public void montarseEnCaballo(Guerrero g) {
        int contador=getOcupacion();
        boolean encontrado = false;
        
        while (!encontrado || ocupacion < capacidad) {
            
            if (g instanceof Griego) {
                System.out.println("Guerrero Griego " + g.getNombre() + " montado en caballo\n");
                
                ocupantes[contador]=g;
                contador++;
                setOcupacion(contador);
                encontrado = true;

            }
            if (g instanceof Troyano) {
                System.out.println("Atención!!!\n"
                        + "Guerrero Troyano " + g.getNombre() + " intentando acceder al caballo!!!\nMatarlo\n");
                g.isMuerto();
                encontrado = true;
            }

        }

    }

    public void mostrarCaballo() {
        int contador=0;
        
        
        while(contador<ocupacion){
            if (ocupacion > 0) {
                System.out.println(ocupantes[contador]);
                contador++;
            } else {
                System.out.println("El caballo esta vacio");
            }
        }
    
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(int ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    
}
