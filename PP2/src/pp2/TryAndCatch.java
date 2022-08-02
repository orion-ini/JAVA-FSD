package pp2;
public class TryAndCatch 
{

	public static void main(String[] args) 
	{
		try 
		{
		      int[] universe = {5,13,1};
		      System.out.println(universe[10]);
		    } catch (Exception e) {
		      System.out.println("* Error *");
		 }

	}

}
