/*
 * Juana Paulina Águila Hernández
 * Tarea de propedéutico
 * Clase para ejecutar las pruebas
 */

package Principal;

import MyString.RecString;

public class TestZone
{
	public static void main(String [] args)
	{
		
		int mb = 1024 * 1024, noEjecuciones = 10; 
		long tiempoInicial, tiempoFinal, tiempoTotal;
		float tiempoPromedio = 0;
		
		/*
		 * Bloque para iniciar las pruebas
		 */
	
		System.out.println("***** Clase para pruebas de java *****\n");
		
		Runtime instance = Runtime.getRuntime();
 
		System.out.println("**** Estadísticas de la utilización del Heap (MB) ****\n");
		
		System.out.println("Versión de java utilizado: " + System.getProperty("java.runtime.version"));
		System.out.println("Memoria disponible: " + instance.totalMemory() / mb);
		System.out.println("Memoria libre: " + instance.freeMemory() / mb);
		System.out.println("Memoria usada: " + (instance.totalMemory() - instance.freeMemory()) / mb);
		System.out.println("Memoria máxima disponible: " + instance.maxMemory() / mb);
		System.out.println();
		/*
		 * Bloque para ejercicio 1
		 */
		
		System.out.println("**** Ejercicio 1: StrLen");
		
		//Se genera la muestra según la longitud dada
		int longMuestra = 1;
		StringBuilder sb = new StringBuilder("a");
		for (int i = 0; i < longMuestra-1; i++) {
		     sb.append("a");
		}
		String cadena = sb.toString();
		System.out.print("*** Cadena de prueba: " + cadena + "\n");
		System.out.print("*** Número de ejecuciones: " + noEjecuciones + "\n");
		
		//Se ejecuta la prueba
		for(int i=0; i<noEjecuciones; i++)
		{
			tiempoInicial = System.currentTimeMillis();
			RecString.StrLen(0,cadena);
			tiempoFinal = System.currentTimeMillis(); 
			tiempoTotal = tiempoFinal - tiempoInicial;
			tiempoPromedio = ((float) tiempoPromedio) + tiempoTotal;
		}
		
		tiempoPromedio = tiempoPromedio / (float)noEjecuciones;
		System.out.print("*** Tiempo Promedio: " + tiempoPromedio + "\n");
		
		/*
		 * Bloque para ejercicio 2
		 */
		
		/*
		 * Bloque para ejercicio 3
		 */
		
		/*
		 * Bloque para ejercicio 4
		 */
		
		/*
		 * Bloque para ejercicio 5
		 */
	}
}