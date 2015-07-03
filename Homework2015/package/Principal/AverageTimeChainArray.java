/*
 * Juana Paulina Águila Hernández
 * Tarea de propedéutico
 * Esta clase tiene la finalidad de realizar las pruebas de cada ejercicio propuesto.
 */

package Principal;
import Principal.ChainNode;

public class AverageTimeChainArray
{
	ChainNode Inicial;
	//ChainNode Final;
	int ChainSize;
	
	public AverageTimeChainArray()
	{
		this.Inicial = null;
		//this.Final = null;
		this.ChainSize = 0;
	}
	
	public boolean isEmpty()
	{
		return this.ChainSize == 0;
	}
	
	public int Size()
	{
		return this.ChainSize;
	}
	
	public String get(int index)
	{
		if(this.ChainSize != 0)
		{
			ChainNode tempNode = Inicial;
			tempNode = tempNode.Next;
			return "";
		}
		else
			return "No hay nada";
		
	}
}

