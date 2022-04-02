package aeropuerto;
/**
 * PasajeSanitario documentacion
 * 
 * @author Galia
 *
 */
public class PasajeSanitario extends Pasaje{
	private Persona doctor;
	/**
	 * Crea un pasaje sanitario
	 */
	public PasajeSanitario() {
		super();
	}
	/**
	 * Doctor del pasaje
	 * @return Devuelve el doctor asignado al pasaje
	 */
	public Persona getDoctor() {
		return doctor;
	}
	/**
	 * Setea un doctor al pasaje
	 * @param doctor Doctor del pasaje
	 */
	public void setDoctor(Persona doctor) {
		this.doctor = doctor;
	}
}
