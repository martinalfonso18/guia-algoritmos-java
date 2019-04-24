package arquitectos;


public class Arquitectos {

         public static void main(String[] args) {
       // Clase1 c1 = new Clase1(1,"sasd");
       
     /*   Lotes l1 = new Lotes();
        l1.ancho = 5.40f;
        l1.largo = 3.54f; 
        l1.servicios = "Gas y agua";
        l1.setEscritura(true); 
        
        Lotes l2 = new Lotes();
        l2.ancho = 5;
        l2.largo = 4.5f;
        l2.setEscritura(true);
        l2.servicios = "Agua";
        
     
        Casas c1 = new Casas();
        c1.precio = 13453f;
        c1.propietario = new Alumno();
        c1.propietario.nombre = "Axel";
        
        Casas c2 = new Casas();
        c2.precio= 34567.89f;
        c2.propietario = new Alumno();
        c2.propietario.nombre = "Juan"; 
        
        Casas c3 = new Casas();
        c3.precio= 39867.78f;
        c3.propietario = new Alumno(); 
        c3.propietario.nombre = "Esteban";
        c3.propietario.setEdad(40);
        
        
            
        System.out.println("El lote 1 mide: "+l1.ancho+"m por "+l1.largo+"m. " +" escritura. "
                + "\nLos servicios registrados son: "+l1.servicios+". \nEl Lote posee una casa cuyo propietario es: "
                +c1.propietario.nombre+" y el valor de la propiedad es: $"+c1.precio);
        l1.tieneEscritura();
        
        System.out.println(c3.propietario.nombre + "\n" + c3.propietario.getEdad()); */
        
        
        Curso cur1 = new Curso(44);
        cur1.nombre= "2do 2a";
        cur1.setCapacidad(28);
        cur1.turno = 'T';
        
            /* System.out.println("Curso: "+cur1.nombre);
             System.out.println("Capacidad: "+cur1.getCapacidad());
             System.out.println("Turno: "+cur1.turno);*/
            
         cur1.mostrarDatosCurso(); 
            
         
         Curso cur2 = new Curso(33);
         cur2.nombre = "1ro 2a";
         cur2.setCapacidad(24);
         cur2.turno = 'T';
         
         cur2.mostrarDatosCurso();
        
         if (cur1.getCapacidad()>cur2.getCapacidad()){
             System.out.println("El curso "+cur1.nombre+" tiene más alumnos,"+cur1.getCapacidad());
         }else if(cur2.getCapacidad()>cur1.getCapacidad()){
             System.out.println("El curso 1ro 2a tiene más alumnos,"+cur2.getCapacidad());
                  }else{
             System.out.println("Ambos cursos tienen la misma cantidad de alumnos,"+cur1.getCapacidad());
         }
           
             System.out.println("Carrera para "+cur1.nombre+" es: "+Curso.carrera);  
             System.out.println("Carrera para "+cur2.nombre+" es: "+Curso.carrera);
             
             System.out.println(Curso.a);
             //Curso.a=50;
             System.out.println(Curso.a);
             //Curso.a=60;
             System.out.println(Curso.a);
             //cur2.a=70;
             System.out.println(Curso.a);
             
     Curso cur3 = new Curso(18,45);        //POLIMORFISMO
     cur3.mostrarDatosCurso();
     //System.out.println(cur3.getCapacidad()); 
             
     Curso cur4 = new Curso (19, "2do 3ra",57);
     cur4.mostrarDatosCurso();
              //System.out.println(cur4.nombre + cur4.getCapacidad());
              
     Curso cur5 = new Curso ("1ro 3ra", 27, 'T', 'b',56); //4 sobrecargas del constructor
              //System.out.println(cur5.nombre+cur5.getCapacidad()+cur5.turno+cur5.b+cur5.z);
              cur5.mostrarDatosCurso();
    }
    
   
}