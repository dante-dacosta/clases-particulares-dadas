package Principal;


public class Principal {

	public static void main(String[] args) {
		
		// Parte 2 del ejercicio
		Fecha fechaselec1 = new Fecha();
		fechaselec1.mostrarFechaSig();
		
		// Parte 3 del ejercicio
		Fecha fechaselec2 = new Fecha();
		
		int totaldias = fechaselec2.dia - fechaselec1.dia + (fechaselec2.mes - fechaselec1.mes)*30 + (fechaselec2.anno - fechaselec1.anno)*365;
		
		if(totaldias > 0)
			System.out.println("El total de días faltantes para alcanzar la fecha es de :" + totaldias);
		else
			System.out.println("Los días pasados son:" + totaldias*-1);
	
	}

		
}
