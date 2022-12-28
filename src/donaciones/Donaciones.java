
package donaciones;

import co.edu.uniminuto.clases.Juguetes;
import co.edu.uniminuto.clases.Libros;
import co.edu.uniminuto.clases.Ropa;
import java.util.Scanner;
/**
 *
 * @author Grupo 10
 */
public class Donaciones {

    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
      int opcion =0;
      System.out.println("Bienvenido a donaciones Barrio Sierra Morena");
      System.out.println("1. Donar Juguetes");
      System.out.println("2. Donar Libros");
      System.out.println("3. Donar Ropa");
      opcion = read.nextInt();
      
       if(opcion == 1){
         Juguetes();
     }else 
        if(opcion == 2){
        Libros();
        }
        else if(opcion == 3){
        Ropa();
        }
        else{
        System.out.println("Opcion incorrecta, vuelva a ingresar");
        }
    }

     public static void Juguetes(){
     Juguetes juguete = new Juguetes();
    
     juguete.registroPersona();
     juguete.tipoDonacion();
     juguete.descripcionProducto();
     System.out.println(juguete.toString());
     System.out.println(juguete.msjFinal());
     
     }
     
     public static void Libros(){
     
     Libros libros = new Libros();
  
     libros.registroPersona();
     libros.tipoDonacion();
     libros.descripcionProducto();
     System.out.println(libros.toString());
     System.out.println(libros.msjFinal());
  
     }
     public static void Ropa(){
     Ropa ropa = new Ropa();
    
     ropa.registroPersona();
     ropa.tipoDonacion();
     ropa.descripcionProducto();
     System.out.println(ropa.toString());
     System.out.println(ropa.msjFinal()); 
     
     
     }
    
    
}
