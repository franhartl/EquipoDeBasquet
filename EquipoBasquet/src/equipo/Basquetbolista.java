package equipo;

public class Basquetbolista extends Persona {
	
	private int dorsal;
	private String posicion;
	

	public Basquetbolista( int dorsal, String posicion, String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		this.dorsal = dorsal;
		this.posicion = posicion;
	

	}

	public int getDorsal() {
		return dorsal;
	}

	public String getPosicion() {
		return posicion;
	}
@Override  //para el met abstracto de la clase persona
	public void partidoBasquet() {
		System.out.println("Juega el partido de Basquet");
	}
@Override
	public void entrenamiento() {
		System.out.println("Entrena");
	}

public void entrevista() {
	System.out.println("Da una entrevista");
}

}
