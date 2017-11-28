package Tablas;

import java.util.ArrayList;

/***
 * 
 * @author AcmeVision
 *
 */
public class Persona {
	public ArrayList<Integer> idPersona;
	public ArrayList<String> nombre;
	public ArrayList<String> apellido;
	public ArrayList<Integer> tipoPersona;
	public ArrayList<String> telefono;
	public ArrayList<String> identificacion;
	
	Persona(){
		idPersona=new ArrayList<Integer>();
		nombre=new ArrayList<String>();
		tipoPersona=new ArrayList<Integer>();
		apellido=new ArrayList<String>();
		telefono=new ArrayList<String>();
		identificacion=new ArrayList<String>();
	}
}
