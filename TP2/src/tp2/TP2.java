/*
Las características de este texto, se corresponden con la notación utilizada en un diagrama UML.

Cree las clases, y sus códigos correspondientes.

A)

Clase: Trapecio
Atributos:
#altura: double
- bMayor: double
- bMenor: double
 # espesor: float
+ precio: float {static} {final}

B)
 Clase: Círculo
 Atributos:
- PI: double = 3,14 {final}
 # radio: double
 # espesor: float 

C) Métodos: en ambos casos los métodos serán:
+ superficie(): double. Implementación:  

      Círculo: [PI * radio * radio]; 

      Trapecio: [((bMenor + bMayor) * altura)/2]
+ perímetro(): float. Implementación:

      Círculo: [PI * radio * 2];

       Trapecio: [bMenor + bMayor + lado1 + lado2], donde           lado1 y lado2,
serán la       [altura + (altura * ¼)].
+ costo(): float.  Implementación: [superficie() * precio * espesor]

D) En ambos casos, el espesor debe ser recibido por el Constructor.

E) Cuando una variable, está en mayúsculas, significa que es final.

F) Cree un archivo ejecutable en el mismo paquete, que:

            a) Cree un objeto de cada clase.

            b) Obtenga la superficie, el perímetro y el costo de cada figura.

            c) Muestre los Nombres de los objetos creados, los valores de sus at
            ributos y los resultados obtenidos de los cálculos.
 */
package tp2;


public class TP2 {

    public static void main(String[] args) {
        
        //creo objetos de cada uno
        Circulo c1 = new Circulo(25.3f);
        Trapecio t1 = new Trapecio(13.8f);
        
        c1.setRadio(5);
        t1.setBMayor(6);
        t1.setBMenor(4);
        t1.setAltura(3);
        
        //mostrar circulo
        System.out.println("Circulo 1: ");
        System.out.println("Radio: "+c1.getRadio());
        System.out.println("Espesor: "+c1.espesor);
        System.out.println("Perimetro: "+c1.perimetro());
        System.out.println("Superficie: "+c1.superficie());
        System.out.println("\n");
        
        //mostrar trapecio
        System.out.println("Trapecio 1: ");
        System.out.println("bMayor: "+t1.getBMayor());
        System.out.println("bMenor: "+t1.getBMenor());
        System.out.println("Espesor: "+t1.espesor);
        System.out.println("Perimetro: "+t1.altura);
        System.out.println("Superficie: "+t1.getPRECIO());
        System.out.println("\n");
    }
    
}
