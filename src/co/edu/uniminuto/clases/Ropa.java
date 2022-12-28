
package co.edu.uniminuto.clases;

import java.util.Scanner;

/**
 *
 * @author Grupo 10
 */
public class Ropa extends Persona {

   private int ropa;
   private String descripcion;
    @Override
    public int tipoDonacion() {
 Scanner read = new Scanner(System.in);
        
            	System.out.println("Gracias por ingresar a la seccion de "
                        + "Donacion de ropa");
                System.out.println("Cuantos Prendas desea donar");
		this.ropa = read.nextInt();
        
        
    return this.ropa;
       }

    @Override
    public String descripcionProducto() {
   String aux="";
         Scanner read = new Scanner(System.in);
        for (int i = 1; i <= this.ropa; i++){
        
            System.out.println("ingrese el nombre de la prenda donada "+i);
            this.descripcion = read.next();
            aux += " ; "+ this.descripcion;
        }   
        this.descripcion = aux;
        return this.descripcion;
    }
    
    public String msjFinal(){
    
    String mensaje = "";
    
        return mensaje = "Gracias por su donacion, la cantidad de ropa donada "
        + "fueron: "+this.ropa+" y la descripcion de la "
        + "ropa donada es: "+this.descripcion;
}
    
}
