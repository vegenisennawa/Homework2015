package Principal;

public class ChainNode
{
	int Valor;
	ChainNode Next;
	int index;
	
	public ChainNode(int Valor, ChainNode Next, int index)
	{
		this.Valor = Valor;
		this.Next = Next;
		this.index = index;
	}
}