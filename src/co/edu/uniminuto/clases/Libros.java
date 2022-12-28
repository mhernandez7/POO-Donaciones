
package co.edu.uniminuto.clases;

import java.util.Scanner;

/**
 *
 * @author Grupo 10
 */
public class Libros extends Persona{

    private int libros;
    private String descripcion;
    
    @Override
    public int tipoDonacion() {
    
         Scanner read = new Scanner(System.in);
         
            	System.out.println("gracias por ingresar a la seccion de "
                        + "donacion de Libros");
                System.out.println("Cuantos Libros desea donar");
		this.libros = read.nextInt();
        
        
    return this.libros;
    }

    @Override
    public String descripcionProducto() {
   String aux="";
         Scanner read = new Scanner(System.in);
        for (int i = 1; i <= this.libros; i++){
        
            System.out.println("ingrese el nombre del libro "+i);
            this.descripcion = read.next();
            aux += " ; "+ this.descripcion;
        }   
        this.descripcion = aux;
        return this.descripcion;
    }
        public String msjFinal(){
    
    String mensaje = "";
    
        return mensaje = "Gracias por su donacion, la cantidad de libros donados "
        + "fueron: "+this.libros+" y el nombre de los "
        + "libros donados es: "+this.descripcion;
}
    
    
    
}
