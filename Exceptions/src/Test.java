
public class Test 
{

	public static void main(String[] args) 
	{
		int j = 20, i = 0;
		try
		{
			System.out.println(j/i);
		}
		catch (ArithmeticException e)
		{
			System.out.println("ERREUR : " + e.getMessage());
		}
	}

}
