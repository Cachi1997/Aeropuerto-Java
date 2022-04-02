package aeropuerto;

import java.util.ArrayList; 

import java.util.Random;
/**
 * Avion documentacion
 * @author Galiano Valle, Carlos
 *
 */
public class Avion {
	private String patente;
	private int capacidadMaxima;
	private int horasDeVuelo;
	private double capacidadCombustible;
	
	/**
	 * Crea un avion y le asigna un codigo alfanumerico de 4 digitos
	 */
	public Avion() {
		this.patente = generadorCodigo();
	}
	/**
	 * Patente del avion
	 * @return Devuelve la patente de un avion
	 */
	public String getPatente() {
		return patente;
	}
	/**
	 * Capacidad maxima de pasajeros del avion
	 * @return Devuelve la capacidad maxima de pasajeros de un avion
	 */
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	/**
	 * Setea la capacidad maxima de un avion
	 * @param capacidadMaxima Capacidad maxima del avion
	 */
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	/**
	 * Horas de vuelo de un avion
	 * @return Devuelve el total de horas de vuelo de un avion
	 */
	public int getHorasDeVuelo() {
		return horasDeVuelo;
	}
	/**
	 * Setea las horas de vuelo de un avion
	 * @param horasDeVuelo Horas de vuelo del avion
	 */
	public void setHorasDeVuelo(int horasDeVuelo) {
		this.horasDeVuelo = horasDeVuelo;
	}
	/**
	 * Capacidad maxima de combustible de un avion
	 * @return Devuelve la capacidad maxima de combustible del avion
	 */
	public double getCapacidadCombustible() {
		return capacidadCombustible;
	}
	/**
	 * Setea la capacidad maxima de combustible de un avion
	 * @param capacidadCombustible Capacidad maxima de combustible del avion
	 */
	public void setCapacidadCombustible(double capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}
	/**
	 * Carga un pasajero a la lista de pasasjes 
	 * @param pasajeros Lista de pasajes de un vuelo
	 * @param pasaje Pasaje perteneciente a un pasajero
	 */
	public void cargarPasajero(ArrayList<Pasaje> pasajeros, Pasaje pasaje) {
		if (!(pasaje instanceof PasajeSanitario) ) {
			pasajeros.add(pasaje);
		} 
		else {
			System.out.println("El avion no acepta este tipo de pasajes");
		}
	}
	
	/**
	 * Generador de codigo alfanumerico
	 * @return Devuelve un codigo alfanumerico de 4 digitos
	 */
	public String generadorCodigo() {
		Random aleatorio = new Random();
        String alfa = "ABCDEFGHIJKLMNOPQRSTVWXYZ";
        String cadena = "";    
        int numero;
        int forma;
      
        forma = (int)(aleatorio.nextDouble() * alfa.length() -1 + 0);
        
        numero = (int)(aleatorio.nextDouble() * 99 + 100);

        cadena = cadena + alfa.charAt(forma) + numero;
        
        return cadena;
	}
	/**
	 * Crea y devuelve una cadena
	 * return Devuelve una cadena formada por patente - capacidad maxima - horas de vuelo - capacidad de combustible de un avion
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Avion: %s - Capacidad maxima: %d - Horas de vuelo: %d - Capacidad de combustible: &.1f", 
					this.getPatente(), this.getCapacidadMaxima(), this.getHorasDeVuelo(), this.getCapacidadCombustible());
	}
}
