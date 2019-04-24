/* 
 * variables de clase son las que se declaran static
 * variables de objeto son las que no son static, se invocan desde objeto, no de clase
 * 
 *  
 1- AA no desarrolla los metodos de la interface pero si las desarrolla BB, BB a su vez debera desarrollar el metodo S();
 desde el main vamos a crear objetos de BB objetos de CC y compararemos alguno de sus atributos con la variable cin 
 y diremos cual es mayor
 2- BB No implementa al metodo S(); , AA implementa a contar() y promediar().
 * crear objetos de CC y comparar alguno de sus atributors con la variable cin accediendola con el nombre de la interface Fun
 3- nadie implementa los metodos abstractos, en el metodo main mostrar el valor de la variable de la interface accediendola
  4 veces es decir
 * desde el nombre de cada una de las clases y de la interafce
 * 
 * 
 * agregar interfaz Fun1 hereda de Fun
 * char abc = 'z';
 * float sumar();
 * float restar();
 */
package interfaces_tp;

public class main {

	public static void main(String[] args) {
		
		CC cc1 = new CC(4,5);
		System.out.println(CC.abc);;

	}

}
