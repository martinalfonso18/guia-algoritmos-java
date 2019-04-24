package paso_entre_ciudades;

public class Ciudad {

	public String nombre;
	public int latitud;
	public int longitud;
	public Ciudad proximo[];
	
	public void mostrar() {
		System.out.println("La ciudad "+nombre+" de latitud: "+latitud+" y longitud: "+longitud+", \n");
		System.out.println("tiene como destino: \n");
		for(int i=0;i<proximo.length;i++) {
			
			try {
				System.out.println(proximo[i].nombre);
			}
			catch(java.lang.NullPointerException e) {
				System.out.println("Excepcion "+e);
				System.out.println("La ciudad "+nombre+" no tiene destinos");
			}
			
			
		}
		System.out.println("\n");
	}
	
	public Ciudad(String nombre,int latitud, int longitud, Ciudad proximo[]) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.proximo = proximo;
		
	}
	
	
	
}
