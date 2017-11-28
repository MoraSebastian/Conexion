package Tablas;

import java.sql.Date;
import java.util.ArrayList;

/***
 * 
 * @author AcmeVision
 *
 */
public class OrdenServicio {

	ArrayList<Integer> idOrdenServicio;
	ArrayList<String> fecha;
	ArrayList<Integer> cliente;
	ArrayList<Integer> empleado;
	
	OrdenServicio(){
		idOrdenServicio=new ArrayList<Integer>();
		
		fecha = new ArrayList<String>();
		cliente = new ArrayList<Integer>();
		empleado= new ArrayList<Integer>();
		
	}
}
