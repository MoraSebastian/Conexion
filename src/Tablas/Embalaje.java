package Tablas;

import java.util.ArrayList;

/***
 * 
 * @author AcmeVision
 *
 */
public class Embalaje {

	public ArrayList<Integer> idEmbalaje;
	public ArrayList<Integer> tipoEmbalaje;
	public ArrayList<String> descEmbalaje;
	public ArrayList<Double> peso;
	
	Embalaje(){
		idEmbalaje = new ArrayList<Integer>();
		idEmbalaje.add(1);
		idEmbalaje.add(2);
		tipoEmbalaje = new ArrayList<Integer>();
		tipoEmbalaje.add(1);
		descEmbalaje = new ArrayList<String>();
		descEmbalaje.add("Sobre");
		peso = new ArrayList<Double>();
		peso.add(30.5);
		peso.add(10.0);
	}
}
