package equipo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	//creo arreglo para almacenar a todo el equipo
	static ArrayList<Persona> persona = new ArrayList<Persona>();
	static Scanner entrada= new Scanner(System.in);
	
	static Persona basquetbolista1 = new Basquetbolista(7,"Alero","Francis","Hartl",24);
	static Persona basquetbolista2 = new Basquetbolista(9,"Pivot","Juan","Barto",32);
	static Persona basquetbolista3 = new Basquetbolista(10,"Base","Gabi","Perez",20);
	static Persona entrenador = new Entrenador("Batata","Fernandez",50,"Ofensivo");
	static Persona medico = new Medico("Mario","Aquino",35,"Kinesiologo",5);
	
	

	public static void main(String[] args) {
		persona.add(basquetbolista1);
		persona.add(basquetbolista2);
		persona.add(basquetbolista3);
		persona.add(entrenador);
		persona.add(medico);
		
       menu();
	}
public static void menu() {
	int opcion;
	do {
		System.out.println("\n MENU: ");
		System.out.println("1- Viaje de equipo");
		System.out.println("2- Entreniamiento");
		System.out.println("3- Partido de Basquet");
		System.out.println("4- Planificar entrenamiento");
		System.out.println("5- Entrevista");
		System.out.println("6- Curar lesion");
		System.out.println("7- Salir");
		System.out.println("Opcion: ");
		opcion = entrada.nextInt();
		switch(opcion){
			case 1: //viaje de equipo
				System.out.println("");
				viajarEquipo();
				break;
			case 2: //entrenamiento
				System.out.println("");
				entrenarEquipo();
				break;
			case 3: //partido de basquet
				System.out.println("");
				partidoBasquet();
				break;
			case 4: //planificar un entrenamiento
				System.out.println("");
				planificarEntrenamiento();
				break;
			case 5: //entrevista
				System.out.println("");
				darEntrevista();
				break;
			case 6: //curar lesion
				System.out.println("");
				curarLesion();
				break;
			case 7: //salir
				break;
				default: System.out.println("Error, se equivoco de opcion de manu");
				break;
			
		}
		
	}while(opcion!=7);
}//case 1
public static void viajarEquipo() {
	for(Persona equipo: persona) {
		System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" ->");
		equipo.viajar();
	}
	
}
//case 2
public static void entrenarEquipo() {
	for(Persona equipo: persona) {
		System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" ->");
		equipo.entrenamiento();
	}
	
}
//case 3
public static void partidoBasquet() {
	for(Persona equipo: persona) {
		System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" ->");
		equipo.partidoBasquet();
	}
}
//case 4
public static void planificarEntrenamiento() {
	System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" ->");
	((Entrenador)entrenador).planificarEntrenamiento(); // downcasting
	
}
//case 5
public static void darEntrevista() {
	System.out.print(basquetbolista1.getNombre()+" "+basquetbolista1.getApellido()+" ->");
	((Basquetbolista)basquetbolista1).entrevista();
	System.out.print(basquetbolista2.getNombre()+" "+basquetbolista2.getApellido()+" ->");
	((Basquetbolista)basquetbolista2).entrevista();
	System.out.print(basquetbolista3.getNombre()+" "+basquetbolista3.getApellido()+" ->");
	((Basquetbolista)basquetbolista3).entrevista();
}
//case 6
public static void curarLesion() {
	System.out.print(medico.getNombre()+" "+medico.getApellido()+" ->");
	((Medico)medico).curarLesion();
	
}

}
