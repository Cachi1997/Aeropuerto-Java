package aeropuerto;

import java.util.ArrayList;
/**
 * AvionSanitario documentacion
 * @author Galiano Valle, Carlos
 *
 */
public class AvionSanitario extends AvionCortaDistancia{
	private String descripcionEquipamiento;
	/**
	 * Crea un avion sanitario
	 */
	public AvionSanitario() {
		super();
	}
	/**
	 * Descripcion de equipamiento
	 * @return Devuelve la descripcion de un equipamiento medico
	 */
	public String getDescripcionEquipamiento() {
		return descripcionEquipamiento;
	}
	/**
	 * Setea un equipamiento medico al avion
	 * @param descripcionEquipamiento Descripcion de equipamiento medico de un avion
	 */
	public void setDescripcionEquipamiento(String descripcionEquipamiento) {
		this.descripcionEquipamiento = descripcionEquipamiento;
	}
	/**
	 * Carga un pasaje sanitario al avion
	 * @param pasajeros Lista de pasajes del vuelo
	 * @param pasaje Pasaje de un pasajero
	 */
	@Override
	public void cargarPasajero(ArrayList<Pasaje> pasajeros, Pasaje pasaje) {
		if (pasaje instanceof PasajeSanitario) {
			pasajeros.add(pasaje);
		}
		else {
			System.out.println("El tipo de pasaje no corresponde con el avion sanitario");
		}
	}
}
