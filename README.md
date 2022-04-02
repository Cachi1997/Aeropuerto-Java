# Aeropuerto-Java

Este es un programa que simula un aeropuerto, donde el aeropuerto posee distintos tipos de aviones y pasajes.

Se requeria registrar los datos del avion, piloto, pasajero.

Cuando la empresa planea un vuelo, designa un avion, piloto y copiloto, auxiliares a bordo, origen, destino y una lista de pasajes registrados al vuelo

Los aviones pueden ser de larga o corta distancia. Si es de larga distancia se registra si cuenta con radar de acercamiento o no. De los aviones de corta distancia
si es a turbina o hélice y si es un avion sanitario, de ser asi, se registra el equipamiento medico a bordo

De los pasajes se registra un codigo unico y secuencial, numero de asiento y el pasajero. Si se trata de un pasaje sanitario tambien 
se desea conocer el doctor de referencia

Requerimientos:

-Al menos dos constructores (con al menos un parametro) en la clase Avión
-Metodo equals en la clase Vuelo que retorne verdadero si dos vuelos poseen el mismo recorrido
-Metodo toString en la clase Avión que retorne los atributos separados por guión
-Metodo registrarPasaje en la clase vuelo para registrar cada pasajero del vuelo
-Los aviones sanitarios solo pueden aceptar pasajes sanitarios

El proyecto ademas contiene una carpeta doc, con la informacion de cada clase y metodos definidos

Como utilizar el programa:

Abrir Eclipse -> file -> import -> existing projects into workspace -> SELECT ROOT DIRECTORY (browse) -> *select folder* -> finish
