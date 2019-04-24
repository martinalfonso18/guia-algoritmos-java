/*
4)	Diseñe un algoritmo que pida al usuario el ingreso de la dimensión de una matriz de n x m, siendo ambas, mayores o iguales a 2 y menores o iguales a 10.
a)	El pedido debe realizarse mediante una función.
b)	El llenado de la matriz, con valores enteros, debe realizarse mediante un procedimiento.
c)	La muestra de la matriz en pantalla mediante un procedimiento

 */


import javax.swing.JOptionPane;

/**
 *
 * @author Riva
 */
public class Ejercicio4 {
    //metodos
    
    public static int dimension(String a){
        int dim = 0;
        do{
            try{
                dim=Integer.parseInt(JOptionPane.showInputDialog(a));
            
            
            }
            catch(Exception Ex){
                System.out.println("Número no encontrado");
            }
            
        }while(dim<2||dim>10);
        return dim;
    }
    public static void llenar(int a, int b, int [][]m){
        for(int i=0;i<a;i++){
            for(int j=0;i<b;j++){
                m[i][j]=(int)(Math.random()*5)+1;
                //mostrar(a,b,m);
            }
            System.out.println(" ");
        }
    }
    public static void mostrar(int a,int b, int m[][]){
        System.out.print(m[a][b]+" ");
    }
    //main
    public static void main(String args[]){
        int a,b;
        
        a=dimension("Ingrese cantidad de filas");
        b=dimension("Ingrese cantidad de columnas");
        int [][]m=new int[a][b];
        System.out.println(a);
        System.out.println(b);
        llenar(a,b,m);
        
                
    }
}
