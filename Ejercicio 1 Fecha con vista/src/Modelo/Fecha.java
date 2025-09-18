package Modelo;

public class Fecha {
	public int dia,mes,anno;
	public boolean validez = false;
	
	public Fecha(int dia, int mes, int anno) {
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
		this.validez = true;
	}
}
