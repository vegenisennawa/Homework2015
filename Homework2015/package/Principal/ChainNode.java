package Principal;

public class ChainNode
{
	String Valor;
	ChainNode Next;
	int index;
	
	public ChainNode(String Valor, ChainNode Next, int index)
	{
		this.Valor = Valor;
		this.Next = Next;
		this.index = index;
	}
}