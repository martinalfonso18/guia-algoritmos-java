/*
3)	Diseñe un algoritmo que pida por pantalla un texto.
a)	Mediante una función, devuelva la cantidad de palabras que contiene.
i)	Nombre: cuantasPalabras
ii)	Argumento: el texto.
iii)	Tipo de devolución: int
b)	Mediante un procedimiento, que muestre, con texto explicativo, el número total de 
        caracteres contenidos en el texto, inclusive los espacios y signos de puntuación.
i)	Nombre: longitudTexto.
ii)	Argumento: el texto.
iii)	Tipo de devolución: void
c)	El método main debe ejecutar ambos métodos.

 */


import javax.swing.JOptionPane;
public class Ejercicio3 {
    // procedimientos
    public static void cuantasPalabras(String a){
        int espacios=0,blanco=0;
        
            for (int i=0;i<a.length();i++){
                if(a.charAt(i)==' '){
                    espacios++;
                }
                if(a.charAt(i)==' '){ //verifica si el texto esta en blanco
                    blanco++;
                }
            }
        
        espacios++;
        if(a.length()==blanco||a.length()==0){
            System.out.println("El texto está en blanco");
            
        }
        else{
            System.out.println("La cantidad de palabras es: "+espacios);
        }
        
}
    public static void main(String args[]){
        String palabra=JOptionPane.showInputDialog("Ingrese un texto");
        cuantasPalabras(palabra);
    }
    
}
