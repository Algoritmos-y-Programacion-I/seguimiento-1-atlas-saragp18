/*
* Analisis
* Descripcion del programa:
* Entradas:nombre, edad, documento de identidad, ciudad de origen, medio de transporte, noches que se queda;
* Salidas: total de la compra 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas { 
	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;
    final double COSTO_POR_NOCHE = 150000;
    final double COSTO_POR_SERVICIO = 0.1;
	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        int edad, medioDeTransporte, NochesQueSeQueda;
        String nombre, ciudadOrigen;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        System.out.println("Por favor complete la siguiente informacion: ");
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();
        System.out.println("Bienvenido " + nombre + "!");
        System.out.println("Cual es tu ciudad de origen?");
        ciudadOrigen = escaner.nextLine();
        System.out.println("muy bien tu ciudad de origen es " + ciudadOrigen);
        System.out.println("Cual es tu edad?" + nombre);
        edad = escaner.nextInt();
        System.out.println("Cual es tu medio de transporte?" + nombre);
        medioDeTransporte = escaner.nextInt();
        System.out.println("Cuantas noches te quedaras?" + nombre);
        NochesQueSeQueda= escaner.nextInt();
        
        
        // Declaracion de salidas calculadas (completar)
        double totalTransporte, totalHospedaje;
        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calcularTotalTransporte(); // aqui podrian faltar parametros
	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return 0; // Completar operacion
    }

	

	
}