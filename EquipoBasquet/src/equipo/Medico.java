package equipo;

public class Medico extends Persona{
	
	private String titulacion;
	private int a�osExperiencia;
	
	
	public Medico(String nombre, String apellido, int edad, String titulacion, int a�osExperiencia) {
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.a�osExperiencia = a�osExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public int getA�osExperiencia() {
		return a�osExperiencia;
	}
	@Override
	public void partidoBasquet() {
		System.out.println("Da asistencia medica en el partido");
	}
	@Override
	public void entrenamiento() {
		System.out.println("Da asistencia medica en el entrenamiento");
		
	}
public void curarLesion() {
	System.out.println("Curar lesion");
	
}
}
