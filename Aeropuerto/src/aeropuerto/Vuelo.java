package aeropuerto;

import java.util.ArrayList;
/**
 * Vuelo documentacion 
 * @author Galiano Valle, Carlos
 *
 */
public class Vuelo {
	private Avion avion;
	private Empresa empresa;
	private Persona piloto;
	private Persona copiloto;
	private String origen;
	private String destino;
	
	private ArrayList<Persona> auxiliares;
	private ArrayList<Pasaje> pasajeros;
	/**
	 * Crea un vuelo y setea la lista de auxiliares y pasajeros
	 */
	public Vuelo() {
		this.auxiliares = new ArrayList<Persona>();
		this.pasajeros = new ArrayList<Pasaje>();
	}
	/**
	 * Crea un vuelo y setea el origen y destino del mismo
	 * @param origen Origen del vuelo
	 * @param destino Destino del vuelo
	 */
	public Vuelo(String origen, String destino) {
		this();
		this.origen = origen;
		this.destino = destino;
	}
	/**
	 * Crea un vuelo y setea el origen, destino, piloto y avion del mismo
	 * @param origen Origen del vuelo	
	 * @param destino Destino del vuelo
	 * @param piloto Piloto del vuelo
	 * @param avion Avion del vuelo
	 */
	public Vuelo(String origen, String destino, Persona piloto, Avion avion) {
		this(origen, destino);
		this.piloto = piloto;
		this.avion = avion;
	}
	/**
	 * Empresa del vuelo
	 * @return Devuelve la empresa que se encarga del vuelo
	 */
	public Empresa getEmpresa() {
		return empresa;
	}
	/**
	 * Setea una empresa al vuelo
	 * @param empresa Empresa del vuelo
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	/**
	 * Avion del vuelo
	 * @return Devuelve el avion que realiza el vuelo
	 */
	public Avion getAvion() {
		return avion;
	}
	/**
	 * Setea un avion al vuelo
	 * @param avion Avion del vuelo
	 */
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	/**
	 * Piloto del vuelo
	 * @return Devuelve el piloto del vuelo
	 */
	public Persona getPiloto() {
		return piloto;
	}
	/**
	 * Setea un piloto al vuelo
	 * @param piloto Piloto del vuelo
	 */
	public void setPiloto(Persona piloto) {
		this.piloto = piloto;
	}
	/**
	 * Copiloto del vuelo
	 * @return Devuelve el copiloto del vuelo
	 */
	public Persona getCopiloto() {
		return copiloto;
	}
	/**
	 * Setea un copiloto al vuelo
	 * @param copiloto Copiloto del vuelo
	 */
	public void setCopiloto(Persona copiloto) {
		this.copiloto = copiloto;
	}
	/**
	 * Origen del vuelo
	 * @return Devuelve la ciudad de origen del vuelo
	 */
	public String getOrigen() {
		return origen;
	}
	/**
	 * Setea una ciudad origen del vuelo
	 * @param origen Ciudad origen del vuelo
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	/**
	 * Ciudad destino del vuelo
	 * @return Devuelve la ciudad destino del vuelo
	 */
	public String getDestino() {
		return destino;
	}
	/**
	 * Setea la ciudad destino del vuelo
	 * @param destino Ciudad destino del vuelo
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	/**
	 * ArrayList de auxilares
	 * @return Devuelve la lista de auxiliares de un vuelo
	 */
	public ArrayList<Persona> getAuxiliares() {
		return auxiliares;
	}
	/**
	 * ArrayList de pasajes
	 * @return Devuelve la lista de pasajes de un vuelo
	 */
	public ArrayList<Pasaje> getPasajeros() {
		return pasajeros;
	}
	/**
	 * Agrega un auxiliar de vuelo a la lista de auxiliares
	 * @param auxiliar Auxiliar del vuelo
	 */
	public void agregarAuxiliares(Persona auxiliar) {
		auxiliares.add(auxiliar);
	}
	/**
	 * Registra un pasaje a la lista de pasajes 
	 * @param pasaje Pasaje de un pasajero
	 */
	public void registrarPasajero(Pasaje pasaje) {
		if(this.avion.getCapacidadMaxima() > pasajeros.size()) {
			this.avion.cargarPasajero(pasajeros, pasaje);
		}
		else {
			System.out.println("El avion llego al limite de pasajeros");
		}
	}
	/**
	 * Compara dos objetos de tipo vuelo
	 * @param obj Objeto vuelo
	 * return Verdadero: si dos vuelo poseen el mismo origen y destino
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vuelo) {
			Vuelo vuelo1 = (Vuelo )obj;
			return (vuelo1.getOrigen() == this.getOrigen()) && (vuelo1.getDestino() == this.getDestino());
		}
		return super.equals(obj);
	}
	
}
