package aeropuerto;

import java.util.ArrayList;
/**
 * Empresa documentacion 
 * @author Galiano Valle, Carlos
 *
 */
public class Empresa {
	private String nombreComercial;
	private int cuit;
	private String razonSocial;
	
	private ArrayList<Avion> aviones;
	
	/**
	 * Crea una empresa y setea un arreglo arreglo de aviones
	 */
	public Empresa() {
		this.aviones = new ArrayList<Avion>();
	}
	
	/**
	 * Nombre comercial de una empresa
	 * @return Devuelve el nombre comercial de una empresa
	 */
	public String getNombreComercial() {
		return nombreComercial;
	}
	/**
	 * Setea el nombre comercial de una empresa
	 * @param nombreComercial Nombre comercial de la empresa
	 */
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	/**
	 * Cuit de una empresa
	 * @return Devuelve el cuit de una empresa
	 */
	public int getCuit() {
		return cuit;
	}
	/**
	 * Setea el cuit de una empresa 
	 * @param cuit Cuit de la empresa
	 */
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	/**
	 * Razon social de una empresa
	 * @return Devuelve la razon social de una empresa
	 */
	public String getRazonSocial() {
		return razonSocial;
	}
	/**
	 * Setea la razon social de una empresa
	 * @param razonSocial Razon social de la empresa
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	/**
	 * ArrayList de aviones
	 * @return Devuelve la lista de aviones de una empresa
	 */
	public ArrayList<Avion> getAviones() {
		return aviones;
	}
	/**
	 * Agrega un avion a la lista de aviones de la empresa
	 * @param avion Avion de la empresa
	 */
	public void agregarAvion(Avion avion) {
		aviones.add(avion);
	}
	
}
