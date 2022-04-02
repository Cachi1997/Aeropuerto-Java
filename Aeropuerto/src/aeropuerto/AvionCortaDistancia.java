package aeropuerto;
/**
 * AvionCortaDistancia documentacion
 * @author Galiano Valle, Carlos
 *
 */
public class AvionCortaDistancia extends Avion{
	private TipoMotor tipoMotor;
	
	/**
	 * Crea un avion de corta distancia
	 */
	public AvionCortaDistancia (){
		super();
	}
	/**
	 * Tipo de motor
	 * @return Devuelve el tipo de motor de un avion de corta distancia
	 */
	public TipoMotor getTipoMotor() {
		return tipoMotor;
	}
	/**
	 * Setea el tipo de motor de un avion de corta distancia
	 * @param tipoMotor Tipo de motor de un avion de corta distancia
	 */
	public void setTipoMotor(TipoMotor tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	

}
