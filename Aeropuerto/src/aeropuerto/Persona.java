package aeropuerto;
/**
 * Persona documentacion
 * 
 * @author Galia
 *
 */
public class Persona {
	private String nombre;
	private String apellido;
	private int numDocumento;
	private TipoDocumento tipoDocumento;
	/**
	 * Crea una persona
	 */
	public Persona() {
		
	}
	/**
	 * Crea una persona con nombre y apellido
	 * @param nombre Nombre de la persona
	 * @param apellido Apellido de la persona
	 */
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	/**
	 * Nombre de la persona
	 * @return Devuelve el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Setea el nombre de una persona
	 * @param nombre Nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Apellido de la persona
	 * @return Devuelve el apellido de la persona
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * Setea el apellido de la persona
	 * @param apellido Apellido de la persona
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * Numero de documento
	 * @return Devuelve el numero de documento de la persona
	 */
	public int getNumDocumento() {
		return numDocumento;
	}
	/**
	 * Setea el numero de documento de la persona
	 * @param numDocumento Numero de documento de la persona
	 */
	public void setNumDocumento(int numDocumento) {
		this.numDocumento = numDocumento;
	}
	/**
	 * Tipo de documento
	 * @return Devuelve el tipo de documento de la persona
	 */
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	/**
	 * Setea el tipo de documento de la persona
	 * @param tipoDocumento Tipo de documento de la persona
	 */
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	/**
	 * Crea y devuelve una cadena
	 * return Duelve una cadena compusta por el nombre y apellido de la persona
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s", this.nombre, this.apellido);
	}
}
