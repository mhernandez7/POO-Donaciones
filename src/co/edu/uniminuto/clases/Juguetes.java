
package co.edu.uniminuto.clases;

import java.util.Scanner;

/**
 *
 * @author Grupo 10
 */
public class Juguetes extends Persona {
    
    private int juguetes ;
    private String descripcion;
    
    @Override
    public int tipoDonacion() {
        Scanner read = new Scanner(System.in);
       
            	System.out.println("gracias por ingresar a la seccion de "
                        + "donacion de juguetes");
                System.out.println("Cuantos juguetes desea donar");
		this.juguetes = read.nextInt();
        
        
    return this.juguetes;
    }

    @Override
    public String descripcionProducto() {
       String aux="";
         Scanner read = new Scanner(System.in);
        for (int i = 1; i <= this.juguetes; i++){
        
            System.out.println("ingrese el nombre del juguete "+i);
            this.descripcion = read.next();
            aux += " ; "+ this.descripcion;
        }   
        this.descripcion = aux;
        return this.descripcion;
    }

    public String msjFinal(){
    
    String mensaje = "";
    
        return mensaje = "Gracias por su donacion, la cantidad de juguetes donados "
        + "fueron: "+this.juguetes+" y la descripcion de los "
        + "juguetes donados es: "+this.descripcion;
}
    
    
}
