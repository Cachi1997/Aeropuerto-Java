package aeropuerto;
/**
 * Pasaje documentacion
 * 
 * @author Galia
 *
 */
public class Pasaje {
	private int codigoUnico;
	private int numAsiento;
	private Persona pasajero;
	
	private static int generadorDeCodigo = 1;
	/**
	 * Crea un pasaje y setea un codigo unico al mismo
	 */
	public Pasaje() {
		this.codigoUnico = generadorDeCodigo;
		generadorDeCodigo++;
	}
	/**
	 * Numero de asiento
	 * @return Devuelve el numero de asiento de un pasaje
	 */
	public int getNumAsiento() {
		return numAsiento;
	}
	/**
	 * Setea el numero de asiento de un pasajero
	 * @param numAsiento Numero de asiento de un pasaje
	 */
	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}
	/**
	 * Pasajero
	 * @return Devuelve el pasajero del pasaje
	 */
	public Persona getPasajero() {
		return pasajero;
	}
	/**
	 * Setea un pasajero al pasaje
	 * @param pasajero Pasajero del pasaje
	 */
	public void setPasajero(Persona pasajero) {
		this.pasajero = pasajero;
	}
	/**
	 * Codigo del pasaje
	 * @return Devuelve el codigo del pasaje
	 */
	public int getCodigoUnico() {
		return codigoUnico;
	}
	
}
