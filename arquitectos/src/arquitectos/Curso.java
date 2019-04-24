package arquitectos;

public class Curso {

    public static int a = 100;
    public static final String carrera = "TUP";
    public final int añoCreacion = 2015; //es un valor que nunca cambia y que indica que todos los objetos de la clase curso tienen el mismo año. No es una variable que deba ser niSTATIC ni FINAL
    public String nombre;
    private int capacidad;
    public char turno;
    public char b = '5';
    public final int z; //al crear copia de objeto el constructor no reclama inicializar esta variable final (siempre que este inicializado)
                           //si no esta inicializado es obligatorio definirlo al construir el objeto
 public Curso(int z){
     this.z=z;}
 public Curso (int capacidad, int z){
     this.capacidad = capacidad;
     this.z=z;
 }
 public Curso (int capacidad, String nombre, int z){
     this.capacidad=capacidad;
     this.nombre=nombre;
     this.z=z;
 }
 
public Curso (String nombre, int capacidad, char turno, char b, int z ){ //constructor sobrecargado
  this.nombre=nombre;
  this.capacidad=capacidad;
  this.turno=turno;
  this.b=b; 
  this.z=z;
}

 
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void mostrarDatosCurso() {    //no hace falta escribir los atributos xq ya los conoce
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad); //no es necesario agregar GET acá xq estoy en la misma clase
        System.out.println("Turno: " + turno);
        System.out.println("Char b" + b);
        System.out.println("Final z" + z);
        
     
      
      

    }
    //constructor de copia
    public Curso(Curso curso){
        this.nombre = curso.nombre;
        this.capacidad = curso.capacidad;
        this.turno = curso.turno;
        this.z = curso.z;
    }
    Curso cur10 = new Curso(24,"24",'T');
    Curso cur11 = new Curso(cur10);
}