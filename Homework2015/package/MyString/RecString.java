/*
 * Juana Paulina Águila Hernández
 * Tarea de propedéutico
 * Clase que contiene el ejercicio 1.
 */

package MyString;

public class RecString
{	
	//Método para recorrer una cadena de manera recursiva
	public static int StrLen(int index, String cadena)
	{
		//Se comprueba si el iterador está al final de la cadena. Si el iterador es igual
		//a la longitud de la cadena, regresa el index.
		if(index < cadena.length()) //1
		{
			return StrLen(++index, cadena); //n-1
		}
		else if(index > cadena.length()) //Si desde un principio es mayor el iterador ingresado a la función
		{								 //manda un valor de -1 como valor de error.
			index = -1;
		}
		return index;
	}
}