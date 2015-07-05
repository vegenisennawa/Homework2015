/*
 * Juana Paulina Águila Hernández
 * Tarea de propedéutico
 * Clase para ejecutar las pruebas
 */

package Principal;

import java.util.Scanner;
import MyString.RecString;
import Principal.Matrix;
import Principal.AverageTimeChainArray;
import MyStack.MyScratchStack;

public class TestZone
{
	public static void main(String [] args)
	{
		
		int mb = 1024 * 1024, noEjecuciones = 10, dato, longMuestra = 10; 
		long tiempoInicial, tiempoFinal, tiempoTotal;
		float tiempoPromedio = 0;
		String entrada;
		
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
		
		
		System.out.println ("Por favor introduzca una opción:");
		System.out.println ("1 - : StrLen");
		System.out.println ("2 - : chain representation");
		System.out.println ("3 - : lower triangular matrix");
		System.out.println ("4 - : Stack");
		
        Scanner entradaEscaner = new Scanner (System.in); 
        
        entrada = entradaEscaner.next(); 
          
        while(!"1".equals(entrada) && !"2".equals(entrada) && !"3".equals(entrada) && !"4".equals(entrada))
        {
        	System.out.println ("Opción no válida. \nPor favor introduzca una opción:");
    		System.out.println ("1 - : StrLen");
    		System.out.println ("2 - : chain representation");
    		System.out.println ("3 - : lower triangular matrix");
    		System.out.println ("4 - : Stack");
    	
    		entrada = entradaEscaner.next(); 
        }
          
        if("1".equals(entrada))
        {
        	/*
    		 * Bloque para ejercicio 1
    		 */
    		
    		System.out.println("**** Ejercicio 1: StrLen");
    		
    		//Se genera la muestra según la longitud dada
    		longMuestra = 10;
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
    		
        }
        if("2".equals(entrada))
        {
        	/*
    		 * Bloque para ejercicio 2
    		 */
    		
    		System.out.print("**** Ejercicio 2: chain representation \n");
    		//Se crea la lista
    		System.out.print("*** Número de inserciones: " + noEjecuciones + "\n");
    		System.out.print("*** Se crea la lista \n");
    		tiempoInicial = System.currentTimeMillis(); 
    		AverageTimeChainArray chain = new AverageTimeChainArray(); 
    		tiempoFinal = System.currentTimeMillis(); 
    		tiempoTotal = tiempoFinal - tiempoInicial;
    		System.out.print("*** Tiempo total en milisegundos: " + (float)tiempoTotal + "\n");
    		
    		System.out.print("Se agregan elementos a la lista \n");
    		//Se agregan n elementos a la lista
    		for(int index=0; index<noEjecuciones; index++)
    		{
    			dato = (int)(Math.random()*10); 
    			tiempoInicial = System.currentTimeMillis(); 
    			chain.add(index, dato);
    			tiempoFinal = System.currentTimeMillis(); 
    			tiempoTotal = tiempoFinal - tiempoInicial;
    			tiempoPromedio = tiempoPromedio + tiempoTotal;
    		}
    		tiempoPromedio = tiempoPromedio / (float)noEjecuciones;
    		System.out.println("*** Tiempo Promedio para "+noEjecuciones+" inserciones: " + tiempoPromedio + "\n");
    		
    		tiempoPromedio = 0;
    		System.out.print("Se eliminan elementos de la lista \n");
    		//Se remueven elementos
    		//Si n es 1 o 10, se mantiene ese número
    		//Si no, se divide entre 10
    		if(noEjecuciones > 10)
    		{
    			noEjecuciones = noEjecuciones/10;
    		}
    		
    		for(int index=0; index<noEjecuciones; index++)
    		{
    			dato = (int)(Math.random()*10); 
    			tiempoInicial = System.currentTimeMillis(); 
    			dato = chain.remove(dato);
    			tiempoFinal = System.currentTimeMillis(); 
    			tiempoTotal = tiempoFinal - tiempoInicial;
    			tiempoPromedio = tiempoPromedio + tiempoTotal;
    		}
    		
    		System.out.println("*** Tiempo Promedio para "+noEjecuciones+" eliminaciones: " + tiempoPromedio + "\n");
        }
        if("3".equals(entrada))
        {
        	/*
    		 * Bloque para ejercicio 3
    		 */
    		
    		System.out.print("**** Ejercicio 3: lower triangular matrix \n");
    		//Se crea la lista
    		System.out.print("*** Tamaño usado para la matriz: " + noEjecuciones + "\n");
    		System.out.print("*** Se crea la matriz \n");
    		tiempoInicial = System.currentTimeMillis(); 
    		Matrix matriz = new Matrix(noEjecuciones);
    		tiempoFinal = System.currentTimeMillis(); 
    		tiempoTotal = tiempoFinal - tiempoInicial;
    		System.out.print("*** Tiempo total en milisegundos: " + (float)tiempoTotal + "\n");
            System.out.print("*** Se colocan datos en la matriz\n");
    		
    		//Se determinan un número de muestras a insertar
    		//Se agregaran n(n+1)/2 elementos del 1 al 9 para la matriz, y se generarán aleatoriamente los datos
    	
            int i, j;
            
    		for(int index=0; index<noEjecuciones; index++)
    		{
    			dato = (int)(Math.random()*10); 
    			i = (int)(Math.random()*noEjecuciones); 
    			j= (int)(Math.random()*noEjecuciones); 
    			tiempoInicial = System.currentTimeMillis(); 
    			matriz.add(i, j, dato);
    			tiempoFinal = System.currentTimeMillis(); 
    			tiempoTotal = tiempoFinal - tiempoInicial;
    			tiempoPromedio = tiempoPromedio + tiempoTotal;
    		}
    		
    		tiempoPromedio = tiempoPromedio / (float)noEjecuciones;
    		System.out.println("*** Tiempo Promedio para "+noEjecuciones+" inserciones: " + tiempoPromedio + "\n");
    		
    		tiempoPromedio = 0;
    		System.out.print("Se obtienen elementos de la matriz \n");
    		
    		//Se retornan n/10 datos de la matriz
    		for(int index=0; index<noEjecuciones; index++)
    		{ 
    			i = (int)(Math.random()*noEjecuciones); 
    			j= (int)(Math.random()*noEjecuciones); 
    			tiempoInicial = System.currentTimeMillis(); 
    			matriz.get(i, j);
    			tiempoFinal = System.currentTimeMillis(); 
    			tiempoTotal = tiempoFinal - tiempoInicial;
    			tiempoPromedio = tiempoPromedio + tiempoTotal;
    		}
    		
    		tiempoPromedio = tiempoPromedio / (float)noEjecuciones;
    		System.out.println("*** Tiempo Promedio para "+noEjecuciones+" lecturas: " + tiempoPromedio + "\n");
    		
    		tiempoPromedio = 0;
    		System.out.print("*** Se eliminan elementos de la matriz \n");
    		
    		//Se borran n/10 datos de la matriz
    		for(int index=0; index<noEjecuciones; index++)
    		{ 
    			i = (int)(Math.random()*noEjecuciones); 
    			j= (int)(Math.random()*noEjecuciones); 
    			tiempoInicial = System.currentTimeMillis(); 
    			matriz.remove(i, j);
    			tiempoFinal = System.currentTimeMillis(); 
    			tiempoTotal = tiempoFinal - tiempoInicial;
    			tiempoPromedio = tiempoPromedio + tiempoTotal;
    		}
    		
    		tiempoPromedio = tiempoPromedio / (float)noEjecuciones;
    		System.out.println("*** Tiempo Promedio para "+noEjecuciones+" eliminaciones: " + tiempoPromedio + "\n");
    		
    		tiempoPromedio = 0;
    		System.out.print("*** Se muestra la matriz \n");
    		 
    		//Se muestran datos de la matriz
    		tiempoInicial = System.currentTimeMillis(); 
    		matriz.output();
    		tiempoFinal = System.currentTimeMillis(); 
    		tiempoTotal = tiempoFinal - tiempoInicial;
    		System.out.println("*** Tiempo total en milisegundos: " + (float)tiempoTotal + "\n");
    
        }
        if("4".equals(entrada))
        {
        	/*
    		 * Bloque para ejercicio 4
    		 */
    		
    		System.out.print("**** Ejercicio 4: Stack \n");
    		//Se crea la pila
    		System.out.print("*** Tamaño usado para la pila: " + noEjecuciones + "\n");
    		MyScratchStack pila = new MyScratchStack();
    	
    		System.out.print("*** Se agregan elementos a la pila \n");
    		
    		//Se ingresan n datos a la pila
    		for(int index=0; index<noEjecuciones; index++)
    		{ 
    			dato = (int)(Math.random()*10); 
    			System.out.println("*** Dato: "+ dato);
    			tiempoInicial = System.currentTimeMillis(); 
    			pila.push(dato);
    			tiempoFinal = System.currentTimeMillis(); 
    			tiempoTotal = tiempoFinal - tiempoInicial;
    			tiempoPromedio = tiempoPromedio + tiempoTotal;
    		}
    		
    		tiempoPromedio = tiempoPromedio / (float)noEjecuciones;
    		System.out.println("*** Tiempo Promedio para "+noEjecuciones+" inserciones: " + tiempoPromedio + "\n");
    		
    		tiempoPromedio = 0;
    		
    		System.out.print("*** Se muestra último valor: "+pila.peek()+"\n");
    		
    		//Se eliminan n datos a la pila
    		for(int index=0; index<noEjecuciones; index++)
    		{ 
    			tiempoInicial = System.currentTimeMillis(); 
    			System.out.println("*** Dato: "+pila.pop());
    			tiempoFinal = System.currentTimeMillis(); 
    			tiempoTotal = tiempoFinal - tiempoInicial;
    			tiempoPromedio = tiempoPromedio + tiempoTotal;
    		}
    				
    		tiempoPromedio = tiempoPromedio / (float)noEjecuciones;
    		System.out.println("*** Tiempo Promedio para "+noEjecuciones+" eliminaciones: " + tiempoPromedio + "\n");
        }
	
	}
	
}