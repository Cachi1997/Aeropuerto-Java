package aeropuerto;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/*Bloque de creacion de pasajeros y seteo de atributos (Linea 10 a 40)*/
		Persona pasajero1 = new Persona("Federico","Gomez");
		pasajero1.setNumDocumento(12345678);
		pasajero1.setTipoDocumento(TipoDocumento.DNI);
	
		Persona pasajero2 = new Persona("Marta", "Sanchez");
		pasajero2.setNumDocumento(23145678);
		pasajero2.setTipoDocumento(TipoDocumento.DNI);
		
		Persona pasajero3 = new Persona("Martin", "Perez");
		pasajero3.setNumDocumento(13145678);
		pasajero3.setTipoDocumento(TipoDocumento.DNI);
		
		Persona pasajero4 = new Persona("Gabriela", "Hernandez");
		pasajero4.setNumDocumento(23155678);
		pasajero4.setTipoDocumento(TipoDocumento.DNI);
		
		Persona pasajero5 = new Persona("Matias", "Soto");
		pasajero5.setNumDocumento(43145678);
		pasajero5.setTipoDocumento(TipoDocumento.DNI);
		
		Persona pasajero6 = new Persona("Marcelo", "Caruso");
		pasajero6.setNumDocumento(40145678);
		pasajero6.setTipoDocumento(TipoDocumento.DNI);
		
		Persona pasajero7 = new Persona("Mirta", "Ramos");
		pasajero7.setNumDocumento(33145678);
		pasajero7.setTipoDocumento(TipoDocumento.DNI);
		
		Persona pasajero8 = new Persona("Jose", "Valle");
		pasajero8.setNumDocumento(44145678);
		pasajero8.setTipoDocumento(TipoDocumento.DNI);
		/*Fin de creacion de pasajeros*/
		
		/*Crecion de un doctor para un pasaje sanitario*/
		Persona doctor = new Persona("Julio", "Dominguez");
		/*Fin de creacion de doctores*/
		
		/*Bloque de creacion de pilotos, copilotos, auxiliares y seteo de atributos (Linea 48 a 68)*/
		Persona piloto1 = new Persona("Carlos", "Fernandez");
		piloto1.setNumDocumento(40385058);
		piloto1.setTipoDocumento(TipoDocumento.DNI);
		
		Persona piloto2 = new Persona("Fernando", "Tevez");
		piloto2.setNumDocumento(10450001);
		piloto2.setTipoDocumento(TipoDocumento.DNI);
		
		Persona piloto3 = new Persona("Lautaro", "Esquivel");
		piloto3.setNumDocumento(33353997);
		piloto3.setTipoDocumento(TipoDocumento.DNI);
		
		Persona copiloto1 = new Persona("Maria", "Sierra");
		Persona copiloto2 = new Persona("Francisco", "Guzamn");
		Persona copiloto3 = new Persona("Cecilia", "Ferrari");
		
		Persona auxiliar1 = new Persona("Benjamin", "Espinoza");
		Persona auxiliar2 = new Persona("Eduardo","Garcia");
		Persona auxiliar3 = new Persona("Ayelen", "Gimenez");
		Persona auxiliar4 = new Persona("Francesca", "Alfaro");
		Persona auxiliar5 = new Persona("Osvaldo", "Jaramillo");
		/*Fin de creacion de pilotos, copilotos y auxiliares*/
		
		
		/*Bloque de creacion de aviones de tipo larga distancia, corta distancia, sanitario y seteo de tributos (Linea 73 a 102)*/
		AvionLargaDistancia avion1 = new AvionLargaDistancia();
		avion1.setCapacidadCombustible(2000);
		avion1.setCapacidadMaxima(8);
		avion1.setHorasDeVuelo(0);
		avion1.setRadarAcercamiento(true);
		
		AvionLargaDistancia avion2 = new AvionLargaDistancia();
		avion2.setCapacidadCombustible(2500);
		avion2.setCapacidadMaxima(7);
		avion2.setHorasDeVuelo(0);
		avion2.setRadarAcercamiento(false);
		
		AvionCortaDistancia avion3 = new AvionCortaDistancia();
		avion3.setCapacidadCombustible(1500);
		avion3.setCapacidadMaxima(4);
		avion3.setHorasDeVuelo(0);
		avion3.setTipoMotor(TipoMotor.TURBINA);
		
		AvionCortaDistancia avion4 = new AvionCortaDistancia();
		avion4.setCapacidadCombustible(1000);
		avion4.setCapacidadMaxima(5);
		avion4.setHorasDeVuelo(0);
		avion4.setTipoMotor(TipoMotor.HELICE);
		
		AvionSanitario avion5 = new AvionSanitario();
		avion5.setCapacidadCombustible(1500);
		avion5.setCapacidadMaxima(3);
		avion5.setHorasDeVuelo(0);
		avion5.setDescripcionEquipamiento("Respirador y suero");
		avion5.setTipoMotor(TipoMotor.TURBINA);
		/*Fin de creacion de aviones*/
		
		/*Bloque de creacion de empresasa y seteo de atributos (Linea 106 a 119)*/
		Empresa empresa1 = new Empresa();
		empresa1.setNombreComercial("Aerolineas Argentina");
		empresa1.setCuit(8453148);
		empresa1.setRazonSocial("");
		empresa1.agregarAvion(avion1);
		empresa1.agregarAvion(avion2);
		empresa1.agregarAvion(avion3);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNombreComercial("Turkish Airlines");
		empresa2.setCuit(435098);
		empresa2.setRazonSocial("");
		empresa2.agregarAvion(avion4);
		empresa2.agregarAvion(avion5);
		/*Fin de creacion de empresas*/
		
		/*Bloque de creacion de pasajes y seteo de atributos (Linea 123 a 154)*/
		Pasaje pasaje1 = new Pasaje();
		pasaje1.setNumAsiento(1);
		pasaje1.setPasajero(pasajero1);
		
		Pasaje pasaje2 = new Pasaje();
		pasaje2.setNumAsiento(2);
		pasaje2.setPasajero(pasajero2);
		
		Pasaje pasaje3 = new Pasaje();
		pasaje3.setNumAsiento(3);
		pasaje3.setPasajero(pasajero3);
		
		Pasaje pasaje4 = new Pasaje();
		pasaje4.setNumAsiento(4);
		pasaje4.setPasajero(pasajero4);
		
		Pasaje pasaje5 = new Pasaje();
		pasaje5.setNumAsiento(5);
		pasaje5.setPasajero(pasajero5);
		
		Pasaje pasaje6 = new Pasaje();
		pasaje6.setNumAsiento(6);
		pasaje6.setPasajero(pasajero6);
		
		PasajeSanitario pasaje7 = new PasajeSanitario();
		pasaje7.setNumAsiento(7);
		pasaje7.setPasajero(pasajero7);
		pasaje7.setDoctor(doctor);
		
		Pasaje pasaje8 = new Pasaje();
		pasaje8.setNumAsiento(8);
		pasaje8.setPasajero(pasajero8);
		/*Fin de creacion de pasajes*/
		
		/*Bloque de creacion de vuelos y seteo de atributos (Linea 158 a 212)*/
		Vuelo vuelo1 = new Vuelo("Berlin", "Paris");
		vuelo1.setEmpresa(empresa1);
		vuelo1.setAvion(avion1);
		vuelo1.setPiloto(piloto1);
		vuelo1.setCopiloto(copiloto1);
		vuelo1.agregarAuxiliares(auxiliar1);
		vuelo1.agregarAuxiliares(auxiliar2);
		vuelo1.registrarPasajero(pasaje1);
		vuelo1.registrarPasajero(pasaje2);
		vuelo1.registrarPasajero(pasaje3);
		
		
		Vuelo vuelo2 = new Vuelo("Bogota", "Quito");
		vuelo2.setEmpresa(empresa1);
		vuelo2.setAvion(avion2);
		vuelo2.setPiloto(piloto2);
		vuelo2.setCopiloto(copiloto2);
		vuelo2.agregarAuxiliares(auxiliar3);
		vuelo2.agregarAuxiliares(auxiliar4);
		vuelo2.registrarPasajero(pasaje2);
		vuelo2.registrarPasajero(pasaje5);
		
		
		Vuelo vuelo3 = new Vuelo("Roma", "Buenos Aires");
		vuelo3.setEmpresa(empresa1);
		vuelo3.setAvion(avion3);
		vuelo3.setPiloto(piloto3);
		vuelo3.setCopiloto(copiloto3);
		vuelo3.agregarAuxiliares(auxiliar1);
		vuelo3.agregarAuxiliares(auxiliar5);
		vuelo3.registrarPasajero(pasaje8);
		vuelo3.registrarPasajero(pasaje6);
		
		Vuelo vuelo4 = new Vuelo("Berlin", "Tokio");
		vuelo4.setEmpresa(empresa2);
		vuelo4.setAvion(avion4);
		vuelo4.setPiloto(piloto2);
		vuelo4.setCopiloto(copiloto2);
		vuelo4.agregarAuxiliares(auxiliar3);
		vuelo4.agregarAuxiliares(auxiliar4);
		vuelo4.registrarPasajero(pasaje1);
		vuelo4.registrarPasajero(pasaje2);
		vuelo4.registrarPasajero(pasaje3);
		vuelo4.registrarPasajero(pasaje4);
		vuelo4.registrarPasajero(pasaje5);
		
		
		Vuelo vueloSanitario = new Vuelo("Madrid", "Moscu");
		vueloSanitario.setEmpresa(empresa2);
		vueloSanitario.setAvion(avion5);
		vueloSanitario.setPiloto(piloto1);
		vueloSanitario.setCopiloto(copiloto3);
		vueloSanitario.agregarAuxiliares(auxiliar2);
		vueloSanitario.agregarAuxiliares(auxiliar5); 
		vueloSanitario.registrarPasajero(pasaje7);
		/*Fin de creacion de vuelos*/
		
		/*Creacion de lista de vuelos y carga de vuelos (Linea 216 a 221)*/
		ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
		vuelos.add(vuelo1);
		vuelos.add(vuelo2);
		vuelos.add(vuelo3);
		vuelos.add(vuelo4);
		vuelos.add(vueloSanitario);
		
		/*Impresion de datos de los vuelos (Linea 224 a 236)*/
		for(Vuelo vuelo : vuelos) {
			System.out.println(String.format("Vuelo de %s a %s ", vuelo.getOrigen(), vuelo.getDestino()));
			System.out.println(String.format("Empresa: %s", vuelo.getEmpresa().getNombreComercial()));
			System.out.println(String.format("Avion: %s", vuelo.getAvion().getPatente()));
			System.out.println("Pasajeros:");
			System.out.println("");
			for(Pasaje pasaje : vuelo.getPasajeros()) {
				System.out.println(String.format("Nombre y Apellido: %s", pasaje.getPasajero().toString()));
				System.out.println(String.format("DNI: %d", pasaje.getPasajero().getNumDocumento()));
				System.out.println("");
			}
			System.out.println("--------------------------------------------------------------------");
		}
		/*******************FIN DEL PROGRAMA*********************/
	}

}
