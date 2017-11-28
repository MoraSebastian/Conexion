package Tablas;
import java.util.ArrayList;

/***
 * 
 * @author AcmeVision
 *
 */
public class Aseguradora {
	public ArrayList<Integer> idAseguradora;
	public ArrayList<String> nombre;
	public ArrayList<Integer> tipoSeguro;
	
	Aseguradora(){
		idAseguradora = new ArrayList<Integer>();
		idAseguradora.add(1);
		nombre = new ArrayList<String>();
		nombre.add("Seguros Bolivar");
		tipoSeguro= new ArrayList<Integer>();
		tipoSeguro.add(1);
	}
}
