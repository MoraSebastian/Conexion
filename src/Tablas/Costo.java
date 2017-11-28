package Tablas;
import java.util.ArrayList;

/***
 * 
 * @author AcmeVision
 *
 */
public class Costo {

	public ArrayList<Integer> idCosto;
	public ArrayList<Integer> destino;
	public ArrayList<Integer> peso;
	public ArrayList<Double> costo;
	 
	Costo(){
		idCosto = new ArrayList<Integer>();
		idCosto.add(1);
		destino = new ArrayList<Integer>();
		destino.add(1);
		peso = new ArrayList<Integer>();
		peso.add(1);
		costo = new ArrayList<Double>();
		for(int i = 0 ;i<peso.size();i++){
			costo.add(calcular(peso.get(i)));
		}
	}
	
	public double calcular(int destino, double peso){
		double temp =0;
		temp = peso*5000;
		temp += (destino *2000);
		temp += temp*0.19;
		return temp;
	}
	public double calcular(double peso){
		double temp =0;
		temp = peso*5000;
		temp += temp*0.19;
		return temp;
	}
	
}
