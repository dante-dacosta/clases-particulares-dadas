package Principal;

import java.util.Scanner;

//Parte 1 del ejercicio
public class Fecha {
	public int dia,mes,anno;
	public boolean validez = false;
	
	public Fecha() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Indique el día de la fecha: ");
		this.dia = scan.nextInt();
		System.out.println("Indique el mes de la fecha: ");
		this.mes = scan.nextInt();
		System.out.println("Indique el año de la fecha: ");
		this.anno = scan.nextInt();
		
		if(this.dia < 0 || this.dia > 30) {
			System.out.println("El dia ingresado es invalido.");
		}else if(this.mes < 0 || this.mes > 12) {
			System.out.println("El mes ingresado es invalido.");
		}else if(this.anno < 0) {
			System.out.println("El año ingresado es invalido.");
		}else {
			System.out.println("La fecha es valida.");
			this.validez = true;
			System.out.println("La fecha ingresada es:"+this.dia+"/"+this.mes+"/"+this.anno);
		}
		
	}
	
	public void mostrarFechaSig() {
		if(this.validez) {
			int diaSig, mesSig, annoSig;
			
			diaSig = this.dia+1;
			mesSig = this.mes;
			annoSig = this.anno;
			
			if(diaSig > 30) {
				diaSig = 1;
				mesSig++;
			}
			
			if(mesSig > 12) {
				mesSig = 1;
				annoSig++;
			}
			
			System.out.println("El día siguiente a la fecha ingresada es:" +diaSig+"/"+mesSig+"/"+annoSig);
		}else
			System.out.println("No se puede mostrar el dia siguiente de una fecha invalida.");
	}
}
