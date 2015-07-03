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
	int ChainSize;
	
	public AverageTimeChainArray()
	{
		this.Inicial = null;
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
	
	public void add(int index, int valor)
	{
		if(isEmpty())
		{
			
			ChainNode newNode = new ChainNode(valor, null, index);
			Inicial = newNode;
			Inicial.Next = null;
			ChainSize++;
		}
		else
		{
			
			ChainNode tempNode = Inicial;
		
			while(tempNode.Next !=null && tempNode.Next.index < index)
			{
				tempNode = tempNode.Next;
			}
			
			if(tempNode.index != index)
			{
				
				if(tempNode.Next == null)
				{
					
					ChainNode newNode = new ChainNode(valor, null, index);
					tempNode.Next = newNode;
					ChainSize++;
				}
				else
				{
					
					ChainNode newNode = new ChainNode(valor, tempNode.Next, index);
					tempNode.Next = newNode;
					ChainSize++;
					
				}
			}
		}
	}
	
	public int remove(int index)
	{
		if(!isEmpty())
		{
			ChainNode tempNode = Inicial;
			
			if(this.ChainSize == 1)
			{
				//Se ve si el primer índice es el usado
				if(tempNode.index == index)
				{
					Inicial = Inicial.Next;
					tempNode.Next = null;
					this.ChainSize--;
					return tempNode.Valor;
				}
				else
				{
					return -1;
				}
			}
			else
			{
				ChainNode afterNode = tempNode.Next;
				
				while(tempNode.Next.index != index && afterNode.Next !=null )
				{
					tempNode = afterNode;
					afterNode = afterNode.Next;
				}
				
				
				if(afterNode.index == index)
				{
					if(afterNode.Next == null)
					{
						tempNode.Next= null;
						this.ChainSize--;
						return afterNode.Valor;
					}
					else
					{
						tempNode.Next = afterNode.Next;
						afterNode.Next = null;
						this.ChainSize--;
						return afterNode.Valor;
						
					}
					
				}
				else
				{
					return -1;
				}
			}
			
		}
		else
		{
			return -1;
		}
		
		
	}
	
	public int get(int index)
	{
		
		if(!isEmpty())
		{
			
			ChainNode tempNode = Inicial;
			
			if(tempNode.index == index)
			{
				return tempNode.Valor;
			}
			else
			{
				while(tempNode.Next !=null && tempNode.Next.index != index)
				{
					tempNode = tempNode.Next;
				}
				
				if(tempNode.Next != null)
				{
					return tempNode.Next.Valor;
				}
				else
				{
					return -1;
				}

			}
		}
		else
		{
			return -1;
		}
		
	}
	
	public void recorrer()
	{
		
		if(!isEmpty())
		{
			ChainNode tempNode = Inicial;
			
			while(tempNode.Next != null)
			{
				System.out.println(tempNode.index + " " + tempNode.Valor);
				tempNode = tempNode.Next;
			}
			System.out.println(tempNode.index + " " + tempNode.Valor);
		}
		
	}

}

