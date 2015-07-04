/*
 * Juana Paulina Águila Hernández
 * Tarea de propedéutico
 * Esta clase tiene la finalidad de realizar las pruebas de cada ejercicio propuesto.
 */

package Principal; 
import java.lang.String;

import Principal.Matrix;
import Principal.AverageTimeChainArray;
import MyStack.MyScratchStack;;


public class Principal
{
	/*public static void main(String [] args)
	{
		
		//Clase para pruebas
		
		
		int multiplicador = 9922, n=10000, dato, eliminar, 
		int noDatos = n*(n+1)/2;
		int[] datos;
		
		
		
		
		
		//Primera prueba: recursión de la cadena
		
		/*
		
		
		 
		
		
		System.out.print("Tiempo total en milisegundos: " + tiempoTotal + "\n");*/
		
		//Segunda prueba: chain representation
		/*System.out.print("Prueba: chain representation \n");
		//Se crea la lista
		tiempoInicial = System.currentTimeMillis(); 
		System.out.print("Se crea la lista \n");
		AverageTimeChainArray chain = new AverageTimeChainArray(); 
		tiempoFinal = System.currentTimeMillis(); 
		tiempoTotal = tiempoFinal - tiempoInicial;
		System.out.print("Tiempo total en milisegundos: " + tiempoTotal + "\n");
		
		System.out.println();
		
		System.out.print("Se agregan elementos a la lista \n");
		//Se agregan n elementos a la lista
		for(int index=0; index<n; index++)
		{
			dato = (int)(Math.random()*10); 
			tiempoInicial = System.currentTimeMillis(); 
			chain.add(index, dato);
			tiempoFinal = System.currentTimeMillis(); 
			tiempoTotal = tiempoFinal - tiempoInicial;
			System.out.print("Tiempo total en milisegundos en en indice: "+index+" y dato: "+ dato +": "+ tiempoTotal + "\n");
			tiempoPromedio = tiempoPromedio + tiempoTotal;
		}
		
		System.out.println();
		
		System.out.print("Se eliminan elementos de la lista \n");
		//Se remueven elementos
		//Si n es 1 o 10, se mantiene ese número
		//Si no, se divide entre 10
		if(n > 10)
		{
			n = n/10;
		}
		for(int index=0; index<n; index++)
		{
			eliminar = (int)(Math.random()*10); 
			tiempoInicial = System.currentTimeMillis(); 
			dato = chain.remove(eliminar);
			tiempoFinal = System.currentTimeMillis(); 
			tiempoTotal = tiempoFinal - tiempoInicial;
			System.out.print("Tiempo total en milisegundos en en indice: "+eliminar+" y dato: "+ dato +": "+ tiempoTotal + "\n");
		}*/
		
		//Tercera prueba: matriz triangular inferior
		/*System.out.print("Prueba: matriz triangular inferior \n");
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
		System.out.println("Tiempo total en milisegundos: " + tiempoTotal + "\n");*/
		
		//Cuarta prueba: Pila
		
		/*MyScratchStack pila = new MyScratchStack();
		
		pila.push(1);
		pila.push(2);
		pila.push(3);
		
		System.out.println("Pila peek "+pila.peek());
		System.out.println("Pila pop "+pila.pop());
		System.out.println("Pila peek "+pila.peek());
		System.out.println("Pila pop "+pila.pop());
		System.out.println("Pila peek "+pila.peek());
		System.out.println("Pila pop "+pila.pop());
		System.out.println("Pila peek "+pila.peek());
	}*/
}