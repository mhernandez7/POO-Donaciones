
package co.edu.uniminuto.clases;

import co.edu.uniminuto.interfaces.IDonacion;
import java.util.Scanner;

/**
 *
 * @author Grupo 10
 */
public abstract class Persona implements IDonacion {
    
    protected String nombre;
    protected String contacto;
 
    public Persona() { 
    }
  
    public void registroPersona(){
        Scanner read =  new Scanner(System.in);
        Scanner read1 =  new Scanner(System.in);
        
            System.out.print("Por favor escriba su nombre seguido de enter: ");
            this.nombre = read.next();
            
            System.out.print("Por favor ingrese su CEL seguido de enter: ");
            this.contacto = read1.next();     
    }  

    @Override
    public String toString() {
        return "DONANTE{" + "Nombre= " + nombre + ", Contacto= " + contacto + '}';
    }
    
    
     }
     
  
    
    
    
