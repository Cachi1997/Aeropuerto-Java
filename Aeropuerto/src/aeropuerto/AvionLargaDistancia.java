package aeropuerto;
/**
 * AvionLargaDistancia documentacion
 * @author Galiano Valle, Carlos
 *
 */
public class AvionLargaDistancia extends Avion{
	private boolean radarAcercamiento;
	
	/**
	 * Crea un avion de larga distancia
	 */
	public AvionLargaDistancia() {
		super();
	}
	
	/**
	 * Radar de acercamiento
	 * @return Devuelve un valor booleano si el avion posee un radar de acercamiento
	 */
	public boolean isRadarAcercamiento() {
		return radarAcercamiento;
	}
	/**
	 * Setea un radar de acercamiento al avion
	 * @param radarAcercamiento Radar de acercamiento de un avion
	 */
	public void setRadarAcercamiento(boolean radarAcercamiento) {
		this.radarAcercamiento = radarAcercamiento;
	}

	
}
