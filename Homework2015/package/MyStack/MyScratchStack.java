package MyStack;

import MyStack.Stack;

public class MyScratchStack implements Stack
{
	class Nodo
	{
		int valor;
		Nodo inferior;
	}
	
	Nodo Superior;
	
	public MyScratchStack()
	{
		Superior = new Nodo();
		Superior = null;
	}

	public boolean empty() 
	{
		return (this.Superior == null);
	}

	public int peek() {
		
		if(empty())
		{
			return -1;
		}
		else
		{
			return Superior.valor;
		}
		
	}

	public void push(int TheObject) {
		
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.valor = TheObject;
		
		if(empty())
		{
			nuevoNodo.inferior = null;
			Superior = nuevoNodo;
		}
		else
		{
			nuevoNodo.inferior = Superior;
			Superior = nuevoNodo;
		}
	}

	public int pop() {
		
		if(empty())
		{
			return -1;
		}
		else
		{
			int valorSacado = Superior.valor;
			Superior = Superior.inferior;
			return valorSacado;
		}
		
	}
	
}