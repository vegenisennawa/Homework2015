/*
 * Para realizar la matriz triangular, la matriz debe de ser de orden n
 */
package Principal;

public class Matrix
{
	
	int[][] Matriz;
	
	//Se inicializa la matriz con el valor que el usuario le proporcione
	public Matrix(int n)
	{
		Matriz = new int[n][n];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				Matriz[i][j] = 0;
			}
		}
	}
	
	public void add(int i, int j, int valor)
	{
		//Se debe comprobar cada tamaño
		if((i>=0 && i<Matriz.length) && (j>=0 && j<Matriz.length))
		{
			if(i>=j)
			{
				if(valor != -1 && valor != 0)
				{
					Matriz[i][j] = valor;
				}
			}
		}
	}
	
	public int get(int i, int j)
	{
		if((i>=0 && i<Matriz.length) && (j>=0 && j<Matriz.length))
		{
			return Matriz[i][j];
		}
		else
			return -1;
	}
	
	public int remove(int i, int j)
	{
		if((i>=0 && i<Matriz.length) && (j>=0 && j<Matriz.length))
		{
			int retorno = get(i, j);
			add(i, j, 0);
			return retorno;
		}
		else
			return -1;
	}
	
	public void output()
	{
		for(int i=0; i<Matriz.length; i++)
		{
			for(int j=0; j<Matriz.length; j++)
			{
				System.out.print(Matriz[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}