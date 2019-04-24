/*
   Ejercicio Prog2: 
1. Cree una clase con las siguientes características:
    a). atributos: alfa, numérico entero, privado; beta, String, público.
    b). Constructores: uno sin parámetros, uno con uno y otro con dos parámetros.
    c). Métodos:
        i) Uno modificador del valor de alfa(recibiendo el valor como parámetro);
        ii) Un método que devuelva el valor de alfa;
        iii) Un método que reciba el valor de beta, y lo devuelva convertido a mayúsculas.
        iv) Un método que muestre los valores de ambos atributos acompañados de una frase que explique su significado.
2. En el programa ejecutable, (que puede estar o no en el mismo archivo de la nueva clase),
permita el ingreso de los valores de alfa y beta, 
y utilizando el constructor con ambos parámetros, cree un objeto nuevo.
3. Luego, con ese objeto, utilice los cuatro métodos definidos y muestre en pantalla, los resultados obtenidos de cada uno.
 */
package arquitectos;
import javax.swing.JOptionPane;
public class Clase1 {
    //atributos
    private int alfa;
    public String beta;
    
    
    /*
    Los constructores se definen en la clase, pueden ser de varios tipos, 
    pueden pedir diferente cantidad de parametros, depende de la cantidad de
    parametros que se ingresen en el main() va a ser el constructor que se 
    utilice (si existiera)
    */
    //constructores
    public Clase1(){ //sin parametros   
    }
       
    
    public Clase1(int alfa){ //con un parámetro
        this.alfa = alfa; //si en el parametro no tuviera el mismo nombre no seria necesario "this"
    }
    
    public Clase1(int alfa, String beta){ //con dos parámetros
        this.alfa = alfa;
        this.beta = beta;
    }
    //metodos
    public void modifAlfa(Clase1 alfa){
        this.alfa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo valor de Alfa"));
    }
    
    public int getAlfa(){
        return alfa;
    }
    
    public void mayusBeta(){
        beta = beta.toUpperCase(); //lo cambia a mayusculas        
    }
}
