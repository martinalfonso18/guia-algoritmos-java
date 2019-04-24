/*
perdir que se ingrese un apellido. el programa debera controlar que no 
ocurra un error comun que es repetir la primera letra.
cuando ocurra debera responder con un mensaje de error. solo no se considerarar error cuando la letra repetida sea una L
*/
package primerproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Riva
 */
public class problema1 {
    public static void main(String[] args){
        String apellido;
        
        apellido=JOptionPane.showInputDialog("Ingrese apellido");
        //System.out.println(apellido.toUpperCase().charAt(2)+""+apellido.toLowerCase().charAt(2)); //pP; charAt tiene que ir al final(sino no funcion con la clase String) 
        if (apellido.charAt(0)==apellido.charAt(1)){
            if(apellido.toUpperCase().charAt(1)!='L'){
                System.out.println("ERROR");
            }   
        }
        else{
                System.out.println("Apellido aceptado: "+apellido);
            }    
    }   
}
