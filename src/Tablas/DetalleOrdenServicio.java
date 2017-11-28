package Tablas;

import java.util.ArrayList;

/***
 * 
 * @author AcmeVision
 *
 */
public class DetalleOrdenServicio {

	ArrayList<Integer> idDOS;
	ArrayList<Integer> ordenServicio;
	ArrayList<Integer> tipoServicio;
	ArrayList<Integer> embalaje;
	ArrayList<Integer> aseguradora;
	ArrayList<Double> costo;
	ArrayList<Compuesta> compuesta;
	
	DetalleOrdenServicio(){
		idDOS = new ArrayList<Integer>();
		idDOS.add(1);
		tipoServicio = new ArrayList<Integer>();
		ordenServicio  = new ArrayList<Integer>();
		embalaje  = new ArrayList<Integer>();
		aseguradora  = new ArrayList<Integer>();
        costo = new ArrayList<Double>();
        compuesta = new ArrayList<Compuesta>();
	}
	
}
