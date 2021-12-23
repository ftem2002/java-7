package halakat;

public class random
{

	public static void main(String[] args)
	{
int max , min , k , i , range ;
		
		max = 9000 ;
		min = 100 ;
		range = max - min + 1 ;
		for(i = 1 ; i<=10 ; i=i+1 )
		{
		k = (int)(Math.random()*range)+min;
		System.out.print( k + "  ");
		}
	}

}
