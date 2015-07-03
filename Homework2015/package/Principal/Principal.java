/*
 * Juana Paulina Águila Hernández
 * Tarea de propedéutico
 * Esta clase tiene la finalidad de realizar las pruebas de cada ejercicio propuesto.
 */

package Principal; 
import java.lang.String;
import MyString.RecString;
import Principal.Matrix;
import Principal.AverageTimeChainArray;


public class Principal
{
	public static void main(String [] args)
	{
		
		//Clase para pruebas
		int mb = 1024 * 1024; 
		long tiempoInicial, tiempoFinal, tiempoTotal;
		int multiplicador = 9922, n=10000, dato, i, j;
		int noDatos = n*(n+1)/2;
		int[] datos;
		
		System.out.println("***** Clase para pruebas de java *****\n");
		
		System.out.println("Versión de java utilizado: " + System.getProperty("java.runtime.version"));
	
		Runtime instance = Runtime.getRuntime();
 
		System.out.println("**** Estadísticas de la utilización del Heap (MB) ****\n");
 
		System.out.println("Memoria disponible: " + instance.totalMemory() / mb);
		System.out.println("Memoria libre: " + instance.freeMemory() / mb);
		System.out.println("Memoria usada: " + (instance.totalMemory() - instance.freeMemory()) / mb);
		System.out.println("Memoria máxima disponible: " + instance.maxMemory() / mb);
		
		//Primera prueba: recursión de la cadena
		
		/*System.out.print("Prueba: StrLen \n");
		StringBuilder sb = new StringBuilder("a");
		for (int i = 0; i < multiplicador-1; i++) {
		     sb.append("a");
		}
		String cadena = sb.toString();
		System.out.print("Cadena de prueba: " + cadena + "\n");
		tiempoInicial = System.currentTimeMillis(); 
		System.out.print("Resultado de prueba: " + RecString.StrLen(0,cadena) + "\n");
		tiempoFinal = System.currentTimeMillis(); 
		tiempoTotal = tiempoFinal - tiempoInicial;
		System.out.print("Tiempo total en milisegundos: " + tiempoTotal + "\n");*/
		
		//Tercera prueba: matriz triangular inferior
		System.out.print("Prueba: matriz triangular inferior \n");
		System.out.print("Longitud de prueba: " + n + "\n");
		System.out.print("Se inicializa la matriz\n");
		tiempoInicial = System.currentTimeMillis(); 
		Matrix matriz = new Matrix(n);
		tiempoFinal = System.currentTimeMillis(); 
		tiempoTotal = tiempoFinal - tiempoInicial;
		System.out.println("Tiempo total en milisegundos: " + tiempoTotal + "\n");
		
		System.out.println();
		
		System.out.print("Se colocan datos en la matriz\n");
		
		//Se determinan un número de muestras a insertar
		//Se agregaran n(n+1)/2 elementos del 1 al 9 para la matriz, y se generarán aleatoriamente los datos
	
		for(int index=0; index<noDatos; index++)
		{
			dato = (int)(Math.random()*10); 
			i = (int)(Math.random()*n); 
			j= (int)(Math.random()*n); 
			tiempoInicial = System.currentTimeMillis(); 
			matriz.add(i, j, dato);
			tiempoFinal = System.currentTimeMillis(); 
			tiempoTotal = tiempoFinal - tiempoInicial;
			System.out.print("Tiempo total en milisegundos en en i: "+i+" y j: "+j+" con valor "+ dato +": "+ tiempoTotal + "\n");
		}
		
		System.out.println();
		
		//Se retornan n datos de la matriz
		for(int index=0; index<n; index++)
		{ 
			i = (int)(Math.random()*n); 
			j= (int)(Math.random()*n); 
			tiempoInicial = System.currentTimeMillis(); 
			System.out.print("valor obtenido en i: "+i+" y j: "+j+": "+matriz.get(i, j));
			tiempoFinal = System.currentTimeMillis(); 
			tiempoTotal = tiempoFinal - tiempoInicial;
			System.out.print(" Tiempo total en milisegundos en dato "+ index +": " + tiempoTotal + "\n");
		}
		
		System.out.println();
		
		//Se borran n datos de la matriz
		for(int index=0; index<n; index++)
		{ 
			i = (int)(Math.random()*n); 
			j= (int)(Math.random()*n); 
			tiempoInicial = System.currentTimeMillis(); 
			System.out.print("valor borrado en i: "+i+" y j: "+j+": "+matriz.remove(i, j));
			tiempoFinal = System.currentTimeMillis(); 
			tiempoTotal = tiempoFinal - tiempoInicial;
			System.out.print(" Tiempo total en milisegundos en dato "+ index +": " + tiempoTotal + "\n");
		}
		
		System.out.println();
		 
		//Se muestran datos de la matriz
		tiempoInicial = System.currentTimeMillis(); 
		matriz.output();
		tiempoFinal = System.currentTimeMillis(); 
		tiempoTotal = tiempoFinal - tiempoInicial;
		System.out.println("Tiempo total en milisegundos: " + tiempoTotal + "\n");
	}
}