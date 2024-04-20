package Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import Pieza.Pieza;



public class Inventario {

	private List<Pieza> piezasColeccioon;
	private List<Pieza> piezasBodega;
	private List<Pieza> piezasPasadas;
	
	
	public Inventario() 
	{
	piezasBodega = new ArrayList<Pieza>();
	piezasColeccioon = new ArrayList<Pieza>();
	piezasPasadas = new ArrayList<Pieza>();
	}
	
	public int getCapacidad() 
	{
	return piezasBodega.size() + piezasColeccioon.size();	
	}
	
	
	public ArrayList<Pieza> getPiezasTotales() 
	{
	ArrayList<Pieza> piezasTotales = new ArrayList<Pieza>();
	piezasTotales.addAll(piezasColeccioon);
	piezasTotales.addAll(piezasBodega);
	return piezasTotales;
	}
	
	
	
	
	
	
}
