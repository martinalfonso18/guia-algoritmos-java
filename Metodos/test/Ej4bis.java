import javax.swing.JOptionPane;
/*
 *4)	Diseñe un algoritmo que pida al usuario el ingreso de la dimensión de una matriz de n x m, siendo ambas, mayores o iguales a 2 y menores o iguales a 10.
a)	El pedido debe realizarse mediante una función.
b)	El llenado de la matriz, con valores enteros, debe realizarse mediante un procedimiento.
c)	La muestra de la matriz en pantalla mediante un procedimiento
 */
public class Ej4bis {
    public static void main(String[] args) {
        int m=0, n=0;
        String f="filas", c="columnas";
        
        m=pedir(m,f);
        n=pedir(n,c);
   
        int [][] a= new int [m][n];
        llenar(m,n,a);
    }
public static int pedir( int x, String y){
    do{
        try{
            x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese N° de "+y));
            if (x<2 || x>10) System.out.println("ERROR: ingrese un número entre 2 y 10 incluidos");
        }catch (Exception ex){
            System.out.println("Número no encontrado");
        }
    }while (x<2 || x>10);
    return x;
}
    public static void llenar(int m, int n, int [][] a){
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                a[i][j]=(int) (Math.random()*5)+1;
                mostrar(a,i,j);                          //aprovecha fors y valores de variables
            }
            System.out.println("");
        }
    }
    public static void mostrar (int [][] a,int i, int j){
        System.out.print(a[i][j]+" ");
       
    }
}
